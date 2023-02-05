package com.techreturn;

public class RomanNumeralsConverter {
    public String convert(int arabicNumber) {
        String numeral = "";
        for (int i=0; i< arabicNumber; i++){
            if (i < 3) {
                numeral += "I";
            } else {
                numeral = "IV";
            }
        }
        return numeral;
    }
}
