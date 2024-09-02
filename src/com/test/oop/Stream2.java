package com.test.oop;

import java.util.ArrayList;
import java.util.List;

public class Stream2 {

    public static void main(String[] args) {
        
        List<Member> list = new ArrayList<Member>();
        list.add(new Member("김철수","male",54));
        list.add(new Member("김민성","male",38));
        list.add(new Member("최지희","female",28));
        list.add(new Member("김현주","female",54));
        //list.stream().map(c->c.getName()).sorted().forEach()

            for(int i=0;i<list.size(); i++){
                System.out.println("이름 : " + list.get(i).getName() + "\t"
                                             + list.get(i).getGender() + "\t"
                                             + list.get(i).getAge()); 

            }

            for(Member member: list){ //컬렉터 전용 for문 --> for(리스트 요소의 타입선언:리스트)
                System.out.println("이름 : " + member.getName() + "\t"
                                             + member.getGender() + "\t"
                                             + member.getAge()); 
//test
//test2
            }
    }
}
