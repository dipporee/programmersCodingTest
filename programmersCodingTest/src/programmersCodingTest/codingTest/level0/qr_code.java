package programmersCodingTest.codingTest.level0;

public class qr_code {
	
    public static String solution(int q, int r, String code) {
        String answer = "";
        String[] arrCode = code.split("");
        
        for (int i = 0; i < arrCode.length; i++) {
            if (i % q == r) {
                answer += arrCode[i];
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		/*
		 
		 * qr code
		 
		 * 문제설명 : 두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 나머지가 
		  			r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		 * 제한사항 : 0 ≤ r < q ≤ 20
					r < code의 길이 ≤ 1,000
					code는 영소문자로만 이루어져 있습니다.
		 * 입력 : 3	1	"qjnwezgrpirldywt"
		 * 출력 : "jerry"
		  	
		 
		 결론 : 
		 	1. 간단하게 배열을 사용하여 문제를 풀었다. 
		 */
		
		System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
	}
}
