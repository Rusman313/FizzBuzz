import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzz {
    public String execute(int[] numbers){
        // creating a sequence from each member of our array, passing it as a parameter's our processNumber Method and then collect the output and join them together separated by a comma
        return Arrays.stream(numbers).mapToObj(this::processNumber).collect(Collectors.joining(", "));

    }

    public String processNumber(int number){
        if(isMultipleOfThree(number) && isMultipleOfFive(number)){
            return "Fizz Buzz"; // we put this first because this will be checked first, because possible numbers would be divisible by 3 and 5 it would stop at the first one 
        }
        else if (isMultipleOfThree(number)) { // if number is divisible by 3, result is 0, return Fizz
            return "Fizz";
        }else if(isMultipleOfFive(number)){return "Buzz";}//// if number is divisible by 5, result is 0, return buzz
        else{
        return Integer.toString(number);
        }
    }

    private boolean isMultipleOfFive(int number){
        return number % 5 == 0;
    }
    private boolean isMultipleOfThree(int number){
        return number % 3 == 0;
    }

}