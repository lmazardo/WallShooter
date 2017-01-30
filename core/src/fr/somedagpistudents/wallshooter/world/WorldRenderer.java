package fr.somedagpistudents.wallshooter.world;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by benjamin on 1/30/17.
 */
public class WorldRenderer {
    private World world;
    private SpriteBatch batch;
    private Texture img;

    public WorldRenderer(World world) {
        this.world = world;
        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
    }

    public void render() {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, 0, 0);
        batch.end();
    }

    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}