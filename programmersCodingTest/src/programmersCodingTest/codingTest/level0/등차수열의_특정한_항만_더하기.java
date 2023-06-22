package programmersCodingTest.codingTest.level0;

public class 등차수열의_특정한_항만_더하기 {
	
	public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for (boolean yn : included) {
            answer += (yn ? a : 0); 
            a = a + d;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 등차수열의 특정한 항만 더하기
		 
		 * 문제설명 : 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때
		 * , 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
		 * 제한사항 : 1 ≤ a ≤ 100
					1 ≤ d ≤ 100
					1 ≤ included의 길이 ≤ 100
					included에는 true가 적어도 하나 존재합니다.
		 * 입력 : 3	4	[true, false, false, true, true]
		 * 출력 : 	37
		  	
		 
		 결론 : 
		 	1. 등차수열 : 연속하는 두 항의 차이가 모두 일정한 수열을 뜻한다.
		 */
		
		boolean[] included = {true, false, false, true, true};
		System.out.println(solution(3, 4, included));
	}
}
