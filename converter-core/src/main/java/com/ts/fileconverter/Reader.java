package com.ts.fileconverter;

import java.io.Closeable;

/**
 * Created by rahul on 9/16/17.
 */
public interface Reader<I,O> {
     O read(I i) throws Exception;

    enum Type{
        FILE,STRING,STREAM
    }
}