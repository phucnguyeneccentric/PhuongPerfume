
package Models;

import java.io.Serializable;

/**
 *
 * @author hv
 */
public class NguoiDung implements Serializable{
    private int id;
    private String email;
    private String password;
    private String hoTen;
    private String diaChi;
    private String dtdd;
    private int id_vaiTro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDtdd() {
        return dtdd;
    }

    public void setDtdd(String dtdd) {
        this.dtdd = dtdd;
    }

    public int getId_vaiTro() {
        return id_vaiTro;
    }

    public void setId_vaiTro(int id_vaiTro) {
        this.id_vaiTro = id_vaiTro;
    }

    public NguoiDung() {
    }
    
}
