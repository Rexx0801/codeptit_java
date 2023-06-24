package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author GearNB Shop PC
 */
class BaiTap {

    private String ten;
    private int baidung, submit;

    public BaiTap() {
    }

    public BaiTap(String ten, int baidung, int submit) {
        this.ten = ten;
        this.baidung = baidung;
        this.submit = submit;
    }

    @Override
    public String toString() {
        return ten + " " + baidung + " " + submit;
    }

    public String getTen() {
        return ten;
    }

    public int getBaidung() {
        return baidung;
    }

    public int getSubmit() {
        return submit;
    }

}

public class luyentaplaptrinh {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("LUYENTAP.in");
        Scanner sc = new Scanner(f);
        int t = Integer.parseInt(sc.nextLine());
        List<BaiTap> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            String ten = sc.nextLine();
            String[] part = sc.nextLine().split(" ");
            int baidung = Integer.parseInt(part[0]);
            int submit = Integer.parseInt(part[1]);
            BaiTap bt = new BaiTap(ten, baidung, submit);
            a.add(bt);
        }
        Collections.sort(a, new Comparator<BaiTap>() {
            @Override
            public int compare(BaiTap b1, BaiTap b2) {
                if (b1.getBaidung() > b2.getBaidung()) {
                    return -1;
                } else if (b1.getBaidung() == b2.getBaidung()) {
                    if (b1.getSubmit() < b2.getSubmit()) {
                        return -1;
                    } else if (b1.getSubmit() == b2.getSubmit()) {
                        if (b1.getTen().compareTo(b2.getTen()) > 0) {
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return 1;
            }
        });
        for (BaiTap i : a) {
            System.out.println(i);
        }
    }

}
