package org.pac4j.core.exception.http;

import org.pac4j.core.context.HttpConstants;

import java.io.Serial;

/**
 * A "Found" HTTP action.
 *
 * @author Jerome Leleu
 * @since 4.0.0
 */
public class FoundAction extends RedirectionAction implements WithLocationAction {

    @Serial
    private static final long serialVersionUID = 5155686595276189592L;
    private final String location;

    public FoundAction(final String location) {
        super(HttpConstants.FOUND);
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }
}
