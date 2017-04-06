package hge17;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class GameDriver extends StateBasedGame {
	// globals
	public static final String[] DEVELOPERS = { "Gage Boyd", "Kyle Domingos", "Aaron Goree", "Connor Wiebe" };
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	public static final int FPS = 60;
	public static final double VERSION = 0.1;

	// game state identifiers
	public final int SPLASH_SCREEN = 0;
	public final int MAIN_MENU = 1;
	public final int GAMEPLAY = 2;
	public final int PAUSE_MENU = 3;

	// constructor
	public GameDriver(String gameName) {
		super(gameName);
	}

	public void initStatesList(GameContainer gc) throws SlickException {
		this.addState(new Gameplay());
	}

	public static void main(String[] args) {
		try {
			AppGameContainer game = new AppGameContainer(new GameDriver("hge17 v." + VERSION));
			game.setDisplayMode(WIDTH, HEIGHT, true);
			game.setTargetFrameRate(FPS);
			game.setVSync(true);
			game.setShowFPS(true);
			game.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}

	}
}