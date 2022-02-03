package ejercicio1_poo.entidades;

import java.util.Scanner;

/**Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas*/
public class Libro {
    //atributos, privados por conveniencia
    private Integer isbn;
    private String titulo;
    private String autor;
    private Integer numeroPagina;
    
    //constructores
    public Libro(){
        //vacio por defecto
    }
        //parametrizado
    public Libro(Integer isbn, String titulo, String autor, Integer numeroPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
              
    
    ///////metodo toString
    //lo modifiqué para que se imprima como yo quiero
    @Override
    public String toString() {
        return "\nISBN: " + isbn + "\n titulo: " + titulo + "\n autor: " + autor + "\n numeroPagina: " + numeroPagina;
    }

    //////////getters
    public Integer getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNumeroPagina() {
        return numeroPagina;
    }
    
    //////SETTERS
    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPagina(Integer numeroPagina) {
        this.numeroPagina = numeroPagina;
    }
    
}
