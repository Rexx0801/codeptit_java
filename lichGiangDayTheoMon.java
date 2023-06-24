package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class MonHoc{
    private String maMon,tenMon;
    private int soTinChi;

    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }  
}
class LichGiangDay{
    private String ma,maMon2,tengGv,phongHoc;
    private int thu,kip;
    public LichGiangDay(int ma,String maMon2, int thu, int kip, String tengGv, String phongHoc) {
        this.ma = "HP"+String.format("%03d", ma);
        this.maMon2=maMon2;
        this.thu = thu;
        this.kip = kip;
        this.tengGv = tengGv;
        this.phongHoc = phongHoc;
    }

    public String getMaMon2() {
        return maMon2;
    }

    public void setMaMon2(String maMon2) {
        this.maMon2 = maMon2;
    }
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTengGv() {
        return tengGv;
    }

    public void setTengGv(String tengGv) {
        this.tengGv = tengGv;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public int getThu() {
        return thu;
    }

    public void setThu(int thu) {
        this.thu = thu;
    }

    public int getKip() {
        return kip;
    }

    public void setKip(int kip) {
        this.kip = kip;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.thu+" "+this.kip+" "+this.tengGv+" "+this.phongHoc;
    }

}
public class lichGiangDayTheoMon {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> mh=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            mh.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
         sc=new Scanner(new File("LICHGD.in"));
         n=Integer.parseInt(sc.nextLine());
        ArrayList<LichGiangDay> lgd=new ArrayList<>();
        for(int i=0;i<n;i++){
            lgd.add(new LichGiangDay(i+1,sc.nextLine(), Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        String s=sc.nextLine();
        Collections.sort(lgd, new Comparator<LichGiangDay>() {
            @Override
            public int compare(LichGiangDay o1, LichGiangDay o2) {
                if (o1.getThu() == o2.getThu()) {
                    if (o1.getKip() == o2.getKip()) {
                        return o1.getTengGv().compareTo(o2.getTengGv());
                    }
                    return o1.getKip() - o2.getKip();
                }
                return o1.getThu() - o2.getThu();
            }
        });
        for (MonHoc x : mh) {
            if (x.getMaMon().equals(s)) {
                System.out.println("LICH GIANG DAY MON " + x.getTenMon() + ":");
                break;
            }
        }
        for (LichGiangDay x : lgd) {
            if (x.getMaMon2().equals(s)) {
                System.out.println(x);
            }
        }
    }
}
