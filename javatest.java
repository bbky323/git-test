/* 상수 학습 내용
 * 1. 명명규칙 - 대문자, _ 문자로 조합한 변수명
 * 		CAR_NAME / PERSON_ID
 * 2. final 키워드로 변수 선언
 * 	- 값 수정 불가 상수
 */
package step01;

public class Finalvariable {
	public static final String MSG = "fisa";

	public static void main(String[] args) {
		System.out.println(Finalvariable.MSG);
		// FinalVariable.MSG = "ce"; 에러임
		
		String data = MSG;
		System.out.println(data);
		data = "ce";
		System.out.println(data);
		System.out.println(MSG);

	}

}
