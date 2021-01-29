package train;

import java.util.Scanner;


public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int round = 0;
        do{
            System.out.println("Please enter number of tickets:");
            total = scanner.nextInt();
            if(total ==-1){
                System.out.println("End");
                break;
            }else{
                System.out.println("How many round-trip tickets:");
                round =scanner.nextInt();
            }
            Ticket ticket = new Ticket(total,round);
            ticket.print();
        }while (total !=-1);





    }
}
