package lamb1;
import java.util.ArrayList;

import  java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class LampdaExample {

    public static void main(String[] args) {
        List<Integer> inList = new ArrayList<>();
        inList.add(1);
        inList.add(2);
        inList.add(3);
        inList.add(4);
        inList.add(5);
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(6.4);
        doubleList.add(8.6);
        doubleList.add(1.23);
        doubleList.add(4.13);
        doubleList.add(12.2);

        processElements(inList,x->Math.sin(x));
    }

    private  static void processElements (List<Integer> inList, ElementProcessor function){
        List<Double> doubleList = new ArrayList<>();
        for (Integer i : inList){
        doubleList.add(function.process(i));
    }
        System.out.println(doubleList);
    }
}