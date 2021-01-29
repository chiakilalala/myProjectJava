package yilin.com;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
int sum =0;
            for (int i = 5; i >=1; i--) {
             sum = sum + i;

            }
        System.out.print(sum);
        Scanner scanner =new Scanner(System.in);
        int secret = new Random().nextInt( 10)+1;
        for (int i = 1; i <=4 ; i++) {
            System.out.print("please enter ("+i+"/4"));
            int number =scanner.nextInt();
            System.out.println("地"+i+"次"+number);

            if(number >secret){
                System.out.println("lower");
            }else if(number <secret){
                System.out.println("highter");
            }else{
                System.out.println("game the nnumber is"+ number);
                break;
            }

        }
        System.out.println("結束");
    }
}
