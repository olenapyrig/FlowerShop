package data;
import data.set.Bouquet;
import data.set.OwnBouquet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do you want to buy formed bouquet(1) or form your own(2)?(enter 1 or 2)");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i==1){
            System.out.println("Already formed bouquet: ");
            Bouquet bouquet = Bouquet.getRandomBouquet();
            System.out.println(bouquet);
        }
        else{
            OwnBouquet bouquet = OwnBouquet.ownBouquet();
            System.out.println(bouquet);
        }

    }
}