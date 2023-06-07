package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 덧셈식_출력하기 {

	public static void main(String[] args) {
		/*
		 
		 * 덧셈식 출력하기
		 
		 * 문제실행 : 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
		 			a + b = c
		 * 제한사항 : 1 ≤ a, b ≤ 100
		 * 입력 : 4 5
		 * 출력 : 4 + 5 = 9
		  	
		 
		 결론 : 
		 	1. int 와 String 연산의 구분
		 */
		
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        
        if(a >= 1 && b <= 100){
            System.out.println(a + " + " + b + " = " + (a + b));
            // System.out.println(a + " + " + b + " = " + c);
            //System.out.println(a + " + " + b + " = " + a + b); // 4 + 5 = 45 String으로 인식하여 45가 된다. 
        }
		
	}
}
