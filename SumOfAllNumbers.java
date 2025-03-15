import java.util.*;
class Main {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10,20,30,50,70); 
    Optional<Integer> result=  list.stream().reduce((a,b)->a+b);
     System.out.println(result.get());   
    }
}