import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Graficos extends JFrame {

	private JPanel contentPane;
	private JLabel l1;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graficos frame = new Graficos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Graficos() {
		setTitle("Gr\u00E1ficos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 630);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("+");
		b1.setFont(new Font("Tahoma", Font.BOLD, 12));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String dato = l1.getText();
				int n = Integer.parseInt(dato);
				if(n<100)
				{
				n = n+10;
				l1.setText(String.valueOf(n));
				x=x+30; // La x a sumar depende de la longitud del gráfico
				y=y+30;
				repaint();
				}
			}
		});
		b1.setBounds(92, 157, 55, 41);
		contentPane.add(b1);
		
		JButton b2 = new JButton("-");
		b2.setFont(new Font("Tahoma", Font.BOLD, 12));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String dato = l1.getText();
				int n = Integer.parseInt(dato);
				if(n>0)
				{
				n = n-10;
				l1.setText(String.valueOf(n));
				x=x-30; // La x a restar depende de la longitud del gráfico
				y=y-30;
				repaint();
				}
			}
		});
		b2.setBounds(92, 209, 55, 41);
		contentPane.add(b2);
		
		l1 = new JLabel("0");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		l1.setOpaque(true);
		l1.setBackground(Color.DARK_GRAY);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(21, 173, 61, 61);
		contentPane.add(l1);
		
		JButton b3 = new JButton("Salir");
		b3.setFont(new Font("Tahoma", Font.BOLD, 12));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				System.exit(0);
			}
		});
		b3.setBounds(150, 545, 89, 41);
		contentPane.add(b3);
	}
	
	
	int x = 0;
	int y = 0;
	
	public void paint (Graphics g)
	{
		super.paint(g);

		g.setColor(Color.black);
		int z = 0;
		int esp = 0;
		for(int i=1; i<=11; i++)
		{
		g.drawString(String.valueOf(z),260,esp+355);
		z=z+10;
		esp=esp-30;
		}

		/*
		g.setColor(Color.black); // Números horizontales
		g.drawString("0", 263, 360);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("10", 260, 330);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("20", 260, 300);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("30", 260, 270);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("40", 260, 240);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("50", 260, 210);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("60", 260, 180);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("70", 260, 150);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("80", 260, 120);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("90", 260, 90);
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("100", 257, 60);
		*/
		g.setColor(Color.black); // Recuadro vertical izquierdo
		g.drawRect(180,50,50,304);
		
		g.setColor(Color.black); // Recuadro vertical derecho
		g.drawRect(300,50,50,304);
		
		g.setColor(Color.red); // Indice vertical
		g.fillRect(180,350-y,50,4);
		
		g.setColor(Color.black); // Recuadro para Indice vertical
		g.drawRect(180,350-y,50,4);
		
		g.setColor(Color.red); // Superficie vertical
		g.fillRect(300,350-y,50,4+y);
		
		g.setColor(Color.black); // Recuadro para Superficie vertical
		g.drawRect(300,350-y,50,4+y);
		
		
		
		g.setColor(Color.black); // Números horizontales
		g.drawString("0      10      20     30     40     50      60     70     80     90     100", 50, 480);
		
		g.setColor(Color.black); // Recuadro horizontal superior
		g.drawRect(50,400,304,50);
		
		g.setColor(Color.black); // Recuadro horizontal inferior
		g.drawRect(50,500,304,50);
		
		g.setColor(Color.orange); // Indice horizontal
		g.fillRect(50+x,400,4,50);
		
		g.setColor(Color.black); // Recuadro para Indice horizontal
		g.drawRect(50+x,400,4,50);
		
		g.setColor(Color.orange); // Superficie horizontal
		g.fillRect(50,500,4+x,50);
		
		g.setColor(Color.black); // Recuadro para Superficie horizontal
		g.drawRect(50,500,4+x,50);
		
	}
}
