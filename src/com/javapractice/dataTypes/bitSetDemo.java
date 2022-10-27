package com.javapractice.dataTypes;

import java.util.BitSet;

public class bitSetDemo {
    public static void main(String[] args){
        BitSet bits1=new BitSet(16);
        BitSet bits2=new BitSet(16);
        // set some bits
        for(int i=0; i<16; i++) {
            if((i%2) == 0) bits1.set(i);
            if((i%5) != 0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);
    }
}
