public class Main {
    
    public static void main(String[] args) {
    	Taxi x = new Taxi("AMD-570");
    	x.run("ruRU");
    	x.printCurrentLoc();
    	x.setBook(1,1);
    	x.reachedDestination();
    	System.out.println("YOUR TAXI's Plate Number is : " + x.name);
    	System.out.println(x.reachedDestination());
    }
}
