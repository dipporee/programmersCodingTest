package programmersCodingTest.codingTest.level0;

public class 카운트_업 {
	
   public static int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1]; // 개수 만큼
        int temp = start;
        for (int i = 0; i <= end - start; i++) {
            answer[i] = temp;
            temp++;
        }
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 카운트 업
		 
		 * 문제설명 : 정수 start와 end가 주어질 때, start부터 end까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		 * 제한사항 : 0 ≤ start ≤ end ≤ 50
		 * 입력 : 3	10	
		 * 출력 : 	[3, 4, 5, 6, 7, 8, 9, 10]
		  	
		 
		 결론 : 
		 	1. 배열을 선언할 때 안에 숫자는 배열의 개수로 0부터 시작이 아니다.
		 	2. 인덱스는 0부터 시작한다.
		 */
		
		System.out.println(solution(3, 10));
		
	}
}
