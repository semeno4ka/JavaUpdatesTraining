package com.cydeo.HomeTask;

import java.util.ArrayList;
import java.util.List;

public class PrettyPrintApple {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, Color.GREEN));
        inventory.add(new Apple(180, Color.RED));
        inventory.add(new Apple(280, Color.GREEN));
        inventory.add(new Apple(380, Color.RED));

        ApplePredicate appleLambda=apple-> "An apple of "+apple.getWeight()+"g.";
        prettyPrintApple(inventory,appleLambda);
        prettyPrintApple(inventory, apple->"A "+apple.getColor()+" apple");

       // Example for more than one line
       ApplePredicate fancyApple = apple->{
          String ch = apple.getWeight()>200?"Heavy":"Light";
          return "A "+ch+ " "+apple.getColor()+" apple";
      };
prettyPrintApple(inventory,fancyApple);
    }

    public static void prettyPrintApple(List<Apple> inventory, ApplePredicate applePredicate){
    for(Apple apple: inventory){
        String output= applePredicate.print(apple);
        System.out.println(output);
    }

    }
}
