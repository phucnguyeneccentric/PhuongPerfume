
package Models;

import java.io.Serializable;

/**
 *
 * @author hv
 */
public class VaiTro implements Serializable {
    private int id;
    private String tenVaiTro;
    private String moTa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenVaiTro() {
        return tenVaiTro;
    }

    public void setTenVaiTro(String tenVaiTro) {
        this.tenVaiTro = tenVaiTro;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public VaiTro() {
    }
    
}
