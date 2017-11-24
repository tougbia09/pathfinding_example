package net.joedoe;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import net.joedoe.screens.Maze;

public class GameMain extends Game {
    private SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new Maze(this));
    }

    @Override
    public void render() {
        super.render();
    }

    public SpriteBatch getBatch() {
        return this.batch;
    }

    public void dispose() {
        batch.dispose();
    }
}
