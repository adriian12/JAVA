package com.foobarspam.testing;

import java.util.ArrayList;

import com.foobarspam.figuras.Drawable;
import com.foobarspam.figuras.Ellipse;
import com.foobarspam.figuras.GeometricShape;
import com.foobarspam.figuras.Rectangle;
import com.foobarspam.figuras.Square;

public class MultiplePrintingTests {

	public static void main(String[] args) {
	
		testDiferentesTipos();
			
		}

	public static void testDiferentesTipos() {
				
		Square cuadrado = new Square("Pedro",2.0);
		Rectangle rectangulo = new Rectangle("Juan",2.0,3.2);
		Ellipse elipse = new Ellipse("David",2.3,4.2);
		
		
		//Imprimir áreas
		ArrayList<GeometricShape> listaDeFiguras = new ArrayList<>();

		listaDeFiguras.add(cuadrado);
		listaDeFiguras.add(rectangulo);
		listaDeFiguras.add(elipse);
		
		
		for (GeometricShape figura : listaDeFiguras) {
			System.out.println(figura.area());
		}
		
		//Dibujar figuras
		ArrayList<Drawable> listaDeFiguras2 = new ArrayList<>();
		
		listaDeFiguras2.add(cuadrado);
		listaDeFiguras2.add(rectangulo);
		listaDeFiguras2.add(elipse);
		
		for (Drawable figura : listaDeFiguras2) {
			figura.draw();
		}
		
		
		//Aplicar temas
		for (Drawable figura : listaDeFiguras2) {
			try {
				figura.applyTheme();
			} catch (UnsupportedOperationException exception) {
				System.out.println(exception);
			}
		}
	
		
	
	}

}
