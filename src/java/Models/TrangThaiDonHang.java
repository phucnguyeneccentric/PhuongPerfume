
package Models;

import java.io.Serializable;

/**
 *
 * @author hv
 */
public class TrangThaiDonHang implements Serializable{
    private int id;
    private String tenTrangThai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTrangThai() {
        return tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }

    public TrangThaiDonHang() {
    }
    
}
