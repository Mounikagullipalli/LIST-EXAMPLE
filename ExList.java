import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("divya");
        l.add("mouni");
        l.add("jyo");
        l.add("mouni");
        l.add("ravi");
        l.add("supu");
        //  l.remove("mouni");
        System.out.println(l);
        //for loop
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
            //for each
            for (String m : l) {
                System.out.println(m);
                //iterator
                Iterator<String> itr = l.iterator();
                while (itr.hasNext()) {
                    System.out.println(itr.next());

                    //java8
                    l.stream().forEach(System.out::println);
                }
            }
        }
    }
    }

