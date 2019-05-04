package com.rajuboddupalli.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(new Integer[]{1,2,3,4,5});
        Collections.sort(integers,(a,b)->{
            System.out.println("a"+a+",b"+b+": ");
            return 1;});
        System.out.println(integers);
    }
}
