package com.dianping.pigeon.registry;

import java.util.Properties;

import com.dianping.pigeon.registry.exception.RegistryException;

public interface Registry {

	void init(Properties properties);

	String getName();

	String getValue(String key);
	
	String getServiceAddress(String serviceName) throws RegistryException;
	
	String getServiceAddress(String serviceName, String group) throws RegistryException;

	void publishService(String serviceName, String serviceAddress) throws RegistryException;

	void publishService(String serviceName, String group, String serviceAddress, int weight) throws RegistryException;

	int getServiceWeigth(String serviceAddress) throws RegistryException;

	RegistryMeta getRegistryMeta(String serviceAddress) throws RegistryException;
	
}
