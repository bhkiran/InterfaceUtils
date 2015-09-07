package com.interfaces;

/**
 * Generic interface for caching.
 * @param <K>  Key parameter
 * @param <V>  Value parameter
 */
public interface IValueGetter<K,V> {
    /**
     * Gets value for key
     *
     * @param key the key
     * @return the value
     */
    public V getValue(K key);
}