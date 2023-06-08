package programmersCodingTest.codingTest.level0;

public class 문자열_곱하기 {
	
    public static String solution(String my_string, int k) {
        String answer = "";
        
        for (int i = 0; i < k ; i++) {
            answer += my_string;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 문자열 곱하기
		 
		 * 문제실행 : 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
		 * 제한사항 :
		 	1 ≤ my_string의 길이 ≤ 100
			my_string은 영소문자로만 이루어져 있습니다.
			1 ≤ k ≤ 100
		 * 입력 : "string"	3
		 * 출력 : "stringstringstring"
		  	
		 
		 결론 : 
		 	1. 반복문 사용
		 	2. String 의 repeat 반복 메소드 사용
		 		예 ) str.repeat(3); 
		 */
		
		System.out.println(solution("string", 3));
	}
}
