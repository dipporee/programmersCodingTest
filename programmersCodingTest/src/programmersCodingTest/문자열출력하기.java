package programmersCodingTest;

import java.util.Scanner;

public class 문자열출력하기 {

	public static void main(String[] args) {
		/*
		 * 문자열 출력하기
		 * 
		 * 문제실행 : 문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
		 * 제한사항 : 1 ≤ str의 길이 ≤ 1,000,000
					str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
		 * 입력 : HelloWorld!
		 * 출력 : HelloWorld!			
		 */
		
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if (str.length() >= 1 && str.length() <= 1000000) {
            System.out.print(str);
        }
        
	}
}
