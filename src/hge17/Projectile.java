package hge17;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import java.lang.Math;

public class Projectile extends Thing {
	private final int speed = 25;
	
	private Image sheet;
	
	private double posX;
	private double posY;
	
	private double slope;
	private double dir;
	
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
		this.sheet = new Image("re/bulletSheet.png");
	}
	
	public Projectile(double x, double y, double dX, double dY) throws SlickException {
		this.sheet = new Image("res/bulletSheet.png");
		this.posX = x;
		this.posY = y;
		this.slope = (y - dY) / (x - dX);
		this.dir = (x < dX) ? 1 : -1;
		//this.deltaX = dir * (Math.sqrt(speed / ));
	}
	
	public Image getSheet() {
		return this.sheet;
	}
}
