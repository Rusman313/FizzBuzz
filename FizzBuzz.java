public class FizzBuzz {
    public void execute(){

    }

    public String processNumber(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return "Fizz Buzz"; // we put this first because this will be checked first, because possible numbers would be divisible by 3 and 5 it would stop at the first one 
        }
        else if (number % 3 == 0){ // if number is divisible by 3, result is 0, return Fizz
            return "Fizz";
        }else if(number % 5 == 0){return "Buzz";}//// if number is divisible by 5, result is 0, return buzz
        else{
        return Integer.toString(number);
        }
    }
}