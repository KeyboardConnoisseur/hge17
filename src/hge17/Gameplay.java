package hge17;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Gameplay extends BasicGameState {
	// globals
	public final int ID = 2;

	// instance variables
	private Player player;
	private Input input;

	// stuff to do upon initialization
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		player = new Player();
		input = new Input(720);
		player.setImg("res/player.jpg");
	}

	// do the game logic (magic)
	public void update(GameContainer gc, StateBasedGame sbg, int n) {
		if (input.isKeyDown(Input.KEY_W))
			player.speedUpY(5);
		if (input.isKeyDown(Input.KEY_S))
			player.slowDownY(5);
		if (!(input.isKeyDown(Input.KEY_W) ^ input.isKeyDown(Input.KEY_S)))
			player.setSpeedY(0);
		if (input.isKeyDown(Input.KEY_A))
			player.slowDownX(5);
		if (input.isKeyDown(Input.KEY_D))
			player.speedUpX(5);
		if (!(input.isKeyDown(Input.KEY_A) ^ input.isKeyDown(Input.KEY_D)))
			player.setSpeedX(0);
		player.move();
	}

	// render graphics
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawAnimation(new Animation(new SpriteSheet(new Projectile(0,0,0,0).getSheet(),16,16),500), 500, 500);
		g.drawImage(player.getImg(), (float) player.getPosX(), (float) player.getPosY());
	}

	// get the ID of this game state
	public int getID() {
		return this.ID;
	}
}
