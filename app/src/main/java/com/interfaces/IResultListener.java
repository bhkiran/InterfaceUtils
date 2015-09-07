package com.interfaces;

/**
 * A generic interface to publish results.
 * <p/>Created by  Kiran BH
 *
 * @param <T> the type parameter for result object
 */
public interface IResultListener<T> {
    /**
     * Called when the task is done to notify the result.
     *
     * @param result the result
     */
    public void onResult(T result);
}
