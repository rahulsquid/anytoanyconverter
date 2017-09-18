package com.ts.fileconverter;

/**
 * Created by rahul on 9/16/17.
 */
public class ConverterException extends Exception {
    public ConverterException(Throwable t ){
        super(t);
    }
    public ConverterException(Throwable t, String msg){
        super(msg,t);
    }
    public ConverterException(String msg){
        super(msg);
    }
}
