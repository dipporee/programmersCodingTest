package programmersCodingTest.codingTest.level0;

import java.util.ArrayList;
import java.util.List;

public class 배열_조각하기 {
	
    public static int[] solution(int[] arr, int[] query) {
        
        // 1. 첫 번째 방법
//        String temp = "";
//        
//        for (int i : arr) {
//            temp += i;
//        }
//        
//        for (int j : query) {
//            if (j % 2 == 0) {
//            	temp = temp.substring(0, temp.length() - 1);
//            } else {
//            	temp = temp.substring(1);
//            }
//        }
//        
//        String[] arrTemp = temp.split("");
//        
//        for (int a = 0; a < arrTemp.length; a++) {
//            answer[a] = Integer.parseInt(arrTemp[a]);
//        }
        
        // 2. 두 번째 방법
        int[] answer = new int[arr.length - query.length];
        List<Integer> intList = new ArrayList<Integer>();
        
        for (int i : arr) {
        	intList.add(i);
        }
        
        for (int j : query) {
        	if (j % 2 == 0) {
        		intList.remove(intList.size() - 1);
        	} else {
        		intList.remove(0);
        	}
        }
  
        for (int i = 0; i < intList.size(); i++) {
        	answer[i] = intList.get(i);
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * 배열 조각하기
		 
		 * 문제설명 : 정수 배열 arr와 query가 주어집니다.
					
					query를 순회하면서 다음 작업을 반복합니다.
					
					짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
					홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
					위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
					
		 * 제한사항 : 5 ≤ arr의 길이 ≤ 100,000
					0 ≤ arr의 원소 ≤ 100
					1 ≤ query의 길이 < min(50, arr의 길이 / 2)
					query의 각 원소는 0보다 크거나 같고 남아있는 arr의 길이 보다 작습니다.
		 * 입력 : [0, 1, 2, 3, 4, 5]	[4, 1, 2]
		 * 출력 : [1, 2, 3]
		  	
		 
		 결론 : 
		 	문제! 자바에서 배열은 그 길이를 늘였다가 줄였다가 할 수 잆다. 
		 	그래서 나는 저번이랑 같은 방법으로 
		 	1. int 배열을 String으로 변환한 후
		 	2. 값을 넣고 빼고 한 후 
		 	3. 다시 int로 변환 후 
		 	4. 배열로 만들어 주었다.
		 	-> 코드 실행은 되었는데 제출추 채점하기가 되지 않았다. 런타임 오류...
		 	
		 	그래서 배열을 자유롭게 넣고 빼고 하기 위해서는 이것을 리스트로 변환한 후 다시 배열로 바꾸는 방법이 있다.
		 	파이썬은 쉬우려나 하는 마음이 들기 시작한다...
		 	
		 	두 번째 방법으로 했으나 길이는 비슷한 것 같다. 
		 	
		 */
		
		int[] arr = {0, 1, 2, 3, 4, 5};
		int[] query = {4, 1, 2};
		
		solution(arr, query);
		
	}
}
