package lifeGame;

import javax.swing.JFrame;

public class lifeGame  extends JFrame{
	public lifeGame(){
		setTitle("������Ϸ");
		setSize(600,600);
		setLocationRelativeTo(null);//���ھ���
		lifeGamePanel panel = new lifeGamePanel();
		//panel.action();
		addKeyListener(panel);//�󶨼����¼��ļ���
		add(panel);
		setVisible(true);
		//���ڹر�ʱ����̨����Ҳ��֮�ر�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
	//�������ڣ�main����
	public static void main(String[] args){
		lifeGame frame = new lifeGame();
	}
}