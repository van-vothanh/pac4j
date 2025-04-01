package org.pac4j.oauth.profile.linkedin2;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.TokenBuffer;

/**
 *
 * @author Vassilis Virvilis
 * @since 3.8.0
 */
public class LinkedIn2ProfilePicture implements Serializable {
    @Serial
    private static final long serialVersionUID = 100L;

    public static class DisplayImageTilde implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;

        public static class Paging implements Serializable {
            @Serial
            private static final long serialVersionUID = 1L;

            private int count;
            private int start;
            private String[] links;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public int getStart() {
                return start;
            }

            public void setStart(int start) {
                this.start = start;
            }

            public String[] getLinks() {
                return deepCopy(links);
            }

            public void setLinks(String[] links) {
                this.links = deepCopy(links);
            }

            @Override
            public String toString() {
                return "{count: %d, start: %d, links.length: %s}".formatted(count, start, Arrays.asList(links));
            }
        }

        public static class Element implements Serializable {
            @Serial
            private static final long serialVersionUID = 1L;

            public static class Data implements Serializable {
                @Serial
                private static final long serialVersionUID = 1L;

                public static class StillImage implements Serializable {
                    @Serial
                    private static final long serialVersionUID = 1L;

                    public static class Size implements Serializable {
                        @Serial
                        private static final long serialVersionUID = 1L;

                        private int width;
                        private int height;

                        public int getWidth() {
                            return width;
                        }

                        public void setWidth(int width) {
                            this.width = width;
                        }

                        public int getHeight() {
                            return height;
                        }

                        public void setHeight(int height) {
                            this.height = height;
                        }

                        protected String getBaseString() {
                            return "width: %d, height: %d".formatted(width, height);
                        }

                        @Override
                        public String toString() {
                            return "{%s}".formatted(getBaseString());
                        }
                    }

                    public static class DisplaySize extends Size implements Serializable {
                        @Serial
                        private static final long serialVersionUID = 1L;

                        private String uom;

                        public String getUom() {
                            return uom;
                        }

                        public void setUom(String uom) {
                            this.uom = uom;
                        }

                        @Override
                        public String toString() {
                            return "{%s, uom: %s}".formatted(getBaseString(), uom);
                        }
                    }

                    public static class AspectRatio implements Serializable {
                        @Serial
                        private static final long serialVersionUID = 1L;

                        private double widthAspect;
                        private double heightAspect;
                        private String formatted;

                        public double getWidthAspect() {
                            return widthAspect;
                        }

                        public void setWidthAspect(double widthAspect) {
                            this.widthAspect = widthAspect;
                        }

                        public double getHeightAspect() {
                            return heightAspect;
                        }

                        public void setHeightAspect(double heightAspect) {
                            this.heightAspect = heightAspect;
                        }

                        public String getFormatted() {
                            return formatted;
                        }

                        public void setFormatted(String formatted) {
                            this.formatted = formatted;
                        }

                        @Override
                        public String toString() {
                            return "{widthAspect: %g, heightAspect: %s, formatted: %s}".formatted(widthAspect, heightAspect,
                                formatted);
                        }
                    }

                    public static class RawCodecSpec implements Serializable {
                        @Serial
                        private static final long serialVersionUID = 1L;

                        private String name;
                        private String type;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        @Override
                        public String toString() {
                            return "{name: %s, type: %s}".formatted(name, type);
                        }
                    }

                    private Size storageSize;
                    private AspectRatio storageAspectRatio;
                    private String mediaType;
                    private RawCodecSpec rawCodecSpec;
                    private DisplaySize displaySize;
                    private AspectRatio displayAspectRatio;

                    public Size getStorageSize() {
                        return storageSize;
                    }

                    public void setStorageSize(Size storageSize) {
                        this.storageSize = storageSize;
                    }

                    public AspectRatio getStorageAspectRatio() {
                        return storageAspectRatio;
                    }

                    public void setStorageAspectRatio(AspectRatio storageAspectRatio) {
                        this.storageAspectRatio = storageAspectRatio;
                    }

                    public String getMediaType() {
                        return mediaType;
                    }

                    public void setMediaType(String mediaType) {
                        this.mediaType = mediaType;
                    }

                    public RawCodecSpec getRawCodecSpec() {
                        return rawCodecSpec;
                    }

                    public void setRawCodecSpec(RawCodecSpec rawCodecSpec) {
                        this.rawCodecSpec = rawCodecSpec;
                    }

                    public DisplaySize getDisplaySize() {
                        return displaySize;
                    }

                    public void setDisplaySize(DisplaySize displaySize) {
                        this.displaySize = displaySize;
                    }

                    public AspectRatio getDisplayAspectRatio() {
                        return displayAspectRatio;
                    }

                    public void setDisplayAspectRatio(AspectRatio displayAspectRatio) {
                        this.displayAspectRatio = displayAspectRatio;
                    }

