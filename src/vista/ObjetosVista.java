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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import control.funciones.FuncionesVista;
import modelo.Variables;
import javax.swing.JTextPane;

public class ObjetosVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("serial")
	public ObjetosVista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ObjetosVista.class.getResource("/modelo/img/icono.png")));
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
        
        JLabel lblTitulo = new JLabel("Objetos");
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
        objetos.setBackground(Color.RED);
        objetos.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
        	}
        });
        objetos.setPreferredSize(new Dimension(150, 30));
        panelBotones.add(objetos);
        
        JButton btnNewButton_1_6 = new JButton("Botón 2");
        btnNewButton_1_6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
        	}
        });
        btnNewButton_1_6.setPreferredSize(new Dimension(150, 30));
        panelBotones.add(btnNewButton_1_6);
        
        JButton btnNewButton_1_5 = new JButton("Botón 2");
        btnNewButton_1_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
        	}
        });
        btnNewButton_1_5.setPreferredSize(new Dimension(150, 30));
        panelBotones.add(btnNewButton_1_5);
        
        JButton btnNewButton_1_4 = new JButton("Botón 2");
        btnNewButton_1_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
        	}
        });
        btnNewButton_1_4.setPreferredSize(new Dimension(150, 30));
        panelBotones.add(btnNewButton_1_4);
        
        JButton btnNewButton_1_3 = new JButton("Botón 2");
        btnNewButton_1_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
        	}
        });
        btnNewButton_1_3.setPreferredSize(new Dimension(150, 30));
        panelBotones.add(btnNewButton_1_3);
        
        JButton btnNewButton_1_2 = new JButton("Botón 2");
        btnNewButton_1_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
        	}
        });
        btnNewButton_1_2.setPreferredSize(new Dimension(150, 30));
        panelBotones.add(btnNewButton_1_2);
        
        JButton btnNewButton_1_1 = new JButton("Botón 2");
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
        txtpnPackagePlantillasPublic.setText("package Plantillas;\r\n\r\npublic class Objeto {\r\n\r\n\tprivate String variable;\r\n\r\n\t// ----------Constructor----------//\r\n\tpublic Objeto() {\r\n\t\tthis.variable = \"\";\r\n\t}\r\n\tpublic Objeto(String variable) {\r\n\t\tthis.variable = variable;\r\n\t}\r\n\t// ----------Constructor----------//\r\n\r\n\t\r\n\t// --------------SET--------------//\r\n\tpublic void setVariable(String variable) {\r\n\t\tthis.variable = variable;\r\n\t}\r\n\t// --------------SET--------------//\r\n\r\n\t\r\n\t// --------------GET--------------//\r\n\tpublic String getVariable() {\r\n\t\treturn variable;\r\n\t}\r\n\t// --------------GET--------------//\r\n\r\n\t\r\n\t// -----------toString------------//\r\n\t@Override\r\n\tpublic String toString() {\r\n\t\treturn \"Ejemplo [variable=\" + variable + \"]\";\r\n\t}\r\n\t// -----------toString------------//\r\n\r\n}\r\n");
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
