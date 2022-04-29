package com.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "specialCache")
    public String longRunning() throws InterruptedException {
        Thread.sleep(5000L);
        return "Method Calisti";
    }

    @CacheEvict(cacheNames = "specialCache", allEntries = true)
    public void clearCache() {
    }



}
