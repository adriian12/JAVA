package com.foobarspam.figuras;

public interface Drawable {
	
	void draw();
	
	default void applyTheme() {
		throw new UnsupportedOperationException("Can't use 'applyTheme' method.");
	}
	
}
