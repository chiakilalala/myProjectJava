package yilin.com;

public class Float {

    public static void main(String[] args) {
        float var1 = 10;
        float var2 = 3.0f;
        float var3;
        var3 = var1 +  var2;
        System.out.printf("10 + 3.0f = %.2f\n", var3);

        var3 = var1 /  var2;
        System.out.printf("10 / 3.0f = %.2f\n", var3);

        var3 = var1 %  var2;
        System.out.printf("10 %% 3.0f = %.2f\n", var3);

        var3++;
        System.out.printf("var3++ = = %.2f\n", var3);



        //%.2f %. 表示 小數點前任意位數   2 表示兩位小數 格式後的結果為f 表示浮點型
        //跳行 \n
    }
}
