package org.pac4j.jee.adapter;

import lombok.val;
import org.pac4j.core.adapter.JEEAdapter;

import javax.annotation.Priority;

/**
 * The JavaEE adapter implementation.
 *
 * @author Jerome LELEU
 * @since 5.6.0
 */
public class JEEAdapterImpl extends JEEAdapter {

    @Override
    public int compareManagers(Object obj1, Object obj2) {
        var p1 = 100;
        var p2 = 100;
        val p1a = obj1.getClass().getAnnotation(Priority.class);
        if (p1a != null) {
            p1 = p1a.value();
        }
        val p2a = obj2.getClass().getAnnotation(Priority.class);
        if (p2a != null) {
            p2 = p2a.value();
        }
        if (p1 < p2) {
            return -1;
        } else if (p1 > p2) {
            return 1;
        } else {
            return obj2.getClass().getSimpleName().compareTo(obj1.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return "JavaEE implementation";
    }
}
