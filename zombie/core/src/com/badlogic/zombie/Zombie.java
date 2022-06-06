package com.badlogic.zombie;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.*;

public class Zombie extends ApplicationAdapter {

	
	private Texture backgroundGame;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Rectangle backgroundGameRec;

	public void create(){
		backgroundGame = new Texture(Gdx.files.internal("background game2.png"));
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800,480);
		batch = new SpriteBatch();
		backgroundGameRec = new Rectangle();
		backgroundGameRec.x = 0;
		backgroundGameRec.y = 0;
		backgroundGameRec.width = 800;
		backgroundGameRec.height = 480;



	}

	public void render(){
		ScreenUtils.clear(0.2f,0,0,1);
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		batch.draw(backgroundGame,backgroundGameRec.x,backgroundGameRec.y);
		batch.end();
	}
}
