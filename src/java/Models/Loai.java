
package Models;

import java.io.Serializable;

/**
 *
 * @author hv
 */
public class Loai implements Serializable {
    private int id;
    private String tenLoai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public Loai() {
    }
    
}
