package programmersCodingTest.codingTest.level0;

public class 수열과_구간_쿼리_2 {
	
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length - 1];
        
        for (int j = 0; j < queries.length; j++) {
            int[] temp = {};
            for (int i = 0; i < arr.length; i++) {            
                if (queries[i][0] <= arr[i] ) {
                	temp = new int[temp.length + 1];
                    temp[temp.length] = arr[i];
                }
            }   
            
            int min = temp[0]; //최소값
            for (int num : temp) {
                if (min > num) {
                    min = num;
                }
            }
            
            //temp = new int[temp.length + 1];
            answer[answer.length] = min;
            
        }
        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 
		 
		 * 문제설명 : 
		 * 제한사항 :
		 * 입력 : 
		 * 출력 : 
		  	
		 
		 결론 : 
		 	1. 
		 */
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
		System.out.println(solution(arr, queries));
	}
}
