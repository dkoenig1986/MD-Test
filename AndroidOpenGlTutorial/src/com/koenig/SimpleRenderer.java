package com.koenig;

import java.util.Random;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.opengl.GLSurfaceView.Renderer;

public class SimpleRenderer implements Renderer {

	Random random = new Random();

	@Override
	public void onDrawFrame(GL10 gl) {
		gl.glClearColor(random.nextFloat(), random.nextFloat(),
				random.nextFloat(), 1);
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void onSurfaceChanged(GL10 arg0, int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig glConfig) {
		// TODO Auto-generated method stub

	}

}
