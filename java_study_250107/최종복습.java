package java_study_250107_game;

import java.util.ArrayList;

class Emp {
	private String ename; //이름
	private int sal; //급여
	
	public Emp(String ename, int sal) {
		this.ename = ename;
		this.sal = sal;
	}
	
	public String getEname() {
		return ename;
	}
	
	public int getSal() {
		return sal;
	}
	
	
}

//ArrayList 최종복습
public class 최종복습 {

	public static void main(String[] args) {

		ArrayList<Emp> empList = new ArrayList<>();
		
		//사원추가
		empList.add(new Emp("홍길동", 4000));
		empList.add(new Emp("박길동", 1000));
		empList.add(new Emp("김길동", 2000));
		empList.add(new Emp("이길동", 6000));
		
		//퀴즈1. 사원 전체 조회
		System.out.print("사원 명단: ");
		for(Emp e : empList) {
			System.out.print(e.getEname() + "\t");
		}
		System.out.println();
		
		//퀴즈2. 사원 급여 총합 구하기
		int sum = 0;
		for(Emp e : empList) {
			sum += e.getSal();
		}System.out.println("급여 총합: " + sum);
	}

}
