package com.vbgps.cache.ehcache;

import org.springframework.cache.Cache;

public class EhCache implements Cache {

	private String name;

	public String getName() {
		return name;
	}

	public Object getNativeCache() {
		return null;
	}

	public ValueWrapper get(Object key) {
		return null;
	}

	public <T> T get(Object key, Class<T> type) {
		return null;
	}

	public void put(Object key, Object value) {

	}

	public ValueWrapper putIfAbsent(Object key, Object value) {
		return null;
	}

	public void evict(Object key) {

	}

	public void clear() {

	}

}
