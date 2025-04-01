package org.pac4j.core.exception.http;

import java.io.Serial;

/**
 * An HTTP action with just a specific status.
 *
 * @author Jerome Leleu
 * @since 4.0.0
 */
public class StatusAction extends HttpAction {

    @Serial
    private static final long serialVersionUID = -1512800910066851787L;

    public StatusAction(final int code) {
        super(code);
    }
}
