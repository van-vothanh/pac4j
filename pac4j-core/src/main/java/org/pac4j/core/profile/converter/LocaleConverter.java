package org.pac4j.core.profile.converter;

import java.util.Locale;

/**
 * This class converts a String to a Locale.
 * 
 * @author Jerome Leleu
 * @since 1.0.0
 */
public final class LocaleConverter extends AbstractAttributeConverter<Locale> {

    public LocaleConverter() {
        super(Locale.class);
    }

    @Override
    protected Locale internalConvert(final Object attribute) {
        if (attribute instanceof String string) {
            final String s = string.replaceAll("-", "_");
            final String[] parts = s.split("_");
            final int length = parts.length;
            if (length == 2) {
                return Locale.of(parts[0], parts[1]);
            } else if (length == 1) {
                return Locale.of(parts[0]);
            }
        }
        return null;
    }
}
