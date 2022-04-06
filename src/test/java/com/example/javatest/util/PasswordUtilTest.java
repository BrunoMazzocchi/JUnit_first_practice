package com.example.javatest.util;

import org.junit.*;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_less_than_8_letter(){
        assertEquals(PasswordUtil.SecurityLevel.WEAK,  PasswordUtil.assessPassword("12345"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(PasswordUtil.SecurityLevel.WEAK,  PasswordUtil.assessPassword("abcd"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM,  PasswordUtil.assessPassword("abcd12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols(){
        assertEquals(PasswordUtil.SecurityLevel.STRONG,  PasswordUtil.assessPassword("abcd12345!"));
    }
}