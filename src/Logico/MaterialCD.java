package Logico;
import java.sql.Connection;
import Clases.MaterialCDClases;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Laura Pineda
 */
public class MaterialCD {

    private Connection conexion;
    
    public MaterialCD(Connection conexion){
        this.conexion = conexion;
    }
    
    //insertar material
    
    public boolean MaterialCD (MaterialCDClases MaterialCD){
        boolean rowInserted = false;
        
        try {
            String sql = "INSERT INTO cd (idInterno, titulo, artista, genero"
                    + "duracion, numCanciones, uniDisp) "
                    + "VALUES (?,?,?,?,?,?,?)";
        java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
        
        statement.setString(1, MaterialCD.getidInterno());
        statement.setString(2, MaterialCD.gettitulo());
        statement.setString(3, MaterialCD.getartista());
        statement.setString(4, MaterialCD.getgenero());
        statement.setInt(5,MaterialCD.getduracion());
        statement.setInt(6,MaterialCD.getnumCanciones());
        statement.setInt(7,MaterialCD.getuniDisp());
        
        rowInserted = statement.executeUpdate() > 0;
        statement.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(MaterialCDClases.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowInserted;
    }
}
