import java.util.*;
public class AssociationTry {
    public static void main(String[] args){
        System.out.println("Begin");
        PassengerAircraft pa=new PassengerAircraft();
        pa.refuel(new Fuel(3000F));
        System.out.println("Pilot Name: "+pa.p.name);
        System.out.println("Total flying hours: "+pa.p.hours);
        System.out.println("Destination: "+pa.des.d);
        System.out.println("Arrival: "+pa.arr.a);
        TicketCounter counter=new TicketCounter();
        Ticket t=counter.issueTicket("Rhea",pa.des);
        t.showTicket();
    }
}

class Aircraft
{

}
class PassengerAircraft extends Aircraft
{
    //hasA
    Pilot p=new Pilot("Muskan",120);
    Destination des=new Destination("New York");
    Arrival arr=new Arrival("Mumbai");
    //usesA
    Fuel fuel;
    void refuel(Fuel f) {
        this.fuel = f;
        System.out.println("Aircraft refueled with "+f.total+" litres");
    }
}
class Pilot
{
    String name;
    int hours;

    public Pilot(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }
}
class Destination
{
    String d;

    public Destination(String d) {
        this.d = d;
    }
}
class Arrival
{
    String a;

    public Arrival(String a) {
        this.a = a;
    }
}

class Fuel
{
    float total;

    public Fuel(float total) {
        this.total = total;
    }
}
class Ticket
{
    String name;
    Destination destination;

    public Ticket(String name,Destination destination) {
        this.name = name;
        this.destination=destination;
    }
    void showTicket(){
        System.out.println("Ticket issued to "+name);
    }
}
class TicketCounter
{
    Ticket issueTicket(String name,Destination destination){
        return new Ticket(name,destination);
    }
}