package Parking;

public class PoorDog {

    private int size;
    private String name;

    public int getSize(){
        return size;
    }
    public int getName(){
        return name;
    }
}

public class PoorDogTestDrive{
            public static void main(String[]args){
               PoorDog one = new PoorDog();
               System.out.println("Dog is no dog"+one.getSize());
               System.out.println("Dog is no dog"+one.getName());
            }
        }
