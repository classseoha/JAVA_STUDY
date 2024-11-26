package java_study_241126;

public class 복습 {

	public static void main(String[] args) {
		
		//for문(반복문)
		for(int i = 0; i < 3; i++) {
			System.out.print("Hello World! ");
		}System.out.println();
		
		//1~100까지의 숫자 중 3의 배수 출력
		for(int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}System.out.println();

		//1시간에 2배만큼 증식하는 세균 10시간 후 마리수
		int x = 20;
		int t = 10;
		
		for(int i = 0; i < 10; i++) {
			x *= 2;
		}System.out.println("세균 수: " + x);
		
		//문제12. 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될 때까지
		//다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다. 
		//1-1. 입력된 수가 짝수라면 2로 나눕니다. 
		//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
		//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 
		//주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 
		//1이 됩니다. 위 작업을 몇 번이나 반복해야 출력하시오.
		int n2 = 6; //주어진 수
		int count2 = 0;
		
		while(n2 != 1) {
			if(n2 % 2 == 0) {
				n2 /= 2;
				count2++;
			}else {
				n2 = (n2 * 3) -1;
				count2++;
			}
		}System.out.println(count2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
