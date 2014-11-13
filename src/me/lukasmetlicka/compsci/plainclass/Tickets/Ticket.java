package me.lukasmetlicka.compsci.plainclass.Tickets;

/**
 * Created by LukasMetlicka on 11/12/14.
 */
public class Ticket {

    private int number;
    private int price;

    public Ticket( int number, int price ) {

        this.number = number;
        this.price = number*price;

    }
    public Ticket( int a ){
        this( a, 0);
    }

    public void setPrice(int a){
        price = a;
    }
    public void setNumber(int a){
        number = a;
    }
    public int getNumber(){
        return number;
    }
    public int getPrice(){
        return price;
    }

    public String toString(){
        return ("number: "+ number + "\tprice: "+ price);
    }

}