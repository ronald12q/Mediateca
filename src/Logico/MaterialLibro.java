package Logico;
import java.sql.Connection;
import Clases.MaterialLibroClases;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Laura Pineda
 */
public class MaterialLibro {

    private Connection conexion;
    
    public MaterialLibro(Connection conexion){
        this.conexion = conexion;
    }
    
    //insertar material
    
    public boolean insertarMaterialLibro (MaterialLibroClases MaterialLibro){
         boolean rowInserted = false;
         
         try {
             String sql = "INSERT INTO libros (idInterno, titulo, autor,"
                     + "numPaginas, editorial, ISBN, yearPubli, uniDispo) "
                     + "VALUES (?,?,?,?,?,?,?,?)";
             java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
             
             statement.setString(1, MaterialLibro.getidInterno());
             statement.setString(2, MaterialLibro.gettitulo());
             statement.setString(3, MaterialLibro.getautor());
             statement.setInt(4, MaterialLibro.getnumPaginas());
             statement.setString(5, MaterialLibro.geteditorial());
             statement.setString(6, MaterialLibro.getISBN());
             statement.setInt(7, MaterialLibro.getyearPubli());
             statement.setInt(8, MaterialLibro.getuniDispo());
             
             rowInserted = statement.executeUpdate() > 0;
            statement.close();
         }catch(SQLException ex){
            Logger.getLogger(MaterialLibroClases.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rowInserted;
    }
    
    //localizar por Código Interno
    
    public boolean localizarMaterialLibro (String idInterno){
        boolean encontrado = false;
        
        try {
            String sql = "SELECT * FROM libros WHERE idInterno = ?";
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                encontrado = true;
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
             Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encontrado;
    }
    
    //Seleccionar un material por su código
    
    public MaterialLibroClases seleccionarMaterialLibro (String idInterno){
        MaterialLibroClases materialLibro = null;
        
        try {
            String sql = "SELECT * FROM libros WHERE idInterno = ?";
            
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                
                String id = resultSet.getString("CodigoIdentificacion");
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                int numPaginas = resultSet.getInt("numPaginas");
                String editorial = resultSet.getString("editorial");
                String ISBN = resultSet.getString("ISBN");
                int yearPubli = resultSet.getInt("yearPubli");
                int uniDispo = resultSet.getInt("uniDispo");
                
                materialLibro = new MaterialLibroClases (id, titulo, autor, numPaginas, editorial, ISBN, yearPubli, uniDispo);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materialLibro;
    }
    
    //Seleccionar todos los libros
    
    public List<MaterialLibroClases> Seleccionartodos() {
    List<MaterialLibroClases> materialLibros = new ArrayList<>();
    
    try {
        String sql = "SELECT *FROM libros";
        
         Statement statement = conexion.createStatement();
         ResultSet resultSet = statement.executeQuery(sql);
         
         while(resultSet.next()){
             String idInterno = resultSet.getString("idInterno");
             String titulo = resultSet.getString("titulo");
             String autor = resultSet.getString("autor");
             int numPaginas = resultSet.getInt("numPaginas");
             String editorial = resultSet.getString("editorial");
             String ISBN = resultSet.getString("ISBN");
             int yearPubli = resultSet.getInt("yearPubli");
             int uniDispo = resultSet.getInt("uniDispo");
             
             MaterialLibroClases materialLibro = new MaterialLibroClases (idInterno, titulo, autor, numPaginas, editorial, ISBN, yearPubli, uniDispo);
             materialLibro.add(materialLibros);
         }
            resultSet.close();
            statement.close();
            
    }catch (SQLException ex) {
            Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materialLibros;
}
    
    //Actualizar material libro
    
    public boolean ActualizarMaterialLibro (MaterialLibroClases MaterialLibro){
        boolean rowUpdated = false;
        
        try {
            String sql = "UPDATE libros SET idInterno = ?, titulo = ?, autor = ?,"
                    + "numPaginas = ?, editorial = ?, ISBN = ?, yearPubli = ?,"
                    + "uniDispo = ?";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1, MaterialLibro.gettitulo());
            statement.setString(2, MaterialLibro.getautor());
            statement.setInt(3, MaterialLibro.getnumPaginas());
            statement.setString(4, MaterialLibro.geteditorial());
            statement.setString(5, MaterialLibro.getISBN());
            statement.setInt(6, MaterialLibro.getyearPubli());
            statement.setInt(7, MaterialLibro.getuniDispo());
            
            statement.setString(8, MaterialLibro.getidInterno());
            
            rowUpdated = statement.executeUpdate()>0;
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }
    
    //Eliminar material Libro
    
    public boolean EliminarMaterialLibro (String idInterno){
        boolean rowDeleted = false;
        
        try {
            String sql = "DELETE FROM libros WHERE idInterno = ?";

            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            rowDeleted = statement.executeUpdate() > 0;
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaterialLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowDeleted;
    }
    
}
