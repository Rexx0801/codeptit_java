package codeptit;
        
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.util.TreeSet;
public class ghepMa {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> arr1=(ArrayList<String>) ois1.readObject();
        ArrayList<Integer> arr2=(ArrayList<Integer>) ois2.readObject();
        TreeSet<String> ts=new TreeSet<>();
        for(String x:arr1){
            for(Integer y:arr2){
                String s=x+y.toString();
                ts.add(s);
            }
        }
        for(String x:ts){
            System.out.println(x);
        }
    }
}
