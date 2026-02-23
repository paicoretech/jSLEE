package org.mobicents.slee.runtime.facilities.cluster;

import javax.slee.facilities.NameAlreadyBoundException;
import javax.slee.facilities.NameNotBoundException;

import org.mobicents.slee.container.activity.ActivityContextHandle;
import org.restcomm.cluster.MobicentsCluster;
import org.restcomm.cluster.cache.ClusteredCacheData;

/**
 *
 * Proxy object for ac naming facility data management through JBoss Cache
 *
 * @author Kenny Mendieta
 *
 */

public class ActivityContextNamingFacilityCacheData extends ClusteredCacheData<String, ActivityContextHandle> {

    /**
     * @param name
     * @param cluster
     */
    public ActivityContextNamingFacilityCacheData(String name, MobicentsCluster cluster) {
        super(name, cluster.getMobicentsCache());
    }

    /**
     * Binds the specified aci name with the specified activity context handle
     *
     * @param ach
     * @throws NameAlreadyBoundException
     */
    public void bindName(ActivityContextHandle ach) throws NameAlreadyBoundException {
        if (super.exists())
            throw new NameAlreadyBoundException("name already bound");

        super.putValue(ach);
    }

    /**
     * Unbinds the specified aci name with the specified activity context id
     *
     * @return
     * @throws NameNotBoundException
     */
    public ActivityContextHandle unbindName() throws NameNotBoundException {
        ActivityContextHandle oldValue = super.removeElement();
        if (oldValue == null)
            throw new NameNotBoundException("name not bound");

        return oldValue;
    }

    /**
     * Lookup of the activity context id bound to the specified aci name
     *
     * @return
     */
    public ActivityContextHandle lookupName() {
        return super.getValue();
    }
}
