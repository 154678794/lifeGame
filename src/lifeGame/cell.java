package lifeGame;

import java.awt.Image;

public class cell {
	private Image image;//ͼƬ����
	private int row;//������
	private int col;//������
	
	
	public cell() {
		super();
	}
	public cell(Image image, int row, int col) {
		super();
		this.image = image;
		this.row = row;
		this.col = col;
	}
	
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
}
