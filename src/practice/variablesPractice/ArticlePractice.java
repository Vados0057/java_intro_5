package practice.variablesPractice;

public class ArticlePractice {
    public static void main(String[] args) {
        String myName = "Vlad";
        String myLastName = "Ksendziuk";
        String myFullName = myName + "" + myLastName;
        int myAge = 25;
        String myWife = "Adel";
        String petName = "Cashew";
        String myCity = "Kharkiv";
        String myFavSport = "Soccer";
        String myFavTeam = "Chelsea";

        char myFavChar = '-';



        System.out.println("\tHello everyone. My name is " + myName + ". " + "I am " + myAge + "years old. " + "I was born in " + myCity + ".\n" + myFavChar + " " +  "I have a wife. Her name is " +  myWife + ".\n" + myFavChar +
                " We adopt a cat. His hame is " + petName + ".\n"
                + myFavChar +  " My favorite sport is " +
                myFavSport + ". " + "And my favorite club is " + myFavTeam + ". ");
    }
}
