package codeptit;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
class SinhVien {

    private String masv, ten, sdt, email;

    public SinhVien() {

    }

    public SinhVien(String masv, String ten, String sdt, String email) {
        this.masv = masv;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getMasv() {
        return masv;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return masv + " " + ten + " " + sdt + " " + email;
    }
}

class DeTai {

    private String madn, ten,detai;
    public DeTai() {
    }

    public DeTai(String madn, String ten,String detai) {
        this.madn = madn;
        this.ten = ten;
        this.detai = detai;
    }

    public String getDetai() {
        return detai;
    }

    public void setDetai(String detai) {
        this.detai = detai;
    }
    
    public String getMadn() {
        return madn;
    }

    public void setMadn(String madn) {
        this.madn = madn;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    @Override
    public String toString() {
        return madn+" "+ ten + " " +detai;
    }
}

class NhiemVu extends SinhVien{
    private String masv ,madn,tengiangvien,detai;

    public NhiemVu() {
    }

    public NhiemVu(String masv, String madn) {
        this.masv = masv;
        this.madn = madn;
    }

    @Override
    public String getMasv() {
        return masv;
    }

    @Override
    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getMadn() {
        return madn;
    }

    public void setMadn(String madn) {
        this.madn = madn;
    }

    public String getTengiangvien() {
        return tengiangvien;
    }

    public void setTengiangvien(String tengiangvien) {
        this.tengiangvien = tengiangvien;
    }

    public String getDetai() {
        return detai;
    }

    public void setDetai(String detai) {
        this.detai = detai;
    }
    @Override
    public String toString(){
        return masv +" "+super.getTen()+" "+super.getSdt()+" "+super.getEmail()+" "+tengiangvien+" "+detai;
    }
}

public class danhSachThucTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t,n;
        List<SinhVien> a = new ArrayList<>();
        try {
            File file = new File("SINHVIEN.in");
            Scanner sc = new Scanner(file);
            t = sc.nextInt();
            sc.nextLine();
            while (sc.hasNext()) {
                String masv = sc.nextLine();
                String ten = sc.nextLine();
                String sdt = sc.nextLine();
                String email = sc.nextLine();
                SinhVien sv = new SinhVien(masv, ten, sdt, email);
                a.add(sv);
            }
        } catch (Exception e) {
        }
//        for (SinhVien x : a){
//            System.out.println(x);
//        }
        List<DeTai> b = new ArrayList<>();
        Map<String,String> mp = new HashMap<>();
        try {
            File file = new File("DETAI.in");
            Scanner sc = new Scanner(file);
            n = sc.nextInt();
            sc.nextLine();
            int dem =0;
            while (sc.hasNext()) {
                dem++;
                String ten = sc.nextLine();
                String detai = sc.nextLine();
                String madn = "DT"+ String.format("%03d", dem);
                DeTai dt = new DeTai(madn, ten, detai);
                b.add(dt);
            }
        } catch (Exception e) {
        }
//        for (DeTai x : b){
//            System.out.println(x);
//        }
        List<NhiemVu> c  = new ArrayList<>();
        List<NhiemVu> d  = new ArrayList<>();
        try {
            File file = new File("NHIEMVU.in");
            Scanner sc = new Scanner(file);
            int k = sc.nextInt();
            sc.nextLine();
            for (int i=0;i<k;i++){
                String masv = sc.next();
                String madn = sc.next();
                NhiemVu tt = new NhiemVu(masv, madn);
                for (SinhVien res : a){
                    if(res.getMasv().equals(tt.getMasv())){
                        tt.setTen(res.getTen());
                        tt.setEmail(res.getEmail());
                        tt.setSdt(res.getSdt());
                        break;
                    }
                }
                c.add(tt);
            }
            for (NhiemVu res : c){
                for (DeTai res1 : b){
                    if(res1.getMadn().equals(res.getMadn())){
                        res.setDetai(res1.getDetai());
                        res.setTengiangvien(res1.getTen());
                    }
                }
            }
        }
        catch (Exception e) {
        }
        Collections.sort(c, Comparator.comparing(NhiemVu::getDetai));
        for (NhiemVu i : c){
            System.out.println(i);
        }
    }

}
