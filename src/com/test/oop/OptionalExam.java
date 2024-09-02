package com.test.oop;

import java.util.Optional;

public class OptionalExam {
    public static void main(String[] args) {
    
        String str = "Hello";
        String isNullString = null;
        int a;
        /*
        try{
        if(isNullString.equals(isNullString))
            a = 4;
        }catch(NullPointerException e){
            System.out.println("NULLl이 돌아 왔어요.");
        }
        */

        String retValue = Optional.ofNullable(isNullString).orElse("NULL이다");
        System.out.println(retValue);

        String retValue1 = isNullString == null?"NULL이다":isNullString;
        System.out.println(retValue1);
    }

}
