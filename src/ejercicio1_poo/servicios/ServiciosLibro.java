package ejercicio1_poo.servicios;

import ejercicio1_poo.entidades.Libro;
import java.util.Scanner;


public class ServiciosLibro {
 //metodos
    public Libro cargarLibro(){
        
        Scanner leer = new Scanner(System.in);
        Libro libros = new Libro(); //creo el objeto <libros>
        
        System.out.println("Ingrese título de libro: ");
        libros.setTitulo(leer.next());
        
        System.out.println("Ingrese ISBN: ");
        libros.setIsbn(leer.nextInt());
        
        System.out.println("Ingrese autor:");
        libros.setAutor(leer.next());        
        
        System.out.println("Ingrese número de páginas:");
        libros.setNumeroPagina(leer.nextInt());
        System.out.println("--------");
        return libros;
    }
    
    
    // traigo los datos del libro y lo devuelvo por toString
    int cant=0;
    public Libro mostrarLibro(Libro libro){ 
        cant++; //para saber q nro de libro muestra despues       
        
        System.out.println("El libro "+cant+" :"+libro);
        return libro;
    }
    
    
    
}
