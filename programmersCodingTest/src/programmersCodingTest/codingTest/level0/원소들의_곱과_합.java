package programmersCodingTest.codingTest.level0;

public class 원소들의_곱과_합 {
	
    public static int solution(int[] num_list) {
        int a = 1;
        int b = 0;
        
        for (int item : num_list) {
            a *= item;
            b += item;
        }
        
        b = b * b; // 제곱
        
        return a < b ?  1 : 0;
    }

	public static void main(String[] args) {
		/*
		 
		 * 원소들의 곱과 합
		 
		 * 문제설명 : 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
		 * 제한사항 : 2 ≤ num_list의 길이 ≤ 10
					1 ≤ num_list의 원소 ≤ 9
		 * 입력 : [3, 4, 5, 2, 1]
		 * 출력 : 1
		  	
		 
		 결론 : 
		 	1. 곱하기는 0이 시작이면 안됨.
		 */
		
		int[] num_list = {5, 7, 8, 3};
		System.out.println(solution(num_list));
	}
}
