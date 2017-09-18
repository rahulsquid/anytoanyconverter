package com.ts.fileconverter;

/**
 * Created by rahul on 9/16/17.
 */
public interface Converter<I,O> {
   O convert(I i) throws Exception;
}
