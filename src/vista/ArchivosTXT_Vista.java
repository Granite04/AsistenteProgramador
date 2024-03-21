package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.funciones.FuncionesVista;
import control.funciones.usuario.FuncionesMasMenos;
import modelo.Variables;

public class ArchivosTXT_Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings("serial")
	public ArchivosTXT_Vista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ArchivosTXT_Vista.class.getResource("/modelo/img/icono.png")));
    	setTitle("Asistente de Programacion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(Variables.cordX, Variables.cordY, Variables.resolucionX, Variables.resolucionY);

        // Crear el contentPane principal con imagen de fondo
        contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja la imagen de fondo en el contentPane
                if (Variables.imagenFondo != null) {
                    g.drawImage(Variables.imagenFondo, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        JLabel lblTitulo = new JLabel("DAO");
        lblTitulo.setForeground(Color.MAGENTA);
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo, BorderLayout.NORTH);
        
        JPanel panelLateral = new JPanel();
        contentPane.add(panelLateral, BorderLayout.WEST);
        panelLateral.setLayout(new BorderLayout(0, 0));

	        JPanel panelMasMenos = new JPanel();
	        panelLateral.add(panelMasMenos, BorderLayout.SOUTH);
	
		        JButton btnMas = new JButton("+");
		        btnMas.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		FuncionesMasMenos.obtenerNombreApunte();
		        	}
		        });
		        panelMasMenos.add(btnMas);
		
		        JButton btnMenps = new JButton("-");
		        btnMenps.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        	}
		        });
		        panelMasMenos.add(btnMenps);
	
	        JScrollPane scrollBotones = new JScrollPane();
	        scrollBotones.setOpaque(true);
	        panelLateral.add(scrollBotones, BorderLayout.CENTER);
	        scrollBotones.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	
		        JPanel panelBotones = new JPanel();
		        panelBotones.setOpaque(true);
		        scrollBotones.setViewportView(panelBotones);
		        panelBotones.setLayout(new GridLayout(0, 1, 0, 0));
		        
			        JButton principal = new JButton("Principal");
			        principal.setBackground(Color.WHITE);
			        principal.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
			        		FuncionesVista.abrirPrincipal();
			        		dispose();
			        	}
			        });
			        principal.setPreferredSize(new Dimension(150, 30));
			        panelBotones.add(principal);
			
			        JButton objetos = new JButton("Objetos");
			        objetos.setBackground(Color.WHITE);
			        objetos.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
			        		FuncionesVista.abrirObjetos();
			        		dispose();
			        	}
			        });
			        objetos.setPreferredSize(new Dimension(150, 30));
			        panelBotones.add(objetos);
			        
			        JButton btnBD = new JButton("Base de Datos");
			        btnBD.setBackground(Color.WHITE);
			        btnBD.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
			        		FuncionesVista.abrirBaseDatos();
			        		dispose();
			        	}
			        });
			        btnBD.setPreferredSize(new Dimension(150, 30));
			        panelBotones.add(btnBD);
			        
			        JButton btnDAO = new JButton("DAO");
			        btnDAO.setBackground(Color.WHITE);
			        btnDAO.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
			        		FuncionesVista.abrirDAO();
			        		dispose();
			        	}
			        });
			        btnDAO.setPreferredSize(new Dimension(150, 30));
			        panelBotones.add(btnDAO);
			        
			        JButton btnArchivosTXT = new JButton("Archivos TXT");
			        btnArchivosTXT.setBackground(Color.RED);
			        btnArchivosTXT.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
			        	}
			        });
			        btnArchivosTXT.setPreferredSize(new Dimension(150, 30));
			        panelBotones.add(btnArchivosTXT);
			        
			        JButton btnNewButton_1_3 = new JButton("Botón 2");
			        btnNewButton_1_3.setBackground(Color.WHITE);
			        btnNewButton_1_3.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
			        	}
			        });
			        btnNewButton_1_3.setPreferredSize(new Dimension(150, 30));
			        panelBotones.add(btnNewButton_1_3);
			        
			        JButton btnNewButton_1_2 = new JButton("Botón 2");
			        btnNewButton_1_2.setBackground(Color.WHITE);
			        btnNewButton_1_2.addActionListener(new ActionListener() {
			        	public void actionPerformed(ActionEvent e) {
			        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
			        	}
			        });
			        btnNewButton_1_2.setPreferredSize(new Dimension(150, 30));
			        panelBotones.add(btnNewButton_1_2);
        
        JScrollPane scrollContenido = new JScrollPane();
        contentPane.add(scrollContenido, BorderLayout.CENTER);
        scrollContenido.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
	        JTextPane txtpnPackagePlantillasPublic = new JTextPane();
	        txtpnPackagePlantillasPublic.setEditable(false);
	        txtpnPackagePlantillasPublic.setText("import java.io.*;\r\n\r\npublic class ManejoArchivos {\r\n\r\n    // Función para crear un archivo\r\n    public static void crearArchivo(String nombreArchivo) {\r\n        try {\r\n            File archivo = new File(nombreArchivo);\r\n            if (archivo.createNewFile()) {\r\n                System.out.println(\"Archivo creado: \" + archivo.getName());\r\n            } else {\r\n                System.out.println(\"El archivo ya existe.\");\r\n            }\r\n        } catch (IOException e) {\r\n            System.out.println(\"Ocurrió un error al crear el archivo.\");\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    // Función para escribir en un archivo\r\n    public static void escribirArchivo(String nombreArchivo, String contenido) {\r\n        try {\r\n            FileWriter escritor = new FileWriter(nombreArchivo);\r\n            escritor.write(contenido);\r\n            escritor.close();\r\n            System.out.println(\"Se escribió en el archivo correctamente.\");\r\n        } catch (IOException e) {\r\n            System.out.println(\"Ocurrió un error al escribir en el archivo.\");\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    // Función para leer desde un archivo\r\n    public static void leerArchivo(String nombreArchivo) {\r\n        try {\r\n            File archivo = new File(nombreArchivo);\r\n            BufferedReader lector = new BufferedReader(new FileReader(archivo));\r\n            String linea;\r\n            while ((linea = lector.readLine()) != null) {\r\n                System.out.println(linea);\r\n            }\r\n            lector.close();\r\n        } catch (IOException e) {\r\n            System.out.println(\"Ocurrió un error al leer el archivo.\");\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    // Función para borrar un archivo\r\n    public static void borrarArchivo(String nombreArchivo) {\r\n        try {\r\n            File archivo = new File(nombreArchivo);\r\n            if (archivo.delete()) {\r\n                System.out.println(\"El archivo ha sido borrado.\");\r\n            } else {\r\n                System.out.println(\"No se pudo borrar el archivo.\");\r\n            }\r\n        } catch (Exception e) {\r\n            System.out.println(\"Ocurrió un error al borrar el archivo.\");\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n\r\n    public static void main(String[] args) {\r\n        String nombreArchivo = \"archivo.txt\";\r\n        \r\n        // Ejemplo de uso\r\n        crearArchivo(nombreArchivo);\r\n        escribirArchivo(nombreArchivo, \"Hola, mundo!\");\r\n        leerArchivo(nombreArchivo);\r\n        borrarArchivo(nombreArchivo);\r\n    }\r\n}\r\n");
	        scrollContenido.setViewportView(txtpnPackagePlantillasPublic);
	        txtpnPackagePlantillasPublic.setCaretPosition(0); // Mueve el cursor al principio del JTextPane
	        scrollContenido.getViewport().setViewPosition(new Point(0, 0)); // Mueve el JScrollPane al principio del JTextPane

        // Cargar la imagen de fondo
        try {
        	Variables.imagenFondo = ImageIO.read(getClass().getResource("/modelo/img/Fondo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
