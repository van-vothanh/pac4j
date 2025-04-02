package org.pac4j.core.exception.http;

import org.pac4j.core.context.HttpConstants;

import java.io.Serial;

/**
 * A no content HTTP action.
 *
 * @author Jerome Leleu
 * @since 4.0.0
 */
public class NoContentAction extends HttpAction implements WithContentAction {

    public static final NoContentAction INSTANCE = new NoContentAction();
    @Serial
    private static final long serialVersionUID = 7441277744489210027L;

    protected NoContentAction() {
        super(HttpConstants.NO_CONTENT);
    }

    @Override
    public String getContent() {
        return "";
    }
}
