package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {
        //create a list and filter all even numbers from list
      //  List<Integer> list1 =  List.of(2,4,50,21,22,67);

       List<Integer> list3 =  Arrays.asList(2,4,50,21,22,67);
       List<Integer> list2 = new ArrayList<>();
       list2.add(12);
        list2.add(54);
        list2.add(23);
        list2.add(78);

        // list1
        //without stream
        List<Integer> listeven = new ArrayList<>();
        for(Integer i: list3) {
            if (i % 2 == 0) {
                listeven.add(i);
            }
        }
        System.out.println(list3);
        System.out.println(listeven);
        /* using stream */
        /*Stream<Integer> stream= list2.stream();
        List<Integer> newlist = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newlist);*/
        List<Integer> newList = list2.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);
        List<Integer> newList1  = list2.stream().filter(i -> i>30).collect(Collectors.toList());
        System.out.println(newList1);
    }

}
