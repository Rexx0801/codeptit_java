package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
class MonThi {

    private String ma;
    private String ten;
    private String hinhthucthi;

    public MonThi(String ma, String ten, String hinhthucthi) {
        this.ma = ma;
        this.ten = ten;
        this.hinhthucthi = hinhthucthi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinhthucthi() {
        return hinhthucthi;
    }

    public void setHinhthucthi(String hinhthucthi) {
        this.hinhthucthi = hinhthucthi;
    }

}

public class danhSachMonThi {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        List<MonThi> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        while (sc.hasNextLine()) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String hinhthucthi = sc.nextLine();
            MonThi mt = new MonThi(ma, ten, hinhthucthi);
            if (b.contains(ma)) {
                continue;
            } else {
                b.add(ma);
                a.add(mt);
            }
        }
        Collections.sort(a, new Comparator<MonThi>() {
            @Override
            public int compare(MonThi m1, MonThi m2) {
                if (m1.getMa().compareTo(m2.getMa()) > 0) {
                    return 1;
                }
                return -1;
            }
        });
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getMa() + " " + a.get(i).getTen() + " " + a.get(i).getHinhthucthi());
        }
    }
}
