package com.techreturn;

public class RomanNumeralsConverter {

    private final int FIVE = 5;
     private final String NumeralForOne = "I";
    private final String NumeralForFive = "V";

    private final String NumeralForTen = "X";

    private String convertOnetoNine(int leastSigDigit) {

        String numeralStartFive = NumeralForFive;
        String numeralStartTen = NumeralForTen;
        String leastNumeral = "";

        switch (leastSigDigit){
            case 1,2,3:
                for (int i=0; i< leastSigDigit; i++) {
                    leastNumeral += NumeralForOne;
                }
                break;
            case 4:
                leastNumeral =  NumeralForOne + NumeralForFive;
                break;
            case 5:
                leastNumeral = NumeralForFive;
                break;
            case 6,7,8:
                for (int j=0; j < (leastSigDigit - FIVE) ; j++) {
                    // concat 'I' to right of V
                    numeralStartFive += NumeralForOne;
                }
                leastNumeral = numeralStartFive;
                break;
            case 9:
                leastNumeral = NumeralForOne + NumeralForTen;
                break;
            case 10:
                leastNumeral = NumeralForTen;
                break;
        }
        return leastNumeral;
    }

    public String convert(int arabicNumber) {
        String numeral = "";

        int tenMultiplier = 0;
        int firstDigit = 0;

        //if arabicNumber has 2 digits, determine numeral for 2nd digit and append to 1st digit.
        if (arabicNumber >= 10 ) {
            tenMultiplier = arabicNumber / 10;
            firstDigit = arabicNumber % 10;
        } else
            firstDigit = arabicNumber;

        for (int i =0; i<tenMultiplier; i++) {
            numeral += NumeralForTen;
        }
        //appendix last numeral for 1 to 9 to ten multiplier            //numeral = 'X' + first digit in roman numeral
        if (firstDigit > 0)
            numeral += convertOnetoNine(firstDigit);

        return numeral;
    }


}

