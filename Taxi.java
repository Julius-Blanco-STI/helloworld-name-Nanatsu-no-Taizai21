public class Taxi {

    	private int x = 0;
    	private int y = 0;
    	private int dest_x = 0;
    	private int dest_y = 0;
    	public String name = null;
    	
    public Taxi(String name) {
		this.name = name;
	
    }
    	
    	public int getDest_x(){
    		return this.dest_x;
    	}
    	public int getDest_y(){
    		return this.dest_y;
    	}
    	
       	public void run(String run){
       		int C = run.length();
       		for(int a = 0; a < C; a++){
       			if(run.charAt(a) == 'l' || run.charAt(a) =='L'){
       				x--;
       			}
       			else if(run.charAt(a) == 'r' || run.charAt(a) == 'R'){
       				x++;
       			}
       			else if(run.charAt(a) == 'd' || run.charAt(a) == 'D'){
       				y--;
       			}
       			else if(run.charAt(a) == 'u' || run.charAt(a) == 'U'){
       				y++;
       			}	
       		}
       		
    		    		
    	}
    	public void setBook(int dest_x, int dest_y){
    		this.dest_x = dest_x;
    		this.dest_y = dest_y;
    	}
    	public boolean reachedDestination(){
    		
    		if((x == dest_x) && (y == dest_y)){
    			return true;
    		}
    		return false;
    	}
    	public void printCurrentLoc(){
    		System.out.println("Your current location is on: " + x + " " + y);    		
    	}
    }
       
