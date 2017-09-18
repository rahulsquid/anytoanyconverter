package com.ts.fileconverter.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.ts.fileconverter.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by rahul on 9/16/17.
 */
public class JsonReader implements Reader<String,Object> {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonReader.class);
    private Type type;
    public JsonReader(Type type){
        this.type=type;
    }
    public Object read(String str) throws Exception {
        LOGGER.debug("Read json from:{}  -->{}",type,str);
        Object o=null;
        switch (type){
            case STRING:
                o=stringToJson(str);
                break;
            case FILE:

            default:
            throw new IllegalStateException(" Operation not supported");

        }
        return o;
    }

    private Object stringToJson(String str) throws IOException {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return gson.fromJson(str, Object.class);
        }catch (JsonSyntaxException e){
            throw new IOException(e);
        }
        }

}
