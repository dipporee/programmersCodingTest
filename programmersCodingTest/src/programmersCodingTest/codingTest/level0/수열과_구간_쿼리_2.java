package programmersCodingTest.codingTest.level0;

public class 수열과_구간_쿼리_2 {
	
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int j = 0; j < queries.length; j++) {
        	String temp = "";
            for (int i = 0; i < arr.length; i++) {            
                if (queries[j][0] <= arr[i] && arr[i] >= queries[j][1]) {
                	temp += "," + arr[i];
                } else {
                	temp += -1;
                }
            }   
            
            int min = -1;
            if (!temp.equals("-1")) {
            	temp = temp.substring(1);
                String[] arrStr = temp.split(","); 
                
                min = Integer.parseInt(arrStr[0]); //최소값
                for (String str : arrStr) {
                	int num = Integer.parseInt(str);
                    if (min > num) {
                        min = num;
                    }
                }
            } 
            
            answer[j] = min;                        
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
