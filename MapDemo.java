/*
Map is an interface which is java.util package
Map does not inherite collection interface
introduced in 1.2 version
syntax===
package java.util;
public interface Map{
    //methods

}

heirarchy of map interface
                         Map
                          |
                                     SortedMap(I)
                                         |
                                     NavigableMap(I)
                                         |
    HashMap(c)                       TreeMap(c)          HashTable(c)
        |
    LinkedHashMap(c)


    ============================================
    Properties of map:
  1)  It stores the data in key-value pair
     In map key should be unique but value can be duplicate
    key-value is Entry
   2) In map we can store max one null value in key nut in value we can store any number of null values
   3) Map does not follow sorting and insertion order

 */


package Collection_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList<>();
        l.add(10);
        l.add(20);
        System.out.println(l);
        Map m =new HashMap();
//        to insert
        m.put(1,"Ayushi");
        m.put(2,"Roshni");
        m.put(3,"Tanu");

//        m.get(1);
//        m.clear();
        System.out.println(m );
        System.out.println(m.containsKey(1));
        System.out.println(m.containsValue("nu"));
//        map to set
//        m.Map.Entry();

        System.out.println(m.entrySet());
        m.replace(1,"as");
        System.out.println(m);
        System.out.println(m.size());
//        property
        m.put(2,"add0");
       System.out.println(m);
       m.put(null,null);
       m.put(null,"fg");
        System.out.println(m);
        m.put(5,"hgggh");
        System.out.println(m);
    }
}
