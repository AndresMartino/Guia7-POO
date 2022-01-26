package ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int npag;
    
    public Libro(){
    }
     
    public Libro(int ISBN, String titulo, String autor, int npag){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.npag=npag;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpag() {
        return npag;
    }

    public void setNpag(int npag) {
        this.npag = npag;
    }
    
    public void cargarLibro(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese codigo ISBN");
        this.ISBN=read.nextInt();
        System.out.println("Ingrese titulo del libro");
        this.titulo=read.next();
        System.out.println("Ingrese autor del libro");
        this.autor=read.next();
         System.out.println("Ingrese numero de paginas");
        this.npag=read.nextInt();
    }
    
    public void mostrarLibro(){
        System.out.printf("EL codigo ISBN del libro es: %d \n",ISBN);
        System.out.printf("El titulo del libro es: %s \n",titulo);
         System.out.printf("El autor del libro es: %s \n",autor);
         System.out.printf("EL numero de paginas es  es: %d \n",npag);
    }
}
