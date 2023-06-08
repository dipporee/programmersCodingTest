package programmersCodingTest.codingTest.level0;

public class 문자열_썪기 {
	
    public static String solution(String str1, String str2) {
    	String answer = "";
    	String[] arrStr1 = str1.split("");
    	String[] arrStr2 = str2.split("");
    	
    	int leg = (arrStr1.length > arrStr2.length) ? arrStr1.length : arrStr2.length; 
    	
    	for(int i = 0; i < leg; i++) {
    		if(i < arrStr1.length ) {
    			answer += arrStr1[i];
    		}
			if(i < arrStr2.length ) {
				answer += arrStr2[i];			
    		}
    	}
        
    	System.out.println(answer);
    	
        return answer;
    }
    
	public static void main(String[] args) {
		/*
		 
		 * 문자열 섞기
		 
		 * 문제실행 : 길이가 같은 두 문자열 str1과 str2가 주어집니다.
					두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
					
		 * 제한사항 : 
					1 ≤ str1의 길이 = str2의 길이 ≤ 10
					str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
		 * 입력 : "aaaaa"	"bbbbb"
		 * 출력 : "ababababab"
		  	
		 
		 결론 : 
		 	1. 
		 */
		
		solution("aaaaa", "bbbbb");
		
	}
}
