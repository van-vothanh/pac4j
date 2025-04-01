package org.pac4j.core.exception.http;

import org.pac4j.core.context.HttpConstants;

import java.io.Serial;

/**
 * A bad request action.
 *
 * @author Jerome Leleu
 * @since 4.0.0
 */
public class BadRequestAction extends HttpAction {

    public static final BadRequestAction INSTANCE = new BadRequestAction();
    @Serial
    private static final long serialVersionUID = 9190468211708168035L;

    protected BadRequestAction() {
        super(HttpConstants.BAD_REQUEST);
    }
}
