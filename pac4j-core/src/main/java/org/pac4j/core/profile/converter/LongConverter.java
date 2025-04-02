package org.pac4j.core.profile.converter;

/**
 * This class converts a String into a Long or returns the Long (or Integer) in input.
 * 
 * @author Jerome Leleu
 * @since 1.2.0
 */
public final class LongConverter extends AbstractAttributeConverter<Long> {

    public LongConverter() {
        super(Long.class);
    }

    @Override
    protected Long internalConvert(final Object attribute) {
        if (attribute instanceof Integer integer) {
            return Long.valueOf(integer);
        } else if (attribute instanceof String string) {
            return Long.parseLong(string);
        }
        return null;
    }
}
