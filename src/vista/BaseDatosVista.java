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
import modelo.Variables;

public class BaseDatosVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("serial")
	public BaseDatosVista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(BaseDatosVista.class.getResource("/modelo/img/icono.png")));
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
        
        JLabel lblTitulo = new JLabel("Base de Datos");
        lblTitulo.setForeground(Color.MAGENTA);
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo, BorderLayout.NORTH);
        
        JScrollPane scrollBotones = new JScrollPane();
        scrollBotones.setOpaque(true);
        contentPane.add(scrollBotones, BorderLayout.EAST);
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
        btnBD.setBackground(Color.RED);
        btnBD.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
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
        
        JButton btnNewButton_1_4 = new JButton("Botón 2");
        btnNewButton_1_4.setBackground(Color.WHITE);
        btnNewButton_1_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
        	}
        });
        btnNewButton_1_4.setPreferredSize(new Dimension(150, 30));
        panelBotones.add(btnNewButton_1_4);
        
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
        
        JButton btnNewButton_1_1 = new JButton("Botón 2");
        btnNewButton_1_1.setBackground(Color.WHITE);
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
        	}
        });
        btnNewButton_1_1.setPreferredSize(new Dimension(150, 30));
        panelBotones.add(btnNewButton_1_1);
        
        JScrollPane scrollContenido = new JScrollPane();
        contentPane.add(scrollContenido, BorderLayout.CENTER);
        scrollContenido.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JTextPane txtpnPackagePlantillasPublic = new JTextPane();
        txtpnPackagePlantillasPublic.setText("import java.sql.Connection;\r\nimport java.sql.DriverManager;\r\nimport java.sql.SQLException;\r\n\r\npublic class Konexioa {\r\n\r\n    static String respuesta;\r\n\r\n    public static Connection konektatua;\r\n    \r\n    public static void konexioa() {\r\n        try {\r\n        \tClass.forName(\"com.mysql.cj.jdbc.Driver\");\r\n\r\n            String url = \"jdbc:mysql://localhost:3307/agenda\";\r\n            String user = \"root\";\r\n            String pass = \"\";\r\n\r\n            konektatua = DriverManager.getConnection(url, user, pass); \r\n            System.out.println(\"konektatuta\");\r\n        } catch (ClassNotFoundException | SQLException e) {\r\n            e.printStackTrace();\r\n        }\r\n    }\r\n    \r\n    public static void konexioaExit() {\r\n    \ttry {\r\n\t        konektatua.close();\r\n\t\t} catch (SQLException e) {\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n    }\r\n    \r\n}\r\n");
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
