package fr.somedagpistudents.wallshooter;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import fr.somedagpistudents.wallshooter.world.InputController;
import fr.somedagpistudents.wallshooter.world.World;
import fr.somedagpistudents.wallshooter.world.WorldRenderer;

public class WallShooter extends ApplicationAdapter {
	public final static int SCREEN_WIDTH = 1280;
	public final static int SCREEN_HEIGHT = 720;
	public final static int CAM_X_SPEED = 2;

	private World world;
	private WorldRenderer worldRenderer;

	@Override
	public void create () {
		this.world = new World();
		this.worldRenderer = new WorldRenderer(this.world);
		InputController inputController = new InputController(this.world,3,3);
		Gdx.input.setInputProcessor(inputController);
	}

	@Override
	public void render () {
		this.world.update();
		this.worldRenderer.render();
	}
	
	@Override
	public void dispose () {
		this.worldRenderer.dispose();
	}
}
