package programmersCodingTest.codingTest.level0;

public class 간단한_눈리_연산{
	
    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1 || x2) && (x3 || x4);        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 간단한 논리 연산
		 
		 * 문제설명 : boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.

					(x1 ∨ x2) ∧ (x3 ∨ x4)
		 * 제한사항 :
		 * 입력 : false	true	true	true	
		 * 출력 : true
		  	
		 
		 결론 : 
		 	1. || 와 && 를 기억하자
		 	2. || 둘중하나만 true 여도 true
		 	3. && 둘중하나만 false 여도 false
		 	4. x1 | x2 && x3 | x4; 이렇게 해도 됨을 찾았다. 비트 연산자인데 이것이 사용이 가능한가 보다. 
		 */
		
		System.out.println(solution(false, true, true, true));
	}
}
