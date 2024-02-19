package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {


    @Test
    void testConcat(){
        String base = "hello";
        App app = new App();
        app.setBase(base);
        assertEquals("helloworld",app.concat("world"));
    }

    @Test
    public void testConcat2(){
        String base = null;
        App app = new App();
        app.setBase(base);
        assertThrows(IllegalAccessException.class,()-> app.concat("world"));
    }
}
