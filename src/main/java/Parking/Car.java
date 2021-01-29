package Parking;

public class Car {

    private String id;//代表不希望人家改變   id
    private long enter;//代表不希望人家改變   enter
    private long leave;

    public Car(String id, long enter) {
        this.id = id;
        this.enter = enter; //command n 快速鍵
    }
    public void  leave(){
      leave =System.currentTimeMillis();
    }
    public void setLeave(long leave){

        if(leave > enter){
            this.leave=leave;
        }

}
}
