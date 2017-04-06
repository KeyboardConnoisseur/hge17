package hge17;

public class RangedWeapon implements Weapon {
	private int damage;
	private double range;
	private double spread;
	
	@Override
	public void setDamage(int n) {
		this.damage = n;
	}
	public void setRange(double d) {
		this.range = d;
	}
	public void setSpread(double d) {
		this.spread = d;
	}
	
	@Override
	public int getDamage() {
		return this.damage;
	}
	public double getRange() {
		return this.range;
	}
	public double getSpread() {
		return this.spread;
	}
}
