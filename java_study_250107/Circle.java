package java_study_250107;

import java.awt.Color;
import java.awt.Graphics;

public class Circle { //적(공) 클래스
	
	private int x; //공 x좌표
	private int y; //공 y좌표
	private int width = 60; //공 크기
	private int height = 60; //공 높이
	
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move() {
		y += 3; //공은 y축(세로)으로 움직임
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.GRAY); //공 색깔
		g.fillOval(x, y, width, height); //공 좌표와 크기 설정
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	

}
