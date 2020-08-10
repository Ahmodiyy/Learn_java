package LanguageBasics;

import OopsConcept.Bicycle;
import OopsConcept.NumAndString;

import static java.lang.Math.PI;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

interface face{}
public class  GenericDemo<T> {
    Integer by;
    <T>GenericDemo(Integer by){
        this.by = by;
    }
     Integer add(Integer i){
        return  i;
    }


    <K extends Double & face, V extends face>void genericMethods(){}

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {

        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
    //upper bound wildcard
     void upperBoundedWildcard(Set <? extends Number> num){
        for(int g = 0; g<10; g++){

        }
     }
     void lowerBoundedWildcard(List<? super Integer> list){
         for(int g = 0; g<10; g++){
             list.add(g);
         }
         System.out.println(list);
     }
     //subtyping in generic
    void subTyp(){
        //not subtype in this case use upperBoundWildcard
       /* List<Integer> list1 = new ArrayList<>();
        List<Number> list2 = list1; */

        List<? extends Integer> list3 = new ArrayList<>();
        List<? extends Number> list4 = list3;
    }
    //wildCard Capturing using private helper method
    void foo(List<?> li){
       helper(li);
    }

   private <T> void helper(List<T> lis){
        lis.set(0, lis.get(0));

   }

    public static void main(String[] args) {
        GenericDemo<Integer> genericDemo = new GenericDemo<>(2);
        GenericDemo<String> genericDemo2 = new GenericDemo<>(2);
//        GenericDemo<Integer> generic1 = genericDemo;
        Integer adds= genericDemo.add(2);
        System.out.println(adds);
        List<? super Integer> li = new ArrayList<>();
        genericDemo.lowerBoundedWildcard(li);
        Integer ab = 1;
        long b = (long)ab;
//        GenericDemo<Long> ge = (GenericDemo<Long>)ab;
        /* accessing package members*/
        //import
        NumAndString a;
        // qualified name
      Bicycle aj;
        double s = PI;


    }
}
// Package private because it cannot be public
  class a{
    public static void main(String[] args) {

    }
}
