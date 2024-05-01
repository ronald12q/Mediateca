package Logico;
import java.sql.Connection;
import Clases.MaterialDVDClases;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Laura Pineda
 */
public class MaterialDVD {

        private Connection conexion;
    
    public MaterialDVD(Connection conexion){
        this.conexion = conexion;
    }
    
    //insertar material
    
    public boolean MaterialDVD (MaterialDVDClases MaterialDVD){
        boolean rowInserted = false;
        
        try {
            String sql = "INSERT INTO dvd (idInterno, titulo, director, "
                    + "duracion, genero) "
                    + "VALUES(?,?,?,?,?)";
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1, MaterialDVD.getidInterno());
            statement.setString(2, MaterialDVD.gettitulo());
            statement.setString(3, MaterialDVD.getdirector());
            statement.setInt(4, MaterialDVD.getduracion());
            statement.setString(4, MaterialDVD.getgenero());
            
            rowInserted = statement.executeUpdate() > 0;
            statement.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(MaterialDVDClases.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowInserted;
    }
}
