package hge17;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Projectile extends Thing {
	private Image sheet;
	
	private double posX;
	private double posY;
	
	public void setPosX(double d) {
		this.posX = d;
	}
	public void setPosY(double d) {
		this.posY = d;
	}
	
	public double getPosX() {
		return this.posX;
	}
	public double getPosY() {
		return this.posY;
	}
	
	public Projectile () throws SlickException {
		sheet = new Image("re/bulletSheet.png");
	}
	
	public Projectile(double x, double y) throws SlickException {
		sheet = new Image("res/bulletSheet.png");
		this.posX = x;
		this.posY = y;
	}
	
	public Image getSheet() {
		return this.sheet;
	}
}
