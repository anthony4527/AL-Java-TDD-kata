package com.techreturn;

public class RomanNumeralsConverter {
    public String convert(int arabicNumber) {
        String numeral = "";
        for (int i=0; i< arabicNumber; i++){
            numeral += "I";
        }
        return numeral;
    }
}
