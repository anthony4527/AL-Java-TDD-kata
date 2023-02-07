package com.techreturn;

public class RomanNumeralsConverter {

    private final int FIVE = 5;

    //prepare 2D array to store symbols for5 and 10 each digit
    //The 2D array has four row, keeping symbols for each digit, up to the max 4 (thousand) digit
    //'?' used on the 4th line as the five and ten sumbols for the 4th digit not supported
    private final String[][] SymbolsOneFiveTen = {{"I","V", "X"}, {"X", "L", "C"}, {"C","D", "M"}, {"M", "?", "?"} };

    private String convertOnetoNine(int oneDigit, int digitPosition) {

        String numeralForDigit = "";

        switch (oneDigit){
            // case 0, no need to convert
            case 0:
                break;
            // cases before 4, add 'I' repeatedly
            case 1,2,3:
                for (int i=0; i< oneDigit; i++) {
                    numeralForDigit += SymbolsOneFiveTen[digitPosition-1][0];
                }
                break;
                // case 4 - start use symbol for 5 and place 'I' in front
                // if 1st digit (0-9), use 'V', if 2nd digit (10 to 20) use L, etc.
            case 4:
                numeralForDigit =  SymbolsOneFiveTen[digitPosition-1][0] + SymbolsOneFiveTen[digitPosition -1][1];
                break;
            case 5:
                numeralForDigit = SymbolsOneFiveTen[digitPosition -1][1];
                break;
                // case >5 and <9, use symbol for 5 and place 'I' after
            case 6,7,8:
                numeralForDigit = SymbolsOneFiveTen[digitPosition -1 ][1];
                for (int j=0; j < (oneDigit - FIVE) ; j++) {
                    // concat 'I' to right of V
                    numeralForDigit += SymbolsOneFiveTen[digitPosition-1][0];
                }
                break;
                // case 9, use symbol of 10 for this digit position and place 'I' before
            case 9:
                numeralForDigit = SymbolsOneFiveTen[digitPosition-1][0] + SymbolsOneFiveTen[digitPosition-1][2];
                break;

        }
        return numeralForDigit;
    }

    public String convert(int arabicNumber) {
        String numeralResult = "";

        // get each digit from most significant, and change it to roman numeral using convertOneNine method
        // make input number become int array for each digit
        String inputNumber = Integer.toString(arabicNumber);
        int[] arabicNum = new int[inputNumber.length()];

        //the function does not support number larger than 3000
        if (arabicNumber >3000) {
            return "Not available for greater than 3000";
        }
        for (int i=0; i<inputNumber.length(); i++ ){
            arabicNum[i] = Character.getNumericValue(inputNumber.charAt(i));
        }

        // use for loop start to work on each digit
        for (int j=0; j<inputNumber.length(); j++ ) {
            int position = inputNumber.length() - j;    // position 1 means last digit, 2 mean tenth's position, '3' for hundredth's ...
            //call convertOnetoNine pass the digit and the digit position
            // add numeral of converted digit to numeral result
            numeralResult += convertOnetoNine(arabicNum[j], position);
        }

        return numeralResult;
    }


}


