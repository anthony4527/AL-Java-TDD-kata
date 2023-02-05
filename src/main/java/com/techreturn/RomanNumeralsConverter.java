package com.techreturn;

public class RomanNumeralsConverter {

    private final int THREE = 3;
    private final int FOUR = 4;
    private final int FIVE = 5;
    private final String NumeralForOne = "I";
    private final String NumeralForFive = "V";

    public String convert(int arabicNumber) {
        String numeral = "";
        String numeralStartFive = NumeralForFive;

        if (arabicNumber <= THREE) {
            for (int i=0; i< arabicNumber; i++) {
                numeral += NumeralForOne;
            }
        } else {
            if (arabicNumber == FOUR) {
                numeral = NumeralForOne + numeralStartFive;
            }
            else {
                if (arabicNumber > FIVE) {
                    for (int j=0; j < (arabicNumber - FIVE) ; j++) {
                        // concat 'I' to right of V
                        numeralStartFive += NumeralForOne;
                    }
                }
                numeral = numeralStartFive;
            }
        }

        return numeral;
    }

}
