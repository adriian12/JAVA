package com.foobarspam.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.foobarspam.figuras.Drawable;
import com.foobarspam.figuras.Ellipse;
import com.foobarspam.figuras.GeometricShape;
import com.foobarspam.figuras.Rectangle;
import com.foobarspam.figuras.Square;

public class DrawableTest {

	@Test
	public void testDibujarEnCuadrado() {
		Square c = new Square(2.0);
		assertTrue(c instanceof Square);
		assertTrue(c instanceof GeometricShape);
		assertTrue(c instanceof Drawable);
	}
	
	@Test
	public void testDibujarRectangulo() {
		Rectangle c = new Rectangle(2.0,3.2);
		assertTrue(c instanceof Rectangle);
		assertTrue(c instanceof GeometricShape);
		assertTrue(c instanceof Drawable);
	}
	

	@Test
	public void testDibujarElipse() {
		Ellipse c = new Ellipse(2.0,3.2);
		assertTrue(c instanceof Ellipse);
		assertTrue(c instanceof GeometricShape);
		assertTrue(c instanceof Drawable);
	}
	
	
	Drawable rectangulito = new Rectangle(2.3,3.2);
	//rectangulito.dibujar();
	
	

}
