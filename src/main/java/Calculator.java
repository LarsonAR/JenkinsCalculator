import java.time.Instant;

class Calculator {
    private long seed;

    Calculator(){
        seed = Instant.now().getEpochSecond()*Instant.now().getNano();
    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        if (n == 0) return 0;

        int leftOperand = 0;
        int rightOperand = 1;
        int result = 1;

        for (int i = 1; i < n; i++) {
            int temp = result;
            result = leftOperand + rightOperand;
            leftOperand = rightOperand;
            rightOperand = result;
        }
        return result;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n) {
        StringBuilder result = new StringBuilder();
        do {
            if (n % 2 == 0) result.append('0');
            else result.append('1');
            n /= 2;
        } while (n > 0);
        return result.reverse().toString();
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        return n + seed++;
    }


}
