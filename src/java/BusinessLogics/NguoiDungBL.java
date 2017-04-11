/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogics;

import Models.NguoiDung;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hv
 */
public class NguoiDungBL {
    public static NguoiDung DocNguoiDung(String email, String password){
        NguoiDung nd = null;
        try {
            Connection ketNoi = Database.layKetNoi();
            Statement stm = ketNoi.createStatement();
            ResultSet rs = stm.executeQuery("select * from nguoidung where email='"+email+"' and password='"+password+"'");
            if(rs.next()){
                nd = new NguoiDung();
                nd.setId(rs.getInt("id"));
                nd.setEmail(rs.getString("email"));
                nd.setPassword(rs.getString("password"));
                nd.setHoTen(rs.getString("hoten"));
                nd.setDiaChi(rs.getString("diachi"));
                nd.setDtdd(rs.getString("dtdd"));
                nd.setId(rs.getInt("id_vaitro"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(NguoiDungBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nd;
    }
}
