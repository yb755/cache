package com.vbgps.cache.ehcache;

import java.util.Collection;

import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractCacheManager;

public class CustomCacheManager extends AbstractCacheManager {

	private Collection<? extends Cache> caches;

	@Override
	protected Collection<? extends Cache> loadCaches() {
		return this.caches;
	}

	public void setCaches(Collection<? extends Cache> caches) {
		this.caches = caches;
	}
}
