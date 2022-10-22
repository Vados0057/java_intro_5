package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {


        /*
        Declare a String and store a name in it
        Declare different Strings and store the names of your best  friends in them
        Declare different Strings and store the names of all your friends in them
         */


        //Storing a name in a String
        String name = "John"; //Single container with single name

        //Storing best friend's names
        String bff1 = "Jane", bff2 = "Alex", bff3 = "Mike";

        //Storing more names
        String[] names = {"Beyza", "Andrii", "Vlad","Samir", "Olena"}; //holding a collection of names

        //Retrieving an element form array - using index
        System.out.println(names[2]); //Vlad
        System.out.println(names[4]); //Olena

        //ArrayIndexOutOfBoundException
        //System.out.println(names[5]); we don't have a index of 5
        //System.out.println(names[-3]); we can't use negative numbers in arrays

        int age = 25;
        int[] ages = {21,23,25}; //< 21 - 0, 23 - 1, 25 - 2; <----------^
        System.out.println(ages[2]); // INDEX STARTS WITH 0so that's why|




    }
}
