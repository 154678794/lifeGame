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
		//画背景图片
//		g.drawImage(bkImg,0,0,null);
//		g.translate(15, 15);
		//画墙上的格子或者格子中的图片
		walls[3][3]=new cell(liveCell,3,3);
		paintWall(g);
		//细胞存活状态
		
		//CellState();
		//画状态(就是根据state来画不同的图片)
//		paintState(g);
		
	}
	
	
	//细胞的变化规则和状态
//	private void CellState() {
//		// 循环遍历每个格子判断每个格子周围情况
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
				//延时
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
		//遍历walls这个二维数组的每一个元素，元素为空就画
		//正方形，元素不为空就画元素的image
		for(int row=1;row<walls.length-1;row++){
			for(int col=1;col<walls[row].length-1;col++){
				//得到每一个cell后，再来得到它的x和y坐标
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
//				延时
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
