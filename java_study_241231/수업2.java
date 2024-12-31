package java_study_241231;

import java.util.ArrayList;

class Emp { //Emp(사원) 클래스 생성
	String ename; //사원이름
	int sal; //급여
	String dname; //부서
	String job; //담당업무
	
	Emp(String ename, int sal, String dname, String job){
		this.ename = ename;
		this.sal = sal;
		this.dname = dname;
		this.job = job;
	}
}

public class 수업2 {

	public static void main(String[] args) {
		
		/*
		 * ArrayList: 동적 크기 조절이 가능한 자료구조(배열)
		 * HashSet: 중복이 허용되지 않고 고유한 값만 저장되는 자료구조(배열)
		 * HashMap: key와 value를 한 쌍으로 데이터를 저장하는 자료구조(배열)
		 */
		ArrayList<Emp> emp = new ArrayList<>(); //객체배열과 같은 개념
		
		//데이타 추가
		emp.add(new Emp("KING", 5000, "PRESIDENT", "ACCOUNTING"));
		emp.add(new Emp("JONSE", 2975, "SALESMAN", "SALES"));
		emp.add(new Emp("ALLEN", 1250, "SALESMAN", "SALES"));
		emp.add(new Emp("TURNER", 1500, "SALESMAN", "SALES"));
		
		//1번째 저장된 사원 조회
		Emp e1 = emp.get(1);
		System.out.println("사원 이름: " + e1.ename);
		System.out.println("사원 급여: " + e1.sal);
		
		//모든 사원의 급여 총합과 급여 평균을 조회
		int salSum = 0; //급여 총합
		for(Emp e : emp) {
			salSum += e.sal; //list에 저장된 각 사원의 sal 합산
		}System.out.println("사원 총 급여: " + salSum + ", 급여 평균: " + salSum/emp.size());
		
		//퀴즈: SALES 부서에서 일하는 사원 수 구하기
		int saleCnt = 0;
		for(Emp e : emp) {
			if(e.job.equals("SALES")) {
				saleCnt++;
			}
		}System.out.println("SALES 부서 사원수: " + saleCnt);
		
		//퀴즈: 사원이름 ALLEN, TURNER의 급여와 부서 조회
		for(Emp e : emp) {
			if(e.ename.equals("ALLEN")) {
				System.out.println("ALLEN 급여: " + e.sal + ", ALLEN 부서: " + e.dname);
			}
			if(e.ename.equals("TURNER")) {
				System.out.println("TURNER 급여: " + e.sal + ", TURNER 부서: " + e.dname);
			}
		}
		
		for(Emp e : emp) {
			if(e.ename.equals("ALLEN") || e.ename.equals("TURNER")) {
				System.out.println("급여: " + e.sal + ", 부서: " + e.dname);
			}
		}
		
	}

}
