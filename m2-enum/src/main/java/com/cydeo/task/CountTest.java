package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class CountTest {
    public static void main(String[] args) {

        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }

    // why we need generic? - to execute Prime and Odd
private static <T> int countIf(List<T> c,UnaryPredicate<T> p){// have to put Interface, because otherwise you either accept Odd or EVen objects
      int count = 0;
      for(T element:c){
          if(p.test(element)){
              ++count;
          }
      }
      return count;
}
/*
Will the following class compile? If not, why?

public final class Algorithm {
public static <T> T max(T x, T y) {
return x > y ? x : y;
}
}

will not work, because generics does not accept PRIMITIVES, and >/< sign cannot be apllied to Objects

Will the following method compile? If not, why?

public static void print(List<? extends Number> list) {
for (Number n : list)
System.out.print(n + " ");
System.out.println();
}
will work, because you specify the exact type as Numbers


we can't use polymorphism within Node



 */
}
