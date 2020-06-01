package Calculator;

public class Calculator {
    public static final int add(final String numbers){
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2){
            throw new RuntimeException("up to 2 numbers separated by comma(, ) are allowed.");
        }else{
            // Go through each number in our numbersArray and convert it from a string to an integer
            for(String number : numbersArray) {
                if(!number.isEmpty()) {
                    // Converts number string to int, adds to returnValue
                 returnValue += Integer.parseInt(number);
                    // If its not possible to convert the item to an integer, parseInt will throw an exception. 
                }     
             }
        }
        return returnValue;
        // returns 0 (default value) if no items in array
        
    }


}