                    @Override
                    public String toString() {
                        return String.format(
                                "{storageSize: %s, storageAspectRatio: %s, mediaType: %s, rawCodecSpec: %s, "
                                        + "displaySize: %s, displayAspectRatio: %s}",
                                storageSize, storageAspectRatio, mediaType, rawCodecSpec, displaySize, displayAspectRatio);
                    }
                }

                // looks like they forgot to change this one
                // the tilde ~ thingy in the names is worse though.
                @JsonProperty("com.linkedin.digitalmedia.mediaartifact.StillImage")
                private StillImage stillImage;

                public StillImage getStillImage() {
                    return stillImage;
                }

                public void setStillImage(StillImage stillImage) {
                    this.stillImage = stillImage;
                }

                @Override
                public String toString() {
                    return "{stillImage: %s}".formatted(stillImage);
                }
            }

            public static class Identifier implements Serializable {
                @Serial
                private static final long serialVersionUID = 1L;

                private String identifier;
                private String file;
                private int index;
                private String mediaType;
                private String identifierType;
                private int identifierExpiresInSeconds;

                public String getIdentifier() {
                    return identifier;
                }

                public void setIdentifier(String identifier) {
                    this.identifier = identifier;
                }

                public String getFile() {
                    return file;
                }

                public void setFile(String file) {
                    this.file = file;
                }

                public int getIndex() {
                    return index;
                }

                public void setIndex(int index) {
                    this.index = index;
                }

                public String getMediaType() {
                    return mediaType;
                }

                public void setMediaType(String mediaType) {
                    this.mediaType = mediaType;
                }

                public String getIdentifierType() {
                    return identifierType;
                }

                public void setIdentifierType(String identifierType) {
                    this.identifierType = identifierType;
                }

                public int getIdentifierExpiresInSeconds() {
                    return identifierExpiresInSeconds;
                }

                public void setIdentifierExpiresInSeconds(int identifierExpiresInSeconds) {
                    this.identifierExpiresInSeconds = identifierExpiresInSeconds;
                }

                @Override
                public String toString() {
                    return "{identifier: %s, file: %s, index: %d, mediaType: %s, identifierType: %s, identifierExpiresInSeconds: %d}".formatted(
                        identifier, file, index, mediaType, identifierType, identifierExpiresInSeconds);
                }
            }

            private String artifact;
            private String authorizationMethod;
            private Data data;
            private Identifier[] identifiers;

            public String getArtifact() {
                return artifact;
            }

            public void setArtifact(String artifact) {
                this.artifact = artifact;
            }

            public String getAuthorizationMethod() {
                return authorizationMethod;
            }

            public void setAuthorizationMethod(String authorizationMethod) {
                this.authorizationMethod = authorizationMethod;
            }

            public Data getData() {
                return data;
            }

            public void setData(Data data) {
                this.data = data;
            }

            public Identifier[] getIdentifiers() {
                return deepCopy(identifiers);
            }

            public void setIdentifiers(Identifier[] identifiers) {
                this.identifiers = deepCopy(identifiers);
            }

            @Override
            public String toString() {
                return "{artifact: %s, authorizationMethod: %s, data: %s, identifiers: %s}".formatted(artifact, authorizationMethod,
                    data, Arrays.asList(identifiers));
            }
        }

        private Paging paging;
        private Element[] elements;

        public Paging getPaging() {
            return paging;
        }

        public void setPaging(Paging paging) {
            this.paging = paging;
        }

        public Element[] getElements() {
            return deepCopy(elements);
        }

        public void setElements(Element[] elements) {
            this.elements = deepCopy(elements);
        }

        @Override
        public String toString() {
            return "{paging: %s, elements: %s}".formatted(paging, Arrays.asList(elements));
        }
    }

    private String displayImage;
    @JsonProperty("displayImage~")
    private DisplayImageTilde displayImageTilde;

    public String getDisplayImage() {
        return displayImage;
    }

    public void setDisplayImage(String displayImage) {
        this.displayImage = displayImage;
    }

    public DisplayImageTilde getDisplayImageTilde() {
        return displayImageTilde;
    }

    public void setDisplayImageTilde(DisplayImageTilde displayImageTilde) {
        this.displayImageTilde = displayImageTilde;
    }

    @Override
    public String toString() {
        return "{displayImage: %s, displayImage~: %s}".formatted(displayImage, displayImageTilde);
    }

    public static <T> T[] deepCopy(T[] array) {
        final ObjectMapper mapper = new ObjectMapper();
        // per https://stackoverflow.com/questions/6349421/how-to-use-jackson-to-deserialise-an-array-of-objects
        // per https://stackoverflow.com/questions/49903859/deep-copy-using-jackson-string-or-jsonnode
        final TokenBuffer tb = new TokenBuffer(mapper, false);
        try {
            mapper.writeValue(tb, array);
            return (T[]) mapper.readValue(tb.asParser(), array.getClass());
        } catch (IOException e) {
            return null;
        }
    }
}
