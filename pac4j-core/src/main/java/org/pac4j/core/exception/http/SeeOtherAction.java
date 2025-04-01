package org.pac4j.core.exception.http;

import org.pac4j.core.context.HttpConstants;

import java.io.Serial;

/**
 * A "See Other" HTTP action.
 *
 * @author Jerome Leleu
 * @since 4.0.0
 */
public class SeeOtherAction extends RedirectionAction implements WithLocationAction {

    @Serial
    private static final long serialVersionUID = 6749123580877847389L;
    private final String location;

    public SeeOtherAction(final String location) {
        super(HttpConstants.SEE_OTHER);
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
