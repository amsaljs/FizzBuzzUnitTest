package com.testing.test.function;

public class FizzBuzz {

    public String evaluateFizzBuzz(int number){
        String result="";
        if(number % 15==0){
            result+="FizzBuzz";
        }else if(number % 5 ==0){
            result+="Buzz";
        }else if(number% 3 ==0){
            result+="Fizz";
        }
        else {
            return String.valueOf (number);
        }
        System.out.println (result);
        return result;
    }
}
