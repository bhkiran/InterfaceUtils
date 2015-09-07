package com.interfaces;

/**
 * A generic interface to get instances.
 * <p/>Created by  Kiran BH
 *
 * @param <T>  the class of instance
 */
public interface IInstanceGetter<T> {
    /**
     * Gets instance.
     *
     * @return the instance
     */
    public T getInstance();
}
