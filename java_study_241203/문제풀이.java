package java_study_241203;

import java.util.Scanner;

public class 문제풀이 {

	public static void main(String[] args) {
		//문제1. 사용자로부터 문자열을 입력받아 문자 길이를 출력하세요.
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		String word = scan.next();
		
		System.out.println("입력한 문자 길이: " + word.length());
		
		//문제2. 문자열을 연결하는 함수는 무엇인가? 3.concat
		
		//문제3. "010-1234-5678" 문자열이 주어질 때 "-" 기준으로 문자열을 분할하려면
		//어떤 문자열 함수를 사용해야하는가? 1.split
		
		//문제4. String text = "Hello World!";
		//위 문자열을 모두 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		String text = "Hello World!";
		System.out.println(text.toUpperCase());
		
		//문제5. 사용자로부터 두 개의 문자열을 입력받아 두 문자열이 같으면 “같습니다.” 
		//틀리면 “다릅니다.” 를 출력하는 프로그램을 작성하세요.
		System.out.print("첫번째 문자: ");
		String a = scan.next();
		System.out.print("두번째 문자: ");
		String b = scan.next();
		
		if(a.equals(b)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		//문제6. 사용자로부터 문자열을 입력받아 그 문자열의 첫 번째와 마지막 문자를 
		//출력하는 프로그램을 작성하세요.
		//예) "안녕하세요" 라는 문자열을 입력했을 때 “안”과 “요”만 출력합니다.
		System.out.print("문자 입력: ");
		String c = scan.next();
		int num = c.length() - 1;
		
		System.out.println(c.substring(0,1));
		System.out.println(c.substring(num));
		
		//문제7. 사용자로부터 문자열과 정수 n을 입력받아,
		//해당 문자열의 앞에서 n개의 문자를 출력하는 프로그램을 작성하세요.
		//예) 입력받은 문자열 “아메리카노” -3- 입력받은 정수 n이 3이라고 가정
		//해당 문자열의 앞에서 3개의 문자 “아메리”가 출력
		System.out.print("문자 입력: ");
		String d = scan.next();
		System.out.print("정수 입력: ");
		int e = scan.nextInt();
		
		System.out.println(d.substring(0,e));
		
		//문제8. String word = "aabbacccaaaaa";
		//위 문자열에서 “a”가 몇 번 나타나는지 세는 프로그램을 작성하세요.
		String word3 = "aabbacccaaaaa";
		String[] wordArr = word3.split("");
		int count = 0;
		
		for(int i = 0; i < wordArr.length; i++) {
			if (wordArr[i].equals("a")) {
				count++;
			}
		}System.out.println("a 개수: " + count);
		
		for(String i : wordArr) {//배열의 길이만큼 자동으로 반복(for-each문)
			if (i.equals("a")) { 
				System.out.println(i);
			}
		}
		
		//문제9. String email = "user@gmail.com";
		//위 문자열에서 split을 사용하여 gmail.com만 출력하시오.
		String email = "user@gmail.com";
		String[] emailArr = email.split("@");
		
		for(int i = 0; i < emailArr.length; i++) {
			if(emailArr[i].equals("gmail.com")) {
				System.out.println(emailArr[i]);
			}
		}
		
		//문제10. 문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을
		//포함하고 있는 모든 문자열을 제외하고 출력하세요.
		String[] strArr = {"there","are","no","a","ds"};
		//예) {"and","notad","abcd"} -> {"and","abcd"}
		//1번 인덱스의 문자열인 "notad"는 부분 문자열로 "ad"를 가집니다.
		//따라서 해당 문자열을 제외한 "and"와"abcd"가 출력됩니다.
		for(int i = 0; i < strArr.length; i++) {
			if(!strArr[i].contains("ad")) {
				System.out.print(strArr[i] + " ");
			}
		}System.out.println();
		
		//문제11. 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
		//문자열 my_string이 변수로 주어질 때 모음을 제거한 문자열을 출력하세요.
		String my_string = "nice to meet you";
		//예)"nice to meet you"에서 모음 i, o, e, u를 모두 제거한 "nc t mt y"를
		//출력합니다.
//		String[] my_arr = my_string.split("");
//		for(int i = 0; i < my_arr.length; i++) {
//			if(my_arr[i].equals("a")) {
//				continue;
//		}else if(my_arr[i].equals("e")) {
//				continue;
//		}else if(my_arr[i].equals("i")) {
//			continue;
//		}else if(my_arr[i].equals("o")) {
//			continue;
//		}else if(my_arr[i].equals("u")) {
//			continue;
//		}System.out.print(my_arr[i]);
//		}System.out.println();
		
		String[] vow = {"a", "e", "i", "o", "u"};
		
		for(String i : vow) {
			my_string = my_string.replaceAll(i, "");
		}System.out.println(my_string);
		
		//문제12. 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
		//문자열 numbers가 변수로 주어질 때, numbers를 정수로 바꿔 출력하세요.
		String numbers = "onefourzerosixseven"; //14067
		//예) "onetwothreefourfivesixseveneightnine"를 숫자로 바꾼
		//123456789를 출력합니다.
		String numbers_n = numbers.replaceAll("zero", "0").replaceAll("one", "1").replaceAll("two", "2").replaceAll("three", "3").replaceAll("four", "4").replaceAll("five", "5").replaceAll("six", "6").replaceAll("seven", "7").replaceAll("eight", "8").replaceAll("nine", "9");
		int aa = Integer.parseInt(numbers_n);
		
		System.out.println(aa);
		
		String[] matchNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for(int i = 0; i < matchNumbers.length; i++) {
			numbers = numbers.replaceAll(matchNumbers[i], Integer.toString(i));
		}
		System.out.println("정답: " + numbers);

	}

}
