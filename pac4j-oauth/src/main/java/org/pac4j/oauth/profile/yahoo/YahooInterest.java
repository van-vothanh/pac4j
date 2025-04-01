package org.pac4j.oauth.profile.yahoo;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * This class represents a Yahoo interest.
 *
 * @author Jerome Leleu
 * @since 1.1.0
 */
public final class YahooInterest implements Serializable {

    @Serial
    private static final long serialVersionUID = 3613314161531695788L;

    private List<String> declaredInterests;

    private String interestCategory;

    public List<String> getDeclaredInterests() {
        return declaredInterests;
    }

    public void setDeclaredInterests(List<String> declaredInterests) {
        this.declaredInterests = declaredInterests;
    }

    public String getInterestCategory() {
        return interestCategory;
    }

    public void setInterestCategory(String interestCategory) {
        this.interestCategory = interestCategory;
    }
}
