package crouskiebackoffice.controle;

import crouskiebackoffice.model.DAO;
import crouskiebackoffice.model.DAOProduct;
import crouskiebackoffice.model.ModelVisualisationProduct;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wwwazz
 */
public class ControllerProductTable {
    
    ModelVisualisationProduct modelVisualisationProduct;
    DAO dao;

    public ControllerProductTable() {
        dao = new DAOProduct();
        try {
            modelVisualisationProduct = new ModelVisualisationProduct(dao.getAllData("nameprod"));
        } catch (SQLException ex) {
            Logger.getLogger(ControllerProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ModelVisualisationProduct getModelVisualisationProduct() {
        return modelVisualisationProduct;
    }
    
    
    
    
}