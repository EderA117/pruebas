package org.example.database;

import org.example.modelo.Comics;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ComicDB implements InterfazDB{

    public ComicDB() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Comics(Titulo,URLImagen,Autor,Editorial,AnioLanzamiento,NumPaginas) VALUES(? , ?, ?, ?, ? , ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("ComicsDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Comics)obj).getTitulo());
        pstm.setString(2, ((Comics)obj).getURLPortada());
        pstm.setString(3, ((Comics)obj).getAutor());
        pstm.setString(4, ((Comics)obj).getEditorial());
        pstm.setInt(5, ((Comics)obj).getAnioLanzamiento());
        pstm.setInt(6, ((Comics)obj).getNumPaginas());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Comics SET Titulo = ?, URLImagen = ?, Autor = ?, Editorial = ?, AnioLanzamiento = ?, NumPaginas = ? WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("ComicsDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Comics)obj).getTitulo());
        pstm.setString(2, ((Comics)obj).getURLPortada());
        pstm.setString(3, ((Comics)obj).getAutor());
        pstm.setString(4, ((Comics)obj).getEditorial());
        pstm.setInt(5, ((Comics)obj).getAnioLanzamiento());
        pstm.setInt(6, ((Comics)obj).getNumPaginas());
        pstm.setInt(7, ((Comics)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Comics WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("ComicsDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Comics";
        ArrayList<Comics> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("ComicsDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Comics(rst.getInt(1), rst.getString(2),rst.getString(3), rst.getString(4), rst.getString(5), rst.getInt(6), rst.getInt(7) ));
        }
        return resultado;
    }

    @Override
    public Object buscarporId(String id) throws SQLException {
        String sql = "SELECT * FROM Comics WHERE id = ? ;";
        Comics comic = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("ComicsDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1,  Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            comic = new Comics(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5), rst.getInt(6), rst.getInt(7));
            return comic;
        }
        return null;
    }


}
