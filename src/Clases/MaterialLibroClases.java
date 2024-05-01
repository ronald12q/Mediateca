package Clases;

import java.util.List;

/**
 *
 * @author Laura Pineda
 */
public class MaterialLibroClases {

    private String idInterno;
    private String titulo;
    private String autor;
    private int numPaginas;
    private String editorial;
    private String ISBN;
    private int yearPubli;
    private int uniDispo;
    
    public MaterialLibroClases (String idInterno, String titulo, String autor, int numPaginas, String editorial, String ISBN, int yearPubli, int uniDispo){
            
            this.idInterno = idInterno;
            this.titulo = titulo;
            this.autor = autor;
            this.numPaginas = numPaginas;
            this.editorial = editorial;
            this.ISBN = ISBN;
            this.yearPubli = yearPubli;
            this.uniDispo = uniDispo;
        }
    
    public String getidInterno() {
        return idInterno;
    }

    public void setidInterno(String idInterno) {
        this.idInterno = idInterno;
    }
    
     public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }    
    
    public String getautor (){
        return autor;
    }
    
    public void setautor(String autor) {
        this.autor = autor;
    }
     
    public int getnumPaginas() {
        return numPaginas;
    }
    
    public void setnumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }
    
    public String geteditorial() {
        return editorial;
    }
    
    public void seteditorial(String editorial){
        this.editorial = editorial;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    
    public int getyearPubli() {
        return yearPubli;
    }
    
    public void setyearPubli(int yearPubli){
        this.yearPubli = yearPubli;
    }
    
    public int getuniDispo() {
        return uniDispo;
    }
    
    public void setuniDispo(int uniDispo){
        this.uniDispo = uniDispo;
    }

    public void add(List<MaterialLibroClases> materialLibros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
