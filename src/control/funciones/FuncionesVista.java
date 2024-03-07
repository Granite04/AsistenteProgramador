package control.funciones;

import java.awt.Rectangle;

import modelo.Variables;
import vista.*;

public class FuncionesVista {
	
	public static void cambioVentana(Rectangle Cordenada, int x, int y) {
		cordenadas(Cordenada);
		resolucion(x, y);
	}
	
	public static void cordenadas(Rectangle Cordenada) {
		Variables.cordX = (int)Cordenada.getX();
    	Variables.cordY = (int)Cordenada.getY();
	}
	
	public static void resolucion(int x, int y) {
		Variables.resolucionX = x;
		Variables.resolucionY = y;
	}
	
	public static void abrirPrincipal() {
		try {
			PrincipalVista frame = new PrincipalVista();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void abrirObjetos() {
		try {
			ObjetosVista frame = new ObjetosVista();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void abrirBaseDatos() {
		try {
			BaseDatosVista frame = new BaseDatosVista();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void abrirDAO() {
		try {
			DaoVista frame = new DaoVista();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
