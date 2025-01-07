package java_study_250107;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class HelloSwing extends JFrame { //Frame: 화면 틀을 상속 받음
	
	
	HelloSwing() { //앞에 public 생략 가능
		
		setTitle("Hello Swing"); //화면 제목
		setSize(300, 200); //화면 사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Hello, Swing!"); //글자 생성
		add(label); //프로그램에 글자 추가
		
		JLabel nameLabel = new JLabel("안녕하세요. 저는 홍길동 입니다.");
		add(nameLabel);
		
		setVisible(true); //화면 보이게 하기
		
	}
}

class GridLayoutExample extends JFrame {
	/*
	 * GridLayoutExample(자식클래스)가 JFrame(부모클래스)를 상속받음
	 * 자식클래스에서 부모클래스 메소드를 사용할 수 있음(재사용 가능 > 오버라이딩)
	 */
	public GridLayoutExample() {
		setTitle("그리드 레이아웃 연습"); //setTitle()은 JFrame에 있는 함수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프로그램 닫기 버튼 클릭 시 종료
		setSize(400, 300); //화면 사이즈
		
		JPanel panel = new JPanel(new GridLayout(3, 2)); //3행 2열 레이아웃을 만들겠다라는 뜻
		
		for(int i = 1; i < 7; i++) {
			panel.add(new JButton("Button " + i)); //판넬에 버튼 추가하기
		}
		add(panel); //프레임에 판넬 추가하기
		setVisible(true); //최종 화면에 보여주기
		
	}
}



public class MyFrame {

	public static void main(String[] args) {
		
		/*
		 * GUI(그래픽 사용자 인터페이스)
		 * 자바 스윙(Swing)은 자바에서 GUI를 만들기 위한 순수 자바 라이브러리
		 * 1. 모든 컴포넌트(버튼, 입력창, 선택창 등등) 클래스 이름이 "J"로 시작함
		 * 2. 운영체제와 독립적인 경량 컴포넌트
		 * 3. 다양하고 풍부한 GUI 컴포넌트 제공
		 */
		
		//HelloSwing h = new HelloSwing();
		
		GridLayoutExample grid = new GridLayoutExample();
		


	}

}
