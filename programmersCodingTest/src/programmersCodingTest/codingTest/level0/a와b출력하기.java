package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class a와b출력하기 {

	public static void main(String[] args) {
		/*
		 
		 * a와 b 출력하기
		 
		 * 문제실행 : 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
		 * 제한사항 : -100,000 ≤ a, b ≤ 100,000
		 * 입력 : 4 5
		 * 출력 : 
		  	a = 4
			b = 5			
		 
		 결론 : 
		 	1. println 써야 함.
		 */
		
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a >= -100000 && b <= 100000) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
	}
}
