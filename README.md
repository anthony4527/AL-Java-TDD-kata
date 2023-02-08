# AL-Java-TDD-kata
Repo for kata exercise using TDD
I have completed a kata to convert arabic number to the Roman numeral equivalent.
This Repo includes the following for the Kata:
a) RomanNumeral Converter Class
b) RomanNumeral Converter Tester Class with list of unit test cases passed
c) romanFromCsv Tester Class - this uses Junit Parameterized testing code,to read data for test cases and perform auto testing
d) csvTest CSV file as placed in resources folders for setting up test data and expected results

I used the TDD approach to develop the codes for RomanNumeral Converter.Firsly I started RED coding for the simple range from 0 to 9
Then I iterate coding for each increasing range 10 to 100, 100 to 500, etc.
I observed the pattern of conversion for each range, and used switch statement to code the output for ROman numeral.
I realized that the pattern will repeat for each range, and therefore based on DRY purpose, I refactor the conversion method to read parameter from a Symbols table.

The Symbol table defines the roman numeral symbol to be used for the digits 0 to 9 in each range i.e. 0-9 range, 10 to 99 range, 100 to 999 range, etc.

Then I decompose each input arabic number into digits for each range e.g. to convert a number 123, the Converter breaks it to '1', '2', '3' and apply the conversion method with a parameter to indicate the respective range.

I have tested the RomanNumeral Converter that it correctly convert number up to 3000. Assumption that Roman Numeral does not provide for number larger than 3000.
