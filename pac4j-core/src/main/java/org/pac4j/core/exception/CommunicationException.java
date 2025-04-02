package org.pac4j.core.exception;

import java.io.Serial;

/**
 * This class represents a communication exception.
 * 
 * @author Jerome Leleu
 * @since 1.4.0
 */
public class CommunicationException extends TechnicalException {

    @Serial
    private static final long serialVersionUID = 3817212490339517957L;
    
    public CommunicationException(final String message) {
        super(message);
    }
    
    public CommunicationException(final Throwable t) {
        super(t);
    }
}
