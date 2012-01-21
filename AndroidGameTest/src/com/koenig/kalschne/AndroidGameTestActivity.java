package com.koenig.kalschne;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import com.koenig.kalschne.renderer.SquareRenderer;

public class AndroidGameTestActivity extends Activity {

	private GLSurfaceView glSurfaceView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Test Comment
		glSurfaceView = new GLSurfaceView(this);
		glSurfaceView.setRenderer(new SquareRenderer());
		setContentView(glSurfaceView);
	}

	@Override
	protected void onResume() {
		super.onResume();
		glSurfaceView.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
		glSurfaceView.onPause();
	}
}