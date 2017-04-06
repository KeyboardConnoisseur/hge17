package hge17;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Thing {
	private Image img;
	
	private double height;
	private double width;
	
	private double posX;
	private double posY;
	
	public void setImg(String loc) throws SlickException {
		this.img = new Image(loc);
	}
	
	// mutators for position
	public void setPosX(double x) {
		this.posX = x;
	}
	public void setPosY(double y) {
		this.posY = y;
	}
	public void setPos(double x, double y) {
		this.posX = x;
		this.posY = y;
	}
	
	//-----------------------
	
	// mutators
	public Image getImg() {
		return this.img;
	}
	
	// accessors for position
	public double getPosX() {
		return this.posX;
	}
	public double getPosY() {
		return this.posY;
	}
	public double[] getPos() {
		return new double[] {this.posX, this.posY};
	}
}
