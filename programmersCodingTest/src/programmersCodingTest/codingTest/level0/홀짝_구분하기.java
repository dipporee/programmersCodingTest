package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 홀짝_구분하기 {

	public static void main(String[] args) {
		/*
		 
		 * 홀짝 구분하기
		 
		 * 문제실행 : 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
		 * 제한사항 : 1 ≤ n ≤ 1,000
		 * 입력 : 100
		 * 출력 : 100 is even
		  	
		 
		 결론 : 
		 	1. 홀수 짝수의 간단한 구분 % 나누기를 사용해 나머지 값 확인하기
		 */
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n >= 1 && n <= 1000){
            if(n % 2 == 0){
                System.out.print(n + " is even");
            } else {
                System.out.print(n + " is odd");
            }
        }
	}
}
