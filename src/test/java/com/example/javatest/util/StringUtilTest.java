package com.example.javatest.util;


import org.junit.*;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public  void repeat_string_negative_tiems(){
        StringUtil.repeat("Hola", -1);
    }

}