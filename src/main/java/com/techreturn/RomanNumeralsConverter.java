package com.techreturn;

public class RomanNumeralsConverter {

    private final int THREE = 3;
    private final int FOUR = 4;
    private final int FIVE = 5;

    private final int NINE = 9;
    private final int TEN = 10;
    private final String NumeralForOne = "I";
    private final String NumeralForFive = "V";

    private final String NumeralForTen = "X";
    public String convert(int arabicNumber) {
        String numeral = "";
        String numeralStartFive = NumeralForFive;
        String numeralStartTen = NumeralForTen;

        switch (arabicNumber){
            case 1,2,3:
                for (int i=0; i< arabicNumber; i++) {
                    numeral += NumeralForOne;
                }
                break;
            case 4:
                numeral =  NumeralForOne + NumeralForFive;
                break;
            case 5:
                numeral = NumeralForFive;
                break;
            case 6,7,8:
                for (int j=0; j < (arabicNumber - FIVE) ; j++) {
                    // concat 'I' to right of V
                    numeralStartFive += NumeralForOne;
                }
                numeral = numeralStartFive;
                break;
            case 9:
                numeral = NumeralForOne + NumeralForTen;
                break;
            case 10:
                numeral = NumeralForTen;
                break;
        }
        return numeral;
    }

}

