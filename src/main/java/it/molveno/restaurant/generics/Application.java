package it.molveno.restaurant.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        {
            List<Integer> numberList = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));

            numberList.add(144);

            for(int element: numberList){

                System.out.println(element);

            }
        }

       // java pre 5
        {
            List numberList = new ArrayList(Arrays.asList(0,1,2,3));
            numberList.add("3");
            numberList.add(new Bike());
            numberList.add(51);

            for(Object element : numberList){

                Bike motorfiets = (Bike) element;
            }

        }



    }
}

class Bike {

}
