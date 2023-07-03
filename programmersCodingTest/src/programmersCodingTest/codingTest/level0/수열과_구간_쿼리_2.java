package programmersCodingTest.codingTest.level0;

public class 수열과_구간_쿼리_2 {
	
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int j = 0; j < queries.length; j++) {
        	String temp = "";
            for (int i = 0; i < arr.length; i++) {            
                if (queries[j][0] <= i && i <= queries[j][1] && queries[j][2] < arr[i]) {
                	temp += "," + arr[i];
                }
            }   
            
            int min = -1;
            if (temp != null && !temp.equals("")) {
            	temp = temp.substring(1);
                String[] arrStr = temp.split(","); 
                
                if (arrStr != null && arrStr.length > 0) {
                	min = Integer.parseInt(arrStr[0]); //최소값
                    for (String str : arrStr) {
                    	int num = Integer.parseInt(str);
                        if (min > num) {
                            min = num;
                        }
                    }	
                }	
            }
            
            answer[j] = min;                        
        }
        
        for (int item : answer) {
        	System.out.println(item);	
        }
        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 수열과 구간 쿼리 2
		 
		 * 문제설명 : 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.

					각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 찾습니다.
					
					각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요.
					단, 특정 쿼리의 답이 존재하지 않으면 -1을 저장합니다.
		 * 제한사항 : 1 ≤ arr의 길이 ≤ 1,000
					0 ≤ arr의 원소 ≤ 1,000,000
					1 ≤ queries의 길이 ≤ 1,000
					0 ≤ s ≤ e < arr의 길이
					0 ≤ k ≤ 1,000,000
		 * 입력 : [0, 1, 2, 4, 3]	[[0, 4, 2],[0, 3, 2],[0, 2, 2]]
		 * 출력 : [3, 4, -1]
		  	
		 
		 결론 : 
		 	1. Math.min 을 사용하는 다른 사람들의 풀이를 보았음.
		 	2. 배열은 추가되지 않고 첫 사용부터 길이를 부여해야 한다는 사실이 어려움.
		 */
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
		System.out.println(solution(arr, queries));
	}
}
