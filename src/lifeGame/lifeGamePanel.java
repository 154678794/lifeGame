package lifeGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class lifeGamePanel extends JPanel implements KeyListener{
	
	private cell[][] walls = new cell[22][22];
	private int CELL_SIZE = 26;
	public static Image liveCell;
	static{
		liveCell = new ImageIcon("image/S.png").getImage();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//������ͼƬ
//		g.drawImage(bkImg,0,0,null);
//		g.translate(15, 15);
		//��ǽ�ϵĸ��ӻ��߸����е�ͼƬ
		walls[3][3]=new cell(liveCell,3,3);
		paintWall(g);
		//ϸ�����״̬
		
		//CellState();
		//��״̬(���Ǹ���state������ͬ��ͼƬ)
//		paintState(g);
		
	}
	
	
	//ϸ���ı仯�����״̬
//	private void CellState() {
//		// ѭ������ÿ�������ж�ÿ��������Χ���
//		for(int row=1;row<walls.length-1;row++){
//			for(int col=1;col<walls[row].length-1;col++){
//				int CellNum=0;
//				Object[] object= {
//					walls[row-1][col-1],
//					walls[row-1][col],
//					walls[row-1][col+1],
//					walls[row+1][col-1],
//					walls[row+1][col],
//					walls[row+1][col+1],
//					walls[row][col-1],
//					walls[row][col+1]};
//				for(int n=0;n<8;n++) {
//					if(object[n]!=null) {
//						CellNum++;
//						System.out.println(row);
//						System.out.println(col);
//						System.out.println(CellNum);
//					}
//				}
//				if(CellNum==3) {
//					walls[row][col]=new cell(liveCell,row,col);
//				}else if(CellNum!=2) {
//					walls[row][col]=null;
//				}
				//��ʱ
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

//	public void action() {
//		// TODO Auto-generated method stub
//		
//	}
	public void paintWall(Graphics g){
		//����walls�����ά�����ÿһ��Ԫ�أ�Ԫ��Ϊ�վͻ�
		//�����Σ�Ԫ�ز�Ϊ�վͻ�Ԫ�ص�image
		for(int row=1;row<walls.length-1;row++){
			for(int col=1;col<walls[row].length-1;col++){
				//�õ�ÿһ��cell�������õ�����x��y����
				cell cell = walls[row][col];
				int x=col*CELL_SIZE;
				int y=row*CELL_SIZE;
				
				int CellNum=0;
				Object[] object= {
					walls[row-1][col-1],
					walls[row-1][col],
					walls[row-1][col+1],
					walls[row+1][col-1],
					walls[row+1][col],
					walls[row+1][col+1],
					walls[row][col-1],
					walls[row][col+1]};
				for(int n=0;n<8;n++) {
					if(object[n]!=null) {
						CellNum++;
						System.out.println(row);
						System.out.println(col);
						System.out.println(CellNum);
					}
				}
//				if(CellNum==3) {
//					walls[row][col]=new cell(liveCell,row,col);
//				}else if(CellNum!=2) {
//					walls[row][col]=null;
//				}
//				��ʱ
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				if(cell==null){
					g.drawRect(x,y,CELL_SIZE,CELL_SIZE);
				}else{
					g.drawImage(cell.getImage(),x-1,y-1,null);
				}
			}
		}
	}

}
