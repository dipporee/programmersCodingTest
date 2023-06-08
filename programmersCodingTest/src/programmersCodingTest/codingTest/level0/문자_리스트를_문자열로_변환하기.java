package programmersCodingTest.codingTest.level0;

public class 문자_리스트를_문자열로_변환하기 {
	
    public static String solution(String[] arr) {
        
        String answer = "";
        
        for (String str : arr){
          answer += str;  
        }
        
        System.out.println(answer);
        // System.out.println(String.join("", arr));
        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 문자 리스트를 문자열로 변환하기
		 
		 * 문제실행 : 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
		 * 제한사항 : 1 ≤ arr의 길이 ≤ 200
					arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
		 * 입력 : ["a","b","c"]
		 * 출력 : "abc"
		  	
		 
		 결론 : 
		 	1. 배열의 선언
		 		String[] arr = {"a", "b", "c"}; 
		 	2. 다르고 간단한 방법 : String.Join 메서드
		 		String.join(String 자리, String[] 자리);
		 			
		 */
		
		String[] arr = {"a", "b", "c"}; // 배열이라고 ["a", "b", "c"] 이렇게 선언해서는 안된다.  
		solution(arr);
	}
}
