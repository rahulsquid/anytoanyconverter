package com.ts.a2converter.service;

/**
 * Created by rahul on 1/20/19.
 */
public interface ConverterService<T> {
   T convert(T request);
}
