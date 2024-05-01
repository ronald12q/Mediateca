package Logico;

import java.sql.Connection;
import Clases.MaterialRevistaClases;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Pineda
 */
public class MaterialRevista {

    private Connection conexion;
    
    public MaterialRevista(Connection conexion){
        this.conexion = conexion;
    }
    
    //insertar material
    
    public boolean insertarMaterialRevista(MaterialRevistaClases MaterialRevista){
        boolean rowInserted = false;
        
        try{
            String sql = "INSERT INTO revistas (idInterno, titulo, editorial,"
                    +"periodicidad, fechaPubli, uniDispo) "
                    +"VALUES (?,?,?,?,?,?)";
                    
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1, MaterialRevista.getidInterno());
            statement.setString(2, MaterialRevista.gettitulo());
            statement.setString(3, MaterialRevista.geteditorial());
            statement.setString(4, MaterialRevista.getperiodicidad());
            statement.setInt(5, MaterialRevista.getfechaPubli());
            statement.setInt(6, MaterialRevista.getuniDispo());

            rowInserted = statement.executeUpdate() > 0;
            statement.close();
                   
        }catch(SQLException ex){
            Logger.getLogger(MaterialRevistaClases.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowInserted;
    }
    
}
