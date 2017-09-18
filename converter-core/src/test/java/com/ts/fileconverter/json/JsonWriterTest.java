package com.ts.fileconverter.json;

import com.ts.fileconverter.Writer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by rahul on 9/17/17.
 */
public class JsonWriterTest {
    Writer<Tmp> writer;
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonWriterTest.class);

    @BeforeTest
    public void setup(){
        writer = new JsonWriter<Tmp>();
    }

    @Test
    public void strJson(){
        Tmp t = new Tmp();
        t.id=100;
        Assert.assertEquals(writer.write(t),"{\n" +
                "  \"id\": 100\n" +
                "}");
    }
    static class Tmp{
        int id;
    }
}
