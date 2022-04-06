package com.example.javatest.util;


public class StringUtilTest {
    public static void main(String[] args) {
       String result =  StringUtil.repeat("Hola", 3);
        if(!result.equals("HolaHolaHola")){
            System.out.println("ERROR");
        }
    }
}