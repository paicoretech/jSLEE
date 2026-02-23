package org.restcomm.slee.container.build.as7.tckwrapper;

public interface SleeTCKPluginWrapperMBean {
    void setTCKPluginClassName(String newClName);

    String getTCKPluginClassName();

    void setRMIRegistryPort(int port);

    int getRMIRegistryPort();

    void setSleeProviderImpl(String provider);

    String getSleeProviderImpl();

    void setTCKPluginMBeanObjectName(String newMBObjectName);

    String getTCKPluginMBeanObjectName();
}
