package programmersCodingTest.codingTest.level0;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 코딩 문제는 여기까지만 풀면 된다. 아래 main 은 값 보려고 해놓은 것
        String temp1 = my_string.substring(0, s);
        String temp2 = my_string.substring(overwrite_string.length() + s);
        String answer = temp1 + overwrite_string + temp2;
        return answer;
    }
}

public class 문자열_겹쳐쓰기 {
	public static void main(String[] args) {
		/*
		 
		 * 문자열_겹쳐쓰기
		 
		 * 문제실행 : 
		 	문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
		 	문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		 	
		 * 제한사항 :
		 	my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
			1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
			0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
			
		 * 입력 : "He11oWor1d"	"lloWorl"	2	
		 * 출력 : HelloWorld
		  	
		 결론 : 
		 	1. 클래스를 생성!!
		 	2. 문자열을 잘라서 사용한다.
		 	3. .substring
		 		* 인덱스의 시작은 0부터인 것을 기억할 것
		 		substring (9) : 시작 인덱스부터 끝까지
				substring (1, 10) : 시작 인덱스부터 끝 인덱스-1까지 
				
				String str = "0123456789";

				str.substring(5); // 56789
				str.substring(1,4); // 123 
				
				System.out.println(str.substring(5));
				System.out.println(str.substring(1,4));
				
		 */
		
		Solution solution = new Solution();
		solution.solution("He11oWor1d", "lloWorl", 2);
		
		System.out.println(solution.solution("He11oWor1d", "lloWorl", 2));
	}
}
