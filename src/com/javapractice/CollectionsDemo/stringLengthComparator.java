package com.javapractice.CollectionsDemo;

import java.util.Comparator;

public class stringLengthComparator implements Comparator<String> {
    @Override
        public int compare(String s1,String s2){
            int s1l=s1.length();
            int s2l=s2.length();
            if(s1l>s2l){
                return 1;
            }
            else if(s1l<s2l){
                return -1;
            }
            else{
                return 0;
            }
    }
}
