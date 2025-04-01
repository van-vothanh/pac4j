package org.pac4j.kerberos.profile;

import org.ietf.jgss.GSSContext;
import org.pac4j.core.profile.CommonProfile;

import java.io.Serial;

/**
 * Represents a user profile based on a Kerberos authentication.
 *
 * @author Garry Boyce
 * @since 2.1.0
 */
public class KerberosProfile extends CommonProfile {

    @Serial
    private static final long serialVersionUID = -1388563485891552197L;
    private GSSContext gssContext = null;

    public KerberosProfile() {
    }

    public KerberosProfile(final GSSContext gssContext) {
        this.gssContext = gssContext;
    }

    public GSSContext getGssContext() {
        return gssContext;
    }


}
