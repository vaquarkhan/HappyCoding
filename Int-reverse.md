- Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4

- Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50

- Dividing an integer by 10 will remove the rightmost digit. (75 / 10) = 7

## Java reverse an int value - Pseudocode:

- a. Extract off the rightmost digit of your input number. (1234 % 10) = 4

- b. Take that digit (4) and add it into a new reversedNum.

- c. Multiply reversedNum by 10 (4 * 10) = 40, this exposes a zero to the right of your (4).

- d. Divide the input by 10, (removing the rightmost digit). (1234 / 10) = 123

- e. Repeat at step a with 123

### Java reverse an int value - Working code

              public int reverseInt(int input) {
                  long reversedNum = 0;
                  long input_long = input;

                    while (input_long != 0) {
                         reversedNum = reversedNum * 10 + input_long % 10;
                         input_long = input_long / 10;
                     }

                     if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
                        throw new IllegalArgumentException();
                       }
                       return (int) reversedNum;
                  }
