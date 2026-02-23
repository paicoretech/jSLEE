package org.mobicents.slee.runtime.activity.cache;

import org.mobicents.slee.container.activity.ActivityContextHandle;
import org.mobicents.slee.container.activity.ActivityType;
import org.restcomm.cluster.MobicentsCluster;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ActivityContextFactoryCacheData {

    private MobicentsCluster cluster;

    /**
     * @param cluster
     */
    public ActivityContextFactoryCacheData(MobicentsCluster cluster) {
        this.cluster = cluster;
    }

    /**
     * Retrieves a set containing all activity context handles in the factory's
     * cache data
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public Set<ActivityContextHandle> getActivityContextHandles() {
        //WARNING : EXPENSIVE OPERATION , CONSIDER OPTIMIZATION
        Set<ActivityCacheKey> keys = (Set<ActivityCacheKey>) this.cluster.getMobicentsCache().getAllKeys();
        Set<ActivityContextHandle> handles = new HashSet<ActivityContextHandle>();
        Iterator<ActivityCacheKey> keysIterator = keys.iterator();
        while (keysIterator.hasNext()) {
            ActivityCacheKey curr = keysIterator.next();
            if (curr.getType() == ActivityCacheType.METADATA)
                handles.add(curr.getActivityHandle());
        }

        return handles;
    }

    /**
     * Retrieves a set containing all activity context handles in the factory's
     * cache data
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public Set<ActivityContextHandle> getActivityContextHandlesByType(ActivityType type) {
        //WARNING : EXPENSIVE OPERATION , CONSIDER OPTIMIZATION
        Set<ActivityCacheKey> keys = (Set<ActivityCacheKey>) this.cluster.getMobicentsCache().getAllKeys();
        Set<ActivityContextHandle> handles = new HashSet<ActivityContextHandle>();
        Iterator<ActivityCacheKey> keysIterator = keys.iterator();
        while (keysIterator.hasNext()) {
            ActivityCacheKey curr = keysIterator.next();
            if (curr.getType() == ActivityCacheType.METADATA && curr.getActivityHandle().getActivityType() == type)
                handles.add(curr.getActivityHandle());
        }

        return handles;
    }
}
