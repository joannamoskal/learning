package com.wordpress.programujeodzera;

public class Main {
    public static void main(String[] args) {
        int wynik1 = 1+2;
        System.out.println("1+2=" + wynik1);
        int poprzedniWynik = wynik1;
        int wynik2 =wynik1 - 1 ;
        System.out.println(poprzedniWynik + "-1=" + wynik2);
        int wynikOdejmowania = wynik2;
        int wynik3 = wynik2 * 10;
        System.out.println(wynikOdejmowania + "*10=" + wynik3);
        int wynikMnożenia = wynik3;
        int wynik4 = wynik3/5;
        System.out.println(wynikMnożenia + "/5=" + wynik4);

        int wynikDzielenia = wynik4;
        int wynik5 = wynik4%3;
        System.out.println(wynikDzielenia + "%3=" + wynik5);





        int mySecondNumber = 1;
        mySecondNumber--;
        System.out.println("wynik dekrementacji = " + mySecondNumber);

        int myThirdNumber = 2;
        myThirdNumber += 2;
        System.out.println("wynik =" + myThirdNumber);

        int myFourthNumber = 3;
        myFourthNumber *= 2;
        System.out.println("rezultat = " + myFourthNumber);

        int myFifthNumber = 2;
        myFifthNumber -=1;
        System.out.println("wynik =" + myFifthNumber);

        int mySixthNumber = 6;
        mySixthNumber /= 2;
        System.out.println("wynik =" + mySixthNumber);

        boolean isMale = false;
        if (isMale == true)
        System.out.println("It is not a male.");

        int ilośćPunktów = 30;
        if (ilośćPunktów < 50)
            System.out.println("Zdobyłeś najwięcej punktów!");
        int drugaIlośćPunktów = 70;
        if ((ilośćPunktów<drugaIlośćPunktów )&& (drugaIlośćPunktów>50))
            System.out.println("Ilość punktów jest " +
                    "mniejsza od drugiej " +
                    "ilości punktów i druga ilość punktów " +
                    "jest większa niż 50");












    }
}
