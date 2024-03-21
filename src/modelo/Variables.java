package modelo;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;

public class Variables {
	
	//Pantalla
	public static Toolkit tk = Toolkit.getDefaultToolkit();
	public static int resolucionX = 1000;
	public static int resolucionY = 650;
	
	public static int cordX = 100;
	public static int cordY = 100;
	
	public static BufferedImage imagenFondo;
	//Pantalla
	
	
	public static String mensajeInicio = 
			"Esta aplicacion es para almacenar"
			+ "\n" + "y usar funciones que ayudan"
			+ "\n" + "en problemas a forma de tutorio o referencia."
			+ "\n" + "Esta en desarroyo y se espera que"
			+ "\n" + "llegue a tener muchos tipos de funciones";
}
