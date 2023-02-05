package com.techreturn;

public class RomanNumeralsConverter {
    public String convert(int arabicNumber) {
        String numeral = "";
        for (int i=0; i< arabicNumber; i++){
            if (i < 3) {
                numeral += "I";
            } else {
                if (i == 3) {
                    numeral = "IV";
                } else {
                    if (i == 4) {
                        numeral ="V";
                    } else {
                        numeral = "V" + "I";
                    }
                }

            }
        }
        return numeral;
    }

}
