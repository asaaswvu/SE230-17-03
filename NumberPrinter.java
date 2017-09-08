import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

class NumberPrinter{

    LinkedList<Integer> ll;

    NumberPrinter(){
        Random rand = new Random();
        ll = new LinkedList<Integer>();
        
        for(int i=0; i<10; i++){
            ll.add(rand.nextInt(100) + 1);
        }

        doStuff();
    }

    private void doStuff(){

        Collections.sort(ll);
    	 
        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + ll);

    }




    public static void main(String [] args){
        new NumberPrinter();	
    }

}
