package com.techreturn;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsConverterTest {
    @Test
    public void checkRomanNumeralforOne() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("I", romanNumeralsConverter.convert(1));
    }

    @Test
    public void checkRomanNumeralforTwo() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("II", romanNumeralsConverter.convert(2));
    }
    @Test
    public void checkRomanNumeralforThree() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("III", romanNumeralsConverter.convert(3));
    }

    @Test
    public void checkRomanNumeralforFour() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IV", romanNumeralsConverter.convert(4));
    }

    @Test
    public void checkRomanNumeralforFive() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("V", romanNumeralsConverter.convert(5));
    }

    @Test
    public void checkRomanNumeralforSix() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("VI", romanNumeralsConverter.convert(6));
    }

    @Test
    public void checkRomanNumeralforSeven() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("VII", romanNumeralsConverter.convert(7));
    }

    @Test
    public void checkRomanNumeralforEight() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("VIII", romanNumeralsConverter.convert(8));
    }

    @Test
    public void checkRomanNumeralforNine() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("IX", romanNumeralsConverter.convert(9));
    }
    @Test
    public void checkRomanNumeralforTen() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("X", romanNumeralsConverter.convert(10));
    }

    @Test
    public void checkRomanNumeralforEleven() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XI", romanNumeralsConverter.convert(11));
    }

    @Test
    public void checkRomanNumeralforFourteen() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XIV", romanNumeralsConverter.convert(14));
    }

    @Test
    public void checkRomanNumeralforNineteen() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XIX", romanNumeralsConverter.convert(19));
    }

    @Test
    public void checkRomanNumeralforTwentyMore() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XXIV", romanNumeralsConverter.convert(24));
    }

    @Test
    public void checkRomanNumeralforThirtyMore() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XXXVI", romanNumeralsConverter.convert(36));
    }

    @Test
    public void checkRomanNumeralforFortyMore() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XLI", romanNumeralsConverter.convert(41));
    }
    @Test
    public void checkRomanNumeralforFortyFour() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("XLIV", romanNumeralsConverter.convert(44));
    }
    @Test
    public void checkRomanNumeralforFifty() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertEquals("L", romanNumeralsConverter.convert(50));
    }
}


