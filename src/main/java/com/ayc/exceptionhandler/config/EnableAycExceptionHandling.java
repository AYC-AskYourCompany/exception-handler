package com.ayc.exceptionhandler.config;

import com.ayc.exceptionhandler.exception.EntityNotFoundException;
import com.ayc.exceptionhandler.exception.NotAuthorizedException;
import org.springframework.context.annotation.Import;

@Import({ EntityNotFoundException.class, NotAuthorizedException.class })
public @interface EnableAycExceptionHandling {
}
