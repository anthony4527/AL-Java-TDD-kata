package com.techreturn;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanFromCsvTest {
    //@Test
    @ParameterizedTest
    @CsvFileSource(resources = "/csvTest.csv", numLinesToSkip = 1)

    public void checkFromCsv(int input, String expected) {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        assertEquals(expected, romanNumeralsConverter.convert(input));
    }
}
