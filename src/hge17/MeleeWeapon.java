package hge17;

public class MeleeWeapon implements Weapon {
	private int damage;
	private double reach;
	private double swing;
	
	@Override
	public void setDamage(int d) {
		this.damage = d;
	}
	public void setReach(double d) {
		this.reach = d;
	}
	public void setSwing(double d) {
		this.swing = d;
	}
	
	@Override
	public int getDamage() {
		return this.damage;
	}
	public double getReach() {
		return this.reach;
	}
	public double getSwing() {
		return this.swing;
	}
}
