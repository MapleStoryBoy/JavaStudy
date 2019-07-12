package mystudy;

import java.awt.*;
import javax.swing.*;
public class BallGame2 extends JFrame {
	
	//加载图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x = 100;
	double y = 100;
	double degree = 3.14/3;
	
	//画窗口的方法
	public void paint(Graphics g) {
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x = x + 10*Math.cos(degree);
		y = y + 10*Math.sin(degree);
		
		if (y>500-40-30||y<40+40) {
			degree = -degree;
		}
		
		// 碰到右边边界
		if(x<40||x>856-40-30) {
			degree = 3.14 - degree;
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
		BallGame2 game = new BallGame2();
		game.launchFrame();
		

	}

}