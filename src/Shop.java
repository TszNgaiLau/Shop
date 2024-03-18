import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> materials = new ArrayList<>();
    ArrayList<String> consumables = new ArrayList<>();


    public Shop() {
        menu();
    }

    public void menu() {
        String option = "";
        while (!option.equals("l")) {
            System.out.println("What do you wish to do?\n(B)uy\n(S)ell\n(L)eave");
            option = scan.nextLine().toLowerCase();
            if (!option.equals("l")) {
                if (option.equals("b")) {
                    buy();
                } else if (option.equals("s")) {
                    sell();
                } else {
                    System.out.println("This is not a valid option!");
                }
            }
        }
    }

    public void buy() {
        System.out.print("We have two sections of items. Which section do you wish to enter?\n(C)onsumable\n(M)aterials");
        String option = scan.nextLine().toLowerCase();
        if (option.equals("c")) {
            for (int i = 0; i  < consumables.size(); i++) {
                System.out.println((i + 1) + ". " + consumables.get(i));
            }
            System.out.print("What do you wish to buy?(Choose by entering the number in front of the item) :");
            int choice = scan.nextInt();
            choice--;
            scan.nextLine();
        } else if (option.equals("m")) {
            for (int i = 0; i < consumables.size(); i++) {
                System.out.println((i + 1) + ". " + consumables.get(i));
            }
            System.out.print("What do you wish to buy?(Choose by entering the number in front of the item) :");
            int choice = scan.nextInt();
            choice--;
            scan.nextLine();
        } else {
            System.out.println("Get ");
        }


    }

    public void sell() {
        System.out.print("What do you wish to sell?\n(C)onsumable\n(E)quipment\n(M)aterials");
        String option = scan.nextLine().toLowerCase();

    }
}
