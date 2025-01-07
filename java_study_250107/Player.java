package java_study_250107;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;

public class Player { //게임 캐릭터 클래스

	private int x; //캐릭터 x좌표
	private int y; //캐릭터 y좌표
	private int width = 60; //캐릭터 크기
	private int height = 60;; //캐릭터 높이
	private Image playerImage; //캐릭터 이미지
	
	public Player(int x, int y) throws Exception { //셍성자
		
		this.x = x;
		this.y = y;
		//D드라이브에 저장된 이미지 불러오기
		//playerImage = ImageIO.read(getClass().getResource("D:\\game\\user.gif")); 
		
	}
	
	public void draw(Graphics g) { //캐릭터를 화면에 그리기
		
		//g.drawImage(playerImage, x, y, width, height, null); //화면에 캐릭터 그리기
		g.setColor(Color.PINK);
		g.fillOval(x, y, width, height);
	}
}
