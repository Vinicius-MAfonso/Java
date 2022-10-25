package com.mycompany.loterynumber;
import java.security.SecureRandom;
public class RandomNumbers {
    private static final SecureRandom RANDOM = new SecureRandom();
    public static String genNumbers(int numbers){
        if(numbers > 10 || numbers < 1)
            throw new IllegalArgumentException("O número deve ser entre 1 e 10");
        StringBuilder builder = new StringBuilder();
        for(int i = 1; i <= numbers;i++){
            if(i == numbers)
                builder.append(RANDOM.nextInt(1,100));
            else
                builder.append(RANDOM.nextInt(1,100)).append("-");
        }
        return builder.toString();
    }
}
