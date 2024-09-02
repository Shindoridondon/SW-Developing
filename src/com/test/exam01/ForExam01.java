/* package com.test.exam01;

public class ForExam01 {

    public static void main(String[] args) {
        int i = 0; //초기화
        int sum = 0;

        for(i=0; i<=100; i++) // for(i=0; i<=100; sum += i++);
            sum = sum + i;
        

        System.out.println("\n" + "#1 For문을 이용한 계산 : sum = " + sum);
            

    }

}
*/

package com.test.exam01;

public class ForExam01 {

    public static void main(String[] args) {
        int i;
        int sum;

        for(i=0,sum=0; i<=100; sum += i++);        
        System.out.println("\n" + "#1 For문을 이용한 계산 : sum = " + sum);
        
        i = 0;
        sum = 0; // i = 0; sum = 0; 한 줄에 쓸 수도 있다, 좋은 기법은 아님
        while(i<=100){
            sum += i++;
        }

        System.out.println("\n" + "#2 While문을 이용한 계산 : sum = " + sum);

        i = 0; sum = 0;
        while(true){ //무한 Loop
            sum += i++;
            if(i>100) break;
        }

        System.out.println("\n" + "#3 While문 + break문을 이용한 계산 : sum = " + sum);        

        i = 0; sum = 0;
        while(true){
            sum += i++;
            if(i<=100) continue;
                else break;
        }

        System.out.println("\n" + "#4 While문 + break문 + continue문을 이용한 계산 : sum = " + sum);

        i = 0; sum = 0;
        do {
            sum += i++;
        }while(i<=100);

        System.out.println("\n" + "#5 do-while문을 이용한 계산 : sum = " + sum);

    }

}
