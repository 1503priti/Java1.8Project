package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
    //filter(Predicate)
        //boolean value function
        //e->e>10

        //map(function)
      /*
      each element operation
      */

       // List<String> names = List.of("Aman","Ankit","Abhinav","Durgesh");
        List<String> names =  Arrays.asList("Aman","Ankit","Abhinav","Durgesh");
        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        names.stream().forEach(
                e-> System.out.println(e)
        );
        newNames.stream().forEach(System.out::println);
        newNames.forEach(e-> System.out.println(e));
        List<Integer> numbers =  Arrays.asList(2,14,22,9,8,4);
       List<Integer> newNumbers =  numbers.stream().map(e->e*e).collect(Collectors.toList());
        newNumbers.forEach(e-> System.out.println(e));

      //sorted
        numbers.stream().sorted().forEach(System.out::println);
        //min value
       Integer minNum  = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("Min:"+minNum);
       Integer maxNum =  numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Max:"+maxNum);
    }
}
