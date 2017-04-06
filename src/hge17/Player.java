package hge17;

public class Player extends Thing {
	private int speedY;
	private int speedX;
	private final int MAX_SPEED = 120;

	private double posX;
	private double posY;
	private int heading;

	// default constructor
	public Player() {
		this.posX = 0;
		this.posY = 0;
	}

	public Player(int x, int y) {
		this.posX = x;
		this.posY = y;
	}

	public void speedUpX() {
		if (this.speedX < this.MAX_SPEED)
			this.speedX += 5;
	}

	public void speedUpY() {
		if (this.speedY > -this.MAX_SPEED)
			this.speedY -= 5;
	}

	public void slowDownX() {
		if (this.speedX > -this.MAX_SPEED)
			this.speedX -= 5;
	}

	public void slowDownY() {
		if (this.speedY < this.MAX_SPEED)
			this.speedY += 5;
	}

	public void setSpeedY(int n) {
		this.speedY = n;
	}

	public void setSpeedX(int n) {
		this.speedX = n;
	}

	public void move() {
		this.posX += this.speedX;
		this.posY += this.speedY;
	}

	// mutators for player position
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

	// mutators for misc variables
	public void setHeading(int h) {
		this.heading = h;
	}

	// accessors for player position
	public double getPosX() {
		return this.posX;
	}

	public double getPosY() {
		return this.posY;
	}

	public double[] getPos() {
		return new double[] { this.posX, this.posY };
	}

	// accessors for misc variables
	public int getHeading() {
		return this.heading;
	}
}