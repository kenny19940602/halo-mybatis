package com.halo.exception;

/**
 * Theme up to date exception.
 *
 * @author johnniang
 */
public class ThemeUpToDateException extends BadRequestException {

    public ThemeUpToDateException(String message) {
        super(message);
    }
}
