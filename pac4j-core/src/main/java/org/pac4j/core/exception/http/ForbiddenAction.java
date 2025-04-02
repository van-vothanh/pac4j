package org.pac4j.core.exception.http;

import org.pac4j.core.context.HttpConstants;

import java.io.Serial;

/**
 * A forbidden HTTP action.
 *
 * @author Jerome Leleu
 * @since 4.0.0
 */
public class ForbiddenAction extends HttpAction {

    public static final ForbiddenAction INSTANCE = new ForbiddenAction();
    @Serial
    private static final long serialVersionUID = 6661068865264199225L;

    protected ForbiddenAction() {
        super(HttpConstants.FORBIDDEN);
    }
}
