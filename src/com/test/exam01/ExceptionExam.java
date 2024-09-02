package com.test.exam01;

class FoolException extends Exception {
    
}

public class ExceptionExam {
    public static void main(String[] args) throws ArithmeticException{ //부모: Exception
        int b;
        int c;
        b = 0;
        c = 0;
        /* try {
            c = 4/b;
        } catch(ArithmeticException exception){
            b = -1; //에러가 발생되면 해 줄 명령어
        } finally { //에러가 발생하더라도 반드시 수행해야 하는 명령
            System.out.println("다행이다...");    try catch만 써야 되는 경우가 있는데 그 타이밍은 알아서 알려준다.
        } 
        System.out.println("c = " + c);

        c = 12/b;

        System.out.println("c = " + c);
        */
        ExceptionExam exam = new ExceptionExam();
        exam.sayNickname("fool");

    }

    public void sayNickname(String nickname){
        if(nickname.equals("fool"))
            try {
                throw new FoolException();
            } catch (FoolException e) {
                e.printStackTrace();
            }
        System.out.println("당신의 별명은 " + nickname + "입니다.");
    }
}
