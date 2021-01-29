package yilin.com.student;


import  java.util.Scanner;

public class SchollRunner {
    public static void main(String[] args) {
    //    userInput();
        Student.pass =50;
        Student stu = new Student("Hank", 97, 10);
        Student stu2 = new Student("Tom", 60, 60);
        Student stu3 = new Student("Jane", 55, 30);

       GrandStudent gstu = new GrandStudent("jsvk",60,60,60);
        gstu.print();
       stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score" + stu.highest());

    }

    private static void userInput() {
        System.out.print("please enter student's name");
        Scanner scanner = new Scanner(System.in); //系統輸入
        String name = scanner.next();
        System.out.print("please enter student's english");
        int english = scanner.nextInt();
        System.out.print("please enter student's math");
        int math = scanner.nextInt();
        Student stu = new Student("Hank", 60, 60);

        stu.print();
        System.out.println("High score" + stu.highest());
    }
}
