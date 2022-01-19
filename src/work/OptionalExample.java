package work;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {
    public static Optional<String> getName(){
        String name = "priti";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {
        String str = "this is java class";
        String str1 = null;
       /* if(str==null){
            System.out.println("this is null object");

        }
        else{

            System.out.println(str.length());
        }*/
       Optional<String> optionalObj = Optional.ofNullable(str1);
        System.out.println(optionalObj.isPresent());
      //  System.out.println(optionalObj.get());
        System.out.println(optionalObj.orElse("No value in this object"));
       Optional<String> optionalName = getName();
        System.out.println(optionalName.orElse("null return"));
    }

}
