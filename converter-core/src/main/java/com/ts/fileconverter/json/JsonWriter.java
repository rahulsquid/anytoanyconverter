package com.ts.fileconverter.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ts.fileconverter.Writer;

/**
 * Created by rahul on 9/17/17.
 */
public class JsonWriter<I> implements Writer<I> {
    public String write(I i) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(i);
    }
}
