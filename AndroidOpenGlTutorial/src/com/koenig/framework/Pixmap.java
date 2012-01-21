package com.koenig.framework;

import com.koenig.framework.Graphics.PixmapFormat;

public interface Pixmap {

	public int getWidth();

	public int getHeight();

	public PixmapFormat getFormat();

	public void dispose();

}
