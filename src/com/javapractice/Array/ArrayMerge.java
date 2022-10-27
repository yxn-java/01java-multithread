package com.javapractice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMerge {
    public static void main(String args[]) {
        String a[] = { "A", "E", "I" };
        String b[] = { "O", "U" };
        String c[] ={"apple","boy","cat"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        list.addAll(Arrays.asList(c));
        Object[] obj = list.toArray();
        System.out.println(Arrays.toString(obj));
    }
}
