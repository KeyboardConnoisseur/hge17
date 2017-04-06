package hge17;

public class Player extends Thing {
	private final int MAX_SPEED = 120;
	
	private int speedY;
	private int speedX;
	private int maxSpeed = 15;

	private double posX;
	private double posY;

	// default constructor
	public Player() {
		this.posX = 0;
		this.posY = 0;
	}

	public Player(int x, int y) {
		this.posX = x;
		this.posY = y;
	}

	// Movement Helpers
	public void speedUpX(int n) {
		if (this.speedX < this.maxSpeed)
			this.speedX += n;
	}

	public void speedUpY(int n) {
		if (this.speedY > -this.maxSpeed)
			this.speedY -= n;
	}

	public void slowDownX(int n) {
		if (this.speedX > -this.maxSpeed)
			this.speedX -= n;
	}

	public void slowDownY(int n) {
		if (this.speedY < this.maxSpeed)
			this.speedY += n;
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
	public void setMaxSpeed(int n) {
		this.maxSpeed = n;
	}
	public void changeMaxSpeed(int n) {
		if (this.maxSpeed < this.MAX_SPEED)
			this.maxSpeed += n;
		if (this.maxSpeed > MAX_SPEED)
			this.maxSpeed = MAX_SPEED;
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
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
}