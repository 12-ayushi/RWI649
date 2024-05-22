package Collection_Practice;

import java.util.*;

/*
    hashmap is an implementd class of map interface
    syntax====
    import java.util;
    class HashMap implements Map, Serializable, Cloneable{

  }
  It is introduced in 1.2 version
  HashmMap underlying datastructure is HashTable

  propertiws;;
  it stores the value in key value pair
 imp=== one key value is Entry
imp===  Entry is in Map Interface and is an interface
===key should be unique and value can be duplicate
== max one null value in key nut it can store multiple null value in value
it store different type  of element
it does not follow sorting and insertion order
It is non synchronized ds
  */
public class HashMapDemo {
    public static void main(String[] args) {
        Map m<Integer,String>=new HashMap<>();
        m.put(1,"Iuc");
        m.put(2,"Manc");
        m.put(3,"Tanu");
        System.out.println(m);
    }
}
