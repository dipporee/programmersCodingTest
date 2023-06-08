package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 문자열_붙여서_출력하기 {
	public static void main(String[] args) {
		/*
		 
		 * 문자열 붙여서 출력하기
		 
		 * 문제실행 : 
		 	두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
			입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
		 * 제한사항 : 1 ≤ str1, str2의 길이 ≤ 10
		 * 입력 : apple pen
		 * 출력 : applepen
		
		 */
		
		Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        if (str1.length() >= 1 && str2.length() <= 10) {
            System.out.print(str1 + str2);    
        }
		
	}
}
