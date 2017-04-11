
package BusinessLogics;

import BusinessLogics.Database;
import Models.SanPham;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class SanPhamBL {
    public static SanPham DocTheoID(int id){
        String sql = "select * from sanpham where id="+id;
        List<SanPham> dssp = TaoDanhSach(sql);
        return dssp.get(0);
    }
    public static List<SanPham> SanPhamMoi(int top){
        String sql = "select * from sanpham order by ngaytao desc limit 0,"+top;
        List<SanPham> dssp = TaoDanhSach(sql);
        return dssp;
    }

    public static List<SanPham> BanChayNhat(int top){
        String sql = "select s.*,sum(c.soluong) tslb from sanpham s inner join chitietdonhang c " +
                     "on c.id_sanpham = s.id group by 1 order by tslb desc limit 0,"+top;
        List<SanPham> dssp = TaoDanhSach(sql);
        return dssp;
    }

    public static List<SanPham> GiamGiaNhieu(int top){
        String sql= "select s.*, sum(s.dongia-s.dongiaKM) giamGia from sanpham s group by 1 order by giamGia desc limit 0,"+top;
        List<SanPham> dssp = TaoDanhSach(sql);
        return dssp;
    }

    public static int TongSoTrang(int soDongTrang)
    {
        int tongSoDong, tongSoTrang;
        String sql= "select * from sanpham";
        List<SanPham> dssp = TaoDanhSach(sql);
        tongSoDong = dssp.size();
        tongSoTrang = tongSoDong/soDongTrang + (tongSoDong%soDongTrang==0?0:1);
        return tongSoTrang;
    }
    
    public static List<SanPham> SanPhamTrang(int trang, int soDongTrang){
        int viTriDau = (trang==1?0:(trang-1)*soDongTrang);
        String sql= "select * from sanpham limit "+viTriDau+","+soDongTrang;
        List<SanPham> dssp = TaoDanhSach(sql);
        return dssp;
    }
    
    private static List<SanPham> TaoDanhSach(String sql){
        List<SanPham> dssp = null;
        try (Connection ketNoi = Database.layKetNoi()){
            Statement stm = ketNoi.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            dssp = new ArrayList<>();
            while(rs.next()){
                SanPham sp = new SanPham();
                sp.setId(rs.getInt("id"));
                sp.setTenSanPham(rs.getString("tensanpham"));
                sp.setMoTa(rs.getString("mota"));
                sp.setHinhAnh(rs.getString("hinhanh"));
                sp.setDonGia(rs.getDouble("dongia"));
                sp.setDonGiaKM(rs.getDouble("dongiaKM"));
                sp.setSoLuong(rs.getInt("soluong"));
                sp.setNgayTao(rs.getDate("ngaytao"));
                sp.setHienThi(rs.getInt("hienthi"));
                sp.setId_loai(rs.getInt("id_loai"));
                sp.setId_thuongHieu(rs.getInt("id_thuonghieu"));
                dssp.add(sp);
            }
        } catch (Exception e) {
            throw new RuntimeException("Bị lỗi: "+e.getMessage());
        }
        return dssp;
    }
}
