package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//how to create the stream object
public class StreamObject {
      public static void main(String[] args) {
          //Stream API - collection process
          //collection / group of object
          // 1- blank stream
          Stream<Objects> emptyObj = Stream.empty();
          //  emptyObj.forEach(e-> System.out.println(e));
          //2 way -array , object, collection
          String names[] = {"Durgesh", "Priti", "Ankit", "Akash", "Santosh"};
          Stream<String> stream1 = Stream.of(names);
          stream1.forEach(e -> System.out.println(e));

          // 3- Builder method stream object build karne ko
          Stream<Object> streamBuilder = Stream.builder().build();

          //4
          IntStream stream2 = Arrays.stream(new int[]{2, 4, 65, 3, 233});
          stream2.forEach(e -> System.out.println(e));
          // 5 List, Set
          List<Integer> list2 = new ArrayList<>();
          list2.add(12);
          list2.add(54);
          list2.add(23);
          list2.add(78);
         Stream<Integer>  newList    = list2.stream();
          newList.forEach(e-> System.out.println(e));


      }

}
