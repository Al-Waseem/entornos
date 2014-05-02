package Aplicacion;

import javax.swing.JFrame;

import ventana.Film;


public class App {
	
	//crear un objeto de tipo Film (ventana)
	private Film film;
	
	//constructor de la aplicacion
	App(){
		
		//instanciar el objeto
		film = new Film();
		//asignar un titulo de la ventana
		film.setTitle("Mni Film");
		//cerrar la aplicacion al cerrar la ventana
		film.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//asignar el tamaño de la ventana
		film.setSize(500,500);
		//mostrar la ventana
		film.setVisible(true);
		
		/*metodo para centrar la ventana en la pantalla
		 * utilizando una libreria hecha para esto
		 */
		windows.Window.centrar(film);
	}
	
	public static void main(String[] args) {
		//crear la aplicacion para ejecutarla
		new App();
	}

}
