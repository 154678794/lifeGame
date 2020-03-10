package lifeGame;

import javax.swing.JFrame;

public class lifeGame  extends JFrame{
	public lifeGame(){
		setTitle("生命游戏");
		setSize(600,600);
		setLocationRelativeTo(null);//窗口居中
		lifeGamePanel panel = new lifeGamePanel();
		//panel.action();
		addKeyListener(panel);//绑定键盘事件的监听
		add(panel);
		setVisible(true);
		//窗口关闭时，后台程序也随之关闭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
	//程序的入口，main方法
	public static void main(String[] args){
		lifeGame frame = new lifeGame();
	}
}