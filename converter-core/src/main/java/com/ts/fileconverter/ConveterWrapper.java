package com.ts.fileconverter;

/**
 * Created by rahul on 9/18/17.
 */
public class ConveterWrapper implements Converter<String,String> {
    private Reader<String,Object> reader;
    private Writer<Object> writer;

    public String convert(String s) throws Exception {
        return null;
    }
}
