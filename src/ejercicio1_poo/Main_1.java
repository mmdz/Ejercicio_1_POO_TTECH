package ejercicio1_poo;

import ejercicio1_poo.entidades.Libro;
import ejercicio1_poo.servicios.ServiciosLibro;
//import java.util.Scanner;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.*/
public class Main_1 {

    public static void main(String[] args) {

    //creamos un objeto de tipo libro con constructor vacio
        ServiciosLibro sl = new ServiciosLibro();
        Libro libroUno = sl.cargarLibro();
        Libro libroDos = sl.cargarLibro();
        
    //llamar al metodo de la clase Libro para instanciar un objeto
        
        sl.mostrarLibro(libroUno);
        sl.mostrarLibro(libroDos);

    }

}
