
package BusinessLogics;

import BusinessLogics.Database;
import Models.Loai;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class LoaiBL {
    public static List<Loai> DocTatCa(){
        List<Loai> dsLoai = null;
        try (Connection ketNoi = Database.layKetNoi()){
            Statement stm = ketNoi.createStatement();
            ResultSet rs = stm.executeQuery("select * from loai");
            dsLoai = new ArrayList<>();
            while(rs.next()){
                Loai l = new Loai();
                l.setId(rs.getInt("id"));
                l.setTenLoai(rs.getString("tenloai"));
                dsLoai.add(l);
            }
        } catch (Exception e) {
            throw new RuntimeException("Bị lỗi: "+e.getMessage());
        }
        return dsLoai;
    }
}
