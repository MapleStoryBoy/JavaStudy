package mystudy;

import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame {
	
	//加载图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100;
	double y = 100;
	boolean right = true;
	
	//画窗口的方法
	public void paint(Graphics g) {
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		if(right) {
			x = x + 10;
		}else {
			x = x - 10;
		}
		
		if(x>856-40-30) {
			right = false;
		}
		
		if(x<40) {
			right = true;
		}
		
		
	}
	
	// 窗口加载
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		//重画窗口
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	//main方法是程序执行的入口
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BallGame game = new BallGame();
		game.launchFrame();
		

	}

}
