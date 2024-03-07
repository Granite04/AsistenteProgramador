package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
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

public class DaoVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("serial")
	public DaoVista() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DaoVista.class.getResource("/modelo/img/icono.png")));
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
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setOpaque(true);
        contentPane.add(scrollPane, BorderLayout.EAST);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setOpaque(true);
        scrollPane.setViewportView(panelBotones);
        panelBotones.setLayout(new GridLayout(0, 1, 0, 0));
        
        JButton principal = new JButton("Principal");
        principal.setBackground(Color.WHITE);
        principal.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cordenadas(getBounds());
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
        btnDAO.setBackground(Color.RED);
        btnDAO.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		FuncionesVista.cambioVentana(getBounds(), getWidth(), getHeight());
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
        txtpnPackagePlantillasPublic.setText("import java.sql.PreparedStatement;\r\nimport java.sql.ResultSet;\r\nimport java.sql.SQLException;\r\nimport java.util.ArrayList;\r\nimport java.util.List;\r\n\r\nimport db.Konexioa;\r\n\r\npublic class Dao {\r\n\t\r\n\tpublic List<Objeto> lortuZinemak() {\r\n\r\n\t    List<Objeto> objetoList = new ArrayList<>();\r\n\r\n\t    try {\r\n\t    \tKonexioa.konexioa(); // Asegúrate de que la conexión está abierta\r\n\t    \t\r\n\t    \tPreparedStatement preparedStatement = Konexioa.konektatua.prepareStatement(\"Kontzulta\");\r\n\t        ResultSet resultSet = preparedStatement.executeQuery();\r\n\r\n\t        while (resultSet.next()) {\r\n\t        \tString aldagaia = resultSet.getString(\"Dato\");\r\n\t                \r\n\t            Objeto objeto = new Objeto(aldagaia);\r\n\t            objetoList.add(objeto);    \r\n\t        }\r\n\t           \r\n\t    } catch (SQLException e) {\r\n\t    \te.printStackTrace();\r\n\t    } finally {\r\n\t    \tKonexioa.konexioaExit(); // Asegúrate de cerrar la conexión después de usarla\r\n\t    }\r\n\r\n\t    return objetoList;\r\n\t    \r\n\t}\r\n\t\r\n}\r\n");
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
