package Aplicacion;

import javax.swing.JFrame;

import ventana.Film;


public class App {
	
	private Film film;
	
	App(){
		film = new Film();
		film.setTitle("Mni Film");
		film.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		film.setSize(500,500);
		film.setVisible(true);
		windows.Window.centrar(film);
	}
	
	public static void main(String[] args) {
		new App();
	}

}
