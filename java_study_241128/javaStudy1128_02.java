package java_study_241128;

public class javaStudy1128_02 {

	public static void main(String[] args) {
		
		//문자열
		String text = "ediya";
		
		System.out.println(text.length()); //문자열 길이 출력
		
		String userId = "홍길동";
		if(userId.length() >= 10) { //문자열 길이가 10 이상이라면?
			System.out.println("아이디는 10글자 미만으로 작성해주세요.");
		}else {
			System.out.println("사용 가능한 아이디입니다.");
		}

		//concat: 두 문자열 합치기(빈도수 5%)
		String a = "apple";
		String b = "watch";
		System.out.println("문자열 합치기: " + a.concat(b));
		
		//**substring: 부분 문자열 추출(빈도수 80~90%)
		String text1 = "Hello, World!";
		System.out.println(text1.substring(0, 5));
		//퀴즈: Wor >> 서브스트링으로 해당 단어 출력하기
		System.out.println(text1.substring(7, 10));
		
		//**indexOf: 문자열 검색 >> 해당 문자가 몇번째 위치하는지 조회(중복시 가장 앞 글자가 출력됨)
		System.out.println(text1.indexOf("l"));
		System.out.println(text1.indexOf("W"));
		
		//***replace: 문자열 대체
		String word = "순대국밥";
		System.out.println(word.replaceAll("순대", "돼지"));
		
		//*toUpper, toLower: 소문자 > 대문자, 대문자 > 소문자 변경
		String code = "adcd00";
		System.out.println(code.toUpperCase()); //소문자에서 대문자로 강제변환
		
		//**trim: 공백 제거
		String word2 = "    안녕하세요?   ";
		System.out.println(word2.trim()); //앞뒤 공백 제거
		
		//***split: 문자 분할(실무에서 데이터분석 혹은 코딩테스트 단골 손님)
		String word3 = "한화이글스,두산베어스,롯데자이언츠";
		String[] result = word3.split(","); //해당 문자를 콤마를 기준으로 나눈다.
		System.out.println(result[0]);
		System.out.println(result[2]);
		
		//**contains: 특정 문자열이 포함되어 있는지 여부 확인
		String word4 = "hyunsangwon93@gmail.com";
		System.out.println(word4.contains("@")); //있으면 true, 없으면 false
		System.out.println(word4.contains("e"));
		
		//***equals: 문자열 비교(*자바에서만 많이 사용)
		String food = "등심돈까스";
		String food2 = "등심돈까스";
		String food3 = "치즈돈까스";
		// ==(비교연산자), 자바에서는 문자열 비교는 equals로 함
		System.out.println(food.equals(food2)); //두 문자가 동일한지 비교
		System.out.println(food.equals(food3)); 
		
		
		
		
		
		
		
	
	}

}
