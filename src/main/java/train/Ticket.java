package train;

public class Ticket {

    int ticket;
    int round;


    public Ticket(int ticket, int round) {
        this.ticket = ticket;
        this.round = round;
    }


    public void print(){
        System.out.println(
                "Total ticket:" + ticket + "\t" + "Total trip:" + round + "\t" +"Total:" + ((ticket -round) * 1000 + round * 2000 * 0.9));
    }


}




