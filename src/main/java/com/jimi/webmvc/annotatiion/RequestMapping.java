package com.jimi.webmvc.annotatiion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
	String[] value() default "";

	HttpMethod method() default HttpMethod.GET;
}
