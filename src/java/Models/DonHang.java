
package Models;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hv
 */
public class DonHang implements Serializable {
    private int id;
    private int id_khachHang;
    private Date ngayDatHang;
    private String tenNguoiNhanHang;
    private String dienThoaiNguoiNhan;
    private String diaChiGiaoHang;
    private String ghiChu;
    private Boolean thanhToan;
    private int id_trangThai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_khachHang() {
        return id_khachHang;
    }

    public void setId_khachHang(int id_khachHang) {
        this.id_khachHang = id_khachHang;
    }

    public Date getNgayDatHang() {
        return ngayDatHang;
    }

    public void setNgayDatHang(Date ngayDatHang) {
        this.ngayDatHang = ngayDatHang;
    }

    public String getTenNguoiNhanHang() {
        return tenNguoiNhanHang;
    }

    public void setTenNguoiNhanHang(String tenNguoiNhanHang) {
        this.tenNguoiNhanHang = tenNguoiNhanHang;
    }

    public String getDienThoaiNguoiNhan() {
        return dienThoaiNguoiNhan;
    }

    public void setDienThoaiNguoiNhan(String dienThoaiNguoiNhan) {
        this.dienThoaiNguoiNhan = dienThoaiNguoiNhan;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Boolean getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(Boolean thanhToan) {
        this.thanhToan = thanhToan;
    }

    public int getId_trangThai() {
        return id_trangThai;
    }

    public void setId_trangThai(int id_trangThai) {
        this.id_trangThai = id_trangThai;
    }

    public DonHang() {
    }
    
}
