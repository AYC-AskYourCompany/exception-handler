package com.ayc.exceptionhandler.config;

import com.ayc.exceptionhandler.exception.EntityNotFound;
import org.springframework.context.annotation.Import;

@Import({ EntityNotFound.class })
public @interface EnableAycExceptionHandling {
}
