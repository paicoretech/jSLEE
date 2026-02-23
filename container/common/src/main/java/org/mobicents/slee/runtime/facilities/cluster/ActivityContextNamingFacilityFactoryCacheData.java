package org.mobicents.slee.runtime.facilities.cluster;

import org.mobicents.slee.container.activity.ActivityContextHandle;
import org.restcomm.cluster.MobicentsCluster;

import java.util.Map;

/**
 *
 * Proxy object for activity context factory data management through JBoss Cache
 *
 * @author Kenny Mendieta
 *
 */
public class ActivityContextNamingFacilityFactoryCacheData {

    private MobicentsCluster cluster;

    /**
     *
     * @param cluster
     */
    public ActivityContextNamingFacilityFactoryCacheData(MobicentsCluster cluster) {
        this.cluster=cluster;
    }

    /**
     * Retrieves a set containing all activity context naming in the factory's
     * cache data
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public Map<String, ActivityContextHandle> getNameBindings() {
        return (Map<String,ActivityContextHandle>)this.cluster.getMobicentsCache().getAllElements();
    }
}
