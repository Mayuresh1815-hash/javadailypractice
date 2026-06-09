package mayur2;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {

    ArrayList<Integer>list=new ArrayList<>();
//        ArrayList<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(2);
    list.add(8);
    list.add(6);
        System.out.println(list.get(0));
        for(int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }

        System.out.println(list.contains(8));
        list.remove(2);
        System.out.println(list);
    }
}
