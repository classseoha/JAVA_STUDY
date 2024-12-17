package java_study_241217;
/*
 * Scanner 클래스 >> 내장클래스, 수정불가 
 * Random 클래스 >> 내장클래스, 수정불가
 */
class 계산기 {
	//계산기 클래스는 더이상 수정불가하다 가정하고 상속 진행
	public int sum(int x, int y) {
		return x + y;
	}
}
//*****extends: 상속
/*
 * 상속을 이용해 '계산기' 클래스 기능을 물려받을 수 있음
 * 향상된 계산기(자식클래스 == SubClass)는 
 * 계산기(부모클래스 == SuperClass)에 있는 필드변수와 메소드를 사용할 수 있다.
 */
class 향상된계산기 extends 계산기{
	//부모클래스에 있는 메소드 가져오기
	@Override //오버라이딩(부모클래스 메소드 재정의)
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return super.sum(x, y);
	}
	public int minus(int x, int y) {
		return x - y;
	}
}
public class 수업 {

	public static void main(String[] args) {
		
		계산기 계산기1 = new 계산기();
		int result = 계산기1.sum(10, 10);
		System.out.println("결과: " + result);
		
		//빼기와 더하기 기능이 있는 클래스가 필요
		향상된계산기 향계 = new 향상된계산기();
		int result2 = 향계.sum(10, 10);
		int result3 = 향계.minus(10, 10);
		System.out.println("결과: " + result2);
		System.out.println("결과: " + result3);
		/*
		 * 자바는 무료 오픈소스이기 때문에 내장클래스를 확인할 수 있음
		 */
	}
}