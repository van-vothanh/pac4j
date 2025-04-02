package org.pac4j.core.profile;

import java.io.Serial;

/**
 * Anonymous profile. Not to be used except for advanced use cases.
 *
 * @author Jerome Leleu
 * @since 1.8.1
 */
public class AnonymousProfile extends CommonProfile {

    @Serial
    private static final long serialVersionUID = -7377022639833719511L;

    public static final AnonymousProfile INSTANCE = new AnonymousProfile();

    public AnonymousProfile() {
        setId("anonymous");
    }
}
