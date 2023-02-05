package com.techreturn;

public class RomanNumeralsConverter {
    public String convert(int arabicNumber) {
        String numeral = "";
        String numeralStartFive = "V";

        if (arabicNumber <= 3) {
            for (int i=0; i< arabicNumber; i++) {
                numeral += "I";
            }
        } else {
            if (arabicNumber == 4) {
                numeral = "I" + numeralStartFive;
            }
            else {
                if (arabicNumber > 5) {
                    for (int j=0; j < (arabicNumber -5) ; j++) {
                        // concat 'I' to right of V
                        numeralStartFive += "I";
                    }
                }
                numeral = numeralStartFive;
            }
        }

        /* refactor above
        for (int i=0; i< arabicNumber; i++){
            if (i < 3) {
                numeral += "I";
            } else {
                if (i == 3) {
                    numeral = "IV";
                } else {
                    if (i == 4) {
                        numeral = numeralStartFive;
                    } else {
                        for (int j=0; j < i-4; j++) {
                            // concat 'I' to right of V
                            numeralStartFive += "I";
                        }
                        numeral = numeralStartFive;
                    }
                }

            }
        }*/
        return numeral;
    }

}
