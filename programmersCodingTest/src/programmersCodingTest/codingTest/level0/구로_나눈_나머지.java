package programmersCodingTest.codingTest.level0;

public class 구로_나눈_나머지 {
	
    public static int solution(String number) {
        int answer = 0;
        String[] arrStr = number.split("");
        
        for (String str : arrStr) {
        	answer += Integer.parseInt(str);
        }
        
        return answer % 9;
    }

	public static void main(String[] args) {
		/*
		 
		 * 9로 나눈 나머지
		 
		 * 문제설명 : 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
					이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
		 * 제한사항 : 1 ≤ number의 길이 ≤ 100,000
					number의 원소는 숫자로만 이루어져 있습니다.
					number는 정수 0이 아니라면 숫자 '0'으로 시작하지 않습니다.
		 * 입력 : "123" / "78720646226947352489"
		 * 출력 : 6 / 2
		  	
		 
		 결론 : 
		 	1. String 을 int 로 변환 가능해야 한다. 
		 */
		
		System.out.println(solution("78720646226947352489"));
	}
}
