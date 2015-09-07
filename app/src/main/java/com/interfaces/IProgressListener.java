package com.interfaces;

/**
 * A generic interface for notifying progress change.
 * <p/> Created by Kiran BH on 19/11/14.
 */
public interface IProgressListener {
    /**
     * Callback method for progress change.
     *
     * @param progress Value between (0-1) or -1, {@code -1} means indeterminate.
     */
    public void onProgress(float progress);
}
