package java_study_250107_game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.FileInputStream;

public class Player {
    private int x, y;
    private final int WIDTH = 60;
    private final int HEIGHT = 60;
    private Image playerImage;
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        loadImage();
    }
    
    @SuppressWarnings("resource")
	private void loadImage() {
    	
    	FileInputStream playerImage = null;
    	
        try {
            playerImage = new FileInputStream("src/images/user.gif");
            // 이미지 파일은 프로젝트의 resources/images 폴더에 저장해야 합니다
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void moveLeft() { //x축 왼쪽 10만큼 이동
        if (x > 0) x -= 10;
    }
    
    public void moveRight() { //x축 오른쪽 10만큼 이동
        if (x < 460) x += 10;
    }
    
    public void draw(Graphics g) {
        if (playerImage != null) {
            g.drawImage(playerImage, x, y, WIDTH, HEIGHT, null);
        } else {
            // 이미지 로드 실패시 기본 도형으로 표시
            g.setColor(Color.ORANGE);
            g.fillOval(x, y, WIDTH, HEIGHT);
        }
    }
    
    //intersects: 캐릭터와 떨어지는 동그라미 충돌 여부 확인 메소드
    public boolean intersects(Circle mushroom) {
        Rectangle playerBounds = new Rectangle(x, y, WIDTH, HEIGHT);
        Rectangle mushroomBounds = new Rectangle(
            mushroom.getX(), mushroom.getY(), 
            mushroom.getWidth(), mushroom.getHeight()
        );
        //intersects: 충돌되었는지 확인하는 메소드
        return playerBounds.intersects(mushroomBounds);
    }
}