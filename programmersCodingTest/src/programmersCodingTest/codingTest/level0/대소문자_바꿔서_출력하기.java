package programmersCodingTest.codingTest.level0;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {

	public static void main(String[] args) {
		/*
		 
		 * 대소문자 바꿔서 출력하기
		 
		 * 문제실행 : 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
		 * 제한사항 :	1 ≤ str의 길이 ≤ 20
					str은 알파벳으로 이루어진 문자열입니다.
		 * 입력 : aBcDeFg
		 * 출력 : AbCdEfG
		  	
		 
		 결론 : 
		 	1. 사용한 함수 외워야 함.
		 	2. 정규식을 알아야 함.
		 */
		
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(str.length() >= 1 && str.length() <= 20){
            String arrStr[] = str.split("");
            for(String item : arrStr){
                if(item.matches("^[a-zA-Z]*$")){
                    if(Character.isUpperCase(item.charAt(0))){
                        System.out.print(item.toLowerCase());
                    }else if (Character.isLowerCase(item.charAt(0))){
                        System.out.print(item.toUpperCase());
                    }
                }
            }
        }
	}
}
