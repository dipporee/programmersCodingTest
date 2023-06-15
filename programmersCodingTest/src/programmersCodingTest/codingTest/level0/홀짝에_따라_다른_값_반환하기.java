package programmersCodingTest.codingTest.level0;

public class 홀짝에_따라_다른_값_반환하기 {
	
    public static int solution(int n) {
    	int answer = 0;
    	int temp = n;
    	
    	if (n % 2 == 0) { // 짝수
    		for (int i = 0 ; i < n; i++) {
    			if(temp % 2 == 0) {
    				answer += (temp * temp);
    			}
    			temp = temp - 1;
    		}
    	} else { // 홀수
    		for (int i = 0 ; i < n; i++) {
    			if(temp % 2 == 1) {
    				answer += temp;
    			}
				temp = temp - 1;
    		}
    	}
    	
        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 홀짝에 따라 다른 값 반환하기
		 
		 * 문제설명 : 
		 	양의 정수 n이 매개변수로 주어질 때
		 	, n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
		 * 제한사항 : 1 ≤ n ≤ 100
		 * 입력 : 7
		 * 출력 : 16
		  	예제 1번의 n은 7로 홀수입니다. 7 이하의 모든 양의 홀수는 1, 3, 5, 7이고 이들의 합인 1 + 3 + 5 + 7 = 16을 return 합니다.
		 
		 결론 : 
		 	1. 짝수와 홀수를 구분하는 방법 
		 		% : 나머지 연산자를 사용한다. 
		 */
		System.out.println(solution(10));
	}
}
