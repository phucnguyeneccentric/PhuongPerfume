
package BusinessLogics;

import BusinessLogics.Database;
import Models.ThuongHieu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class ThuongHieuBL {
    public static List<ThuongHieu> DocTatCa(){
        List<ThuongHieu> dsth = null;
        try (Connection ketNoi = Database.layKetNoi()){
            Statement stm = ketNoi.createStatement();
            ResultSet rs = stm.executeQuery("select * from thuonghieu");
            dsth = new ArrayList<>();
            while(rs.next()){
                ThuongHieu th = new ThuongHieu();
                th.setId(rs.getInt("id"));
                th.setTenThuongHieu(rs.getString("tenthuonghieu"));
                th.setHinhAnh(rs.getString("hinhanh"));
                dsth.add(th);
            }
        } catch (Exception e) {
            throw new RuntimeException("Bị lỗi: "+e.getMessage());
        }
        return dsth;
    }
}
