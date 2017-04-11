package BusinessLogics;

import Models.SanPham;
import Models.SanPhamMua;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hv
 */
public class GioHang {
    private Map<Integer,Integer> dshh;
    public GioHang(){
        dshh = new Hashtable<>();
    }
    public void Them(int id, int soLuong){
        if(dshh.containsKey(id))
            dshh.replace(id,dshh.get(id)+soLuong);
        else
            dshh.put(id, soLuong);
    }
    public Map<Integer,Integer> LayDSHH(){
        return dshh;
    }
    public double TongTien(){
        double tongTien =0;
        for(Integer k:dshh.keySet()){
            SanPham sp = SanPhamBL.DocTheoID(k);
            tongTien += sp.getDonGiaKM()*dshh.get(k);
        }
        return tongTien;
    }
    public List<SanPhamMua> SanPhamMua(){
        List<SanPhamMua> dsspm = new ArrayList<>();
        for(Integer k:dshh.keySet()){
            SanPhamMua spm = new SanPhamMua();
            SanPham sp = SanPhamBL.DocTheoID(k);
            spm.setId(sp.getId());
            spm.setTenSanPham(sp.getTenSanPham());
            spm.setMoTa(sp.getMoTa());
            spm.setHinhAnh(sp.getHinhAnh());
            spm.setDonGia(sp.getDonGia());
            spm.setDonGiaKM(sp.getDonGiaKM());
            spm.setSoLuong(sp.getSoLuong());
            spm.setNgayTao(sp.getNgayTao());
            spm.setHienThi(sp.getHienThi());
            spm.setId_loai(sp.getId_loai());
            spm.setId_thuongHieu(sp.getId_thuongHieu());
            spm.setSoLuongMua(dshh.get(k));
            dsspm.add(spm);
        }
        return dsspm;
    }
}
