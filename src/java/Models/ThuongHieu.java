
package Models;

import java.io.Serializable;

/**
 *
 * @author hv
 */
public class ThuongHieu implements Serializable{
    private int id;
    private String tenThuongHieu;
    private String hinhAnh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public ThuongHieu() {
    }
    
}
