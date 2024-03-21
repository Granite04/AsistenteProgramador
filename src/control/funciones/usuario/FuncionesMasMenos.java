package control.funciones.usuario;

import javax.swing.JOptionPane;

import control.funciones.*;

public class FuncionesMasMenos {

	public static void creacionNuevoApunte() {
		FuncionesTXT.crearArchivo(obtenerNombreApunte());
	}
	
	 // Método para mostrar el cuadro de diálogo y obtener el nombre del nuevo apunte
    public static String obtenerNombreApunte() {
        return JOptionPane.showInputDialog(null, "Escribe el nombre de tu nuevo apunte:");
    }
	
}
