package com.kkkwid.array.level04_advanced;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> lotto = new HashSet<>();
        int[] arr = new int[6];

        for(int i=0;i<6;i++){
            lotto.add((int) (Math.random()*45)+1);
        }
        List<Integer> list = new ArrayList<>(lotto);

        Collections.sort(list);

        System.out.println(list);
    }
}
