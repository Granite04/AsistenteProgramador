package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import control.funciones.FuncionesVista;
import modelo.Variables;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class PrincipalVista extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Create the frame.
     */
    @SuppressWarnings("serial")
	public PrincipalVista() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(PrincipalVista.class.getResource("/modelo/img/icono.png")));
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
        
        JLabel lblTitulo = new JLabel("Asistente de Programacion");
        lblTitulo.setForeground(Color.MAGENTA);
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitulo, BorderLayout.NORTH);
        
        JPanel panelContenido = new JPanel();
        panelContenido.setOpaque(false); // Hacer el panel transparente
        contentPane.add(panelContenido, BorderLayout.CENTER);
        panelContenido.setLayout(new GridLayout(0, 1, 0, 0));
        
	        JLabel lblNewLabel = new JLabel("Esta aplicacion es para almacenar");
	        lblNewLabel.setForeground(Color.MAGENTA);
	        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	        panelContenido.add(lblNewLabel);
	        
	        JLabel lblExplicacion = new JLabel("y usar funciones que ayudan");
	        lblExplicacion.setForeground(Color.MAGENTA);
	        lblExplicacion.setHorizontalAlignment(SwingConstants.CENTER);
	        panelContenido.add(lblExplicacion);
	        
	        JLabel lblNewLabel_1 = new JLabel("en problemas a forma de tutorio o referencia.");
	        lblNewLabel_1.setForeground(Color.MAGENTA);
	        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	        panelContenido.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel_2 = new JLabel("Esta en desarroyo y se espera que");
	        lblNewLabel_2.setForeground(Color.MAGENTA);
	        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	        panelContenido.add(lblNewLabel_2);
	        
	        JLabel lblNewLabel_3 = new JLabel("llegue a tener muchos tipos de funciones");
	        lblNewLabel_3.setForeground(Color.MAGENTA);
	        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	        panelContenido.add(lblNewLabel_3);
        
        JPanel panelLateral = new JPanel();
        contentPane.add(panelLateral, BorderLayout.WEST);
        panelLateral.setLayout(new BorderLayout(0, 0));

	        JPanel panelMasMenos = new JPanel();
	        panelLateral.add(panelMasMenos, BorderLayout.SOUTH);
	
		        JButton btnMas = new JButton("+");
		        panelMasMenos.add(btnMas);
		
		        JButton btnMenps = new JButton("-");
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
		        principal.setBackground(Color.RED);
		        principal.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
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
		        btnArchivosTXT.setBackground(Color.WHITE);
		        btnArchivosTXT.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e) {
		        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
		        		FuncionesVista.abrirArchivosTXT();
		        		dispose();
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

        // Cargar la imagen de fondo
        try {
        	Variables.imagenFondo = ImageIO.read(getClass().getResource("/modelo/img/Fondo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
