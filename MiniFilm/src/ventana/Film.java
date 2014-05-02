package ventana;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Film extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String NOMBRE_IMAGEN = "delfin";
	private final static String TIPO_IMAGEN = ".PNG";
	private final int TOTAL_IMAGENES = 11;
	protected ImageIcon imagenes[];
	private final int RETRASO_ANIMACION = 100;
	private int imagenActual = 0;
	private Timer temporizador;
	private oyenteTiempo oyt;
	

	//constructor
	public Film(){
		oyt = new oyenteTiempo();
		temporizador = new Timer(RETRASO_ANIMACION, oyt);
		imagenes = new ImageIcon[TOTAL_IMAGENES];
		
		//cargar las imagenes dentro de la tabla
		for (int i = 0; i < imagenes.length; i++) {
			imagenes[i] = new ImageIcon("src/imagenes/"+NOMBRE_IMAGEN+(i+1)+TIPO_IMAGEN);
		}
		imagenActual = 0;
		temporizador.start();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		imagenes[imagenActual].paintIcon(this.getContentPane(), g, 10, 30);
		imagenActual = (imagenActual + 1) % TOTAL_IMAGENES;
		
	}
	
	class oyenteTiempo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			repaint();
			
		}
		
	}
}



