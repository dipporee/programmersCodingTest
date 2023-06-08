package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 문자열_돌리기 {

	public static void main(String[] args) {
		/*
		 
		 * 문자열 돌리기
		 
		 * 문제실행 : 문자열 str이 주어집니다.
					문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
		 * 제한사항 : 1 ≤ str의 길이 ≤ 10
		 * 입력 : abcde
		 * 출력 : 
		  		a
				b
				c
				d
				e
		 
		 결론 : 
		 	1. 다른 분들이 char 를 이용하는 방법들을 많이 사용하셨다.
		 	2. 나의 생각으로 간단하게 할 수 있는 것은 split 으로 배열로 쪼개는 것이었다. 
		 	
		 	// 다른 방법
			1. 첫 번째 방법
		 	Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        char[] chars = a.toCharArray();
	        for (char c: chars) {
	           System.out.println(c);
	        }
	        
	        2. 두 번째 방법
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        for(int i=0; i<a.length(); i++){
	            System.out.println(a.charAt(i));
	        }
		 */
		
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(str.length() >= 1 && str.length() <= 10){
            String[] arrStr = str.split("");
            for(String item : arrStr){
                System.out.println(item);
            }
        }
	}
}
