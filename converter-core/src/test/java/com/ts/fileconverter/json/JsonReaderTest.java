package com.ts.fileconverter.json;

import com.ts.fileconverter.Reader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by rahul on 9/17/17.
 */
@Test
public class JsonReaderTest {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonReaderTest.class);
    Reader<String,Object> reader;
    @BeforeTest
    public void setup(){
        reader=new JsonReader(Reader.Type.STRING);
    }
    @Test
    public void testFromString() throws Exception {
        String str = "{\"menu\": {\n" +
                "  \"id\": \"abc\",\n" +
                "  \"value\": \"jkl\"}}";
        LOGGER.debug("obj:{}",reader.read(str));
        Assert.assertTrue(true);

    }
}
