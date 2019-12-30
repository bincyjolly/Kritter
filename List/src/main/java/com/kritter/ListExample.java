package com.kritter;

import java.util.ArrayList;

public class ListExample {
    public static void main(String args[]) {
        /* Creating ArrayList of type "String" which means
         * we can only add "String" elements
         */
        ArrayList<String> obj = new ArrayList<String>();

        /*This is how we add elements to an ArrayList*/
        obj.add("Parul");
        obj.add("Nupur");
        obj.add("Bincy");
        obj.add("Maitri");
        obj.add("Suraj");

        // Displaying elements
        System.out.println("Original ArrayList:");
        for(String str:obj)
            System.out.println(str);

        /* Add element at the given index
         * obj.add(0, "arjun") - Adding element "Rahul" at first position
         * obj.add(1, "rohan") - Adding element "Justin" at second position
         */
        obj.add(0, "Arjun");
        obj.add(1, "Rohan");

        // Displaying elements
        System.out.println("ArrayList after add operation:");
        for(String str:obj)
            System.out.println(str);

        //Remove elements from ArrayList like this
        obj.remove("Bincy"); //Removes "Bincy" from ArrayList


        // Displaying elements
        System.out.println("ArrayList after remove operation:");
        for(String str:obj)
            System.out.println(str);

        //Remove element from the specified index
        obj.remove(1); //Removes Second element from the List

        // Displaying elements
        System.out.println("Final ArrayList:");
        for(String str:obj)
            System.out.println(str);
    }
}
