package yilin.com;

public class Int {
    public static void main(String[] args) {
         int var1 = 10; int var2 = 3;
         int var3;

         var3 = var1 + var2;
         System.out.printf("10 + 3 = %d\n", var3);

         var3 = var1 - var2;
         System.out.printf("10 - 3 = %d\n", var3);  //%d 整數 d10近衛整數值

        var3 = var1 * var2;
        System.out.printf("10 x 3 = %d\n", var3);

        var3 = var1 / var2;
        System.out.printf("10 / 3 = %d\n", var3);


        var3 = var1 % var2; //餘數
        System.out.printf("10 ％％ 3 = %d\n", var3);
    }
}
