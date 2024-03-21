package control.funciones;

import java.io.File;

public class FuncionesRutas {
	
	// Método para obtener la ruta del directorio donde se encuentra el .jar o el .exe
    public static String obtenerDirectorioActual() {
        String rutaDirectorio = null;
        try {
            // Obtiene la ubicación del archivo .jar o .exe
            String rutaArchivo = FuncionesRutas.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
            
            // Si la aplicación se ejecuta desde un archivo .jar
            if (rutaArchivo.endsWith(".jar")) {
                rutaDirectorio = new File(rutaArchivo).getParentFile().getPath();
            }
            // Si la aplicación se ejecuta desde un archivo .exe
            else if (rutaArchivo.endsWith(".exe")) {
                rutaDirectorio = new File(rutaArchivo).getParent();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rutaDirectorio;
    }
}
