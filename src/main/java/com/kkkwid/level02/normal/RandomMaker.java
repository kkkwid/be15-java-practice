package com.kkkwid.level02.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        return (int) (Math.random() * (max-min) + min);
    }

    public static String randomUpperAlphabet(int length){
        String answer = "";
        for(int i =0; i<length; i++){
            answer += ""+ (char)(randomNumber(0,26)+65);
        }
        return answer;
    }

    public static String rockPaperScissors(){
        String[] rock = {"가위","바위","보"};
        Random random = new Random();
        return rock[random.nextInt(3)];
    }

    public static String tossCoin(){
        String[] coin = {"앞","뒤"};
        Random random = new Random();
        return coin[random.nextInt(2)];
    }

}
