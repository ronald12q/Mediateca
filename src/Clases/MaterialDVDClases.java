package Clases;

/**
 *
 * @author Laura Pineda
 */
public class MaterialDVDClases {

    private String idInterno;
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    
    public MaterialDVDClases (String idInterno, String titulo, String director,
            int duracion, String genero) {
        
        this.idInterno = idInterno;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }
    
    public String getidInterno() {
    return idInterno;
    }

    public void setidInterno(String idInterno) {
    this.idInterno = idInterno;
    }
    
    public String gettitulo() {
        return idInterno;
    }
    
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getdirector() {
        return director;
    }
    
    public void setdiretor(String director) {
        this.director = director;
    }
    
    public int getduracion() {
        return duracion;
    }
    
    public void setduracion(int duracion) {
        this.duracion = duracion;
    }
    
    public String getgenero() {
        return genero;
    }
    
    public void setgenero(String genero) {
        this.genero = genero;
    }
    
}
