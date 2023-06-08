package programmersCodingTest.codingTest.level0;

public class 더_크게_합치기 {
	
    public static int solution(int a, int b) {
        //String temp1 = "" + a + b;
        String temp1 = String.valueOf(a) +  Integer.toString(b);
        String temp2 = "" + b + a;
        
        //int ab = Integer.parseInt(temp1);
        int ab = Integer.valueOf(temp1);
        int ba = Integer.parseInt(temp2);
        
        int answer = (ab > ba) ? ab : ba ;
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 더 크게 합치기
		 
		 * 문제실행 : 
		  	연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
			
			12 ⊕ 3 = 123
			3 ⊕ 12 = 312
			양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
			
			단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
		  
		 * 제한사항 : 1 ≤ a, b < 10,000
		 * 입력 : 9	91
		 * 출력 : 991
		  	
		 
		 결론 : 
		 	1. int -> String
		 		- Integer.valueOf(String);
        		- Integer.parseInt(String);
		 	
		 	2. Stirng -> int 
		 		- String.valueOf(int);
		 		- Integer.toString(int);
		 		- "" + int
	 		3. 삼항연산자 사용
		 	
		 */
		
		System.out.println(solution(9, 91));
		
	}
}
