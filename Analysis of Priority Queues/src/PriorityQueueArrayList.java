/*
 * Mert Burma  
 * 041701033
 * 28.11.2020
 * Summary
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class PriorityQueueArrayList<E extends Comparable<E>> {
	private ArrayList<E>  temps = new ArrayList<E>();    //define arraylist
	
	
	
	
	public void enqueue(E newObject) {
		temps.add(newObject);
		for(int i = temps.size()-1; i > 0; i--) {					//check every arraylist elements and sort
			for(int j = 0; j < i; j++ ) {
				if(temps.get(j).compareTo(temps.get(j+1))>0) {
					Collections.swap(temps, j, j+1);
				}
			}
		}
	}
		
	public E dequeue() {
        
        if(temps.isEmpty()) {
        	return null;
        }
         E obj = temps.get(temps.size()-1);			
        temps.remove(obj);								//remove last element and return
	    return obj;
	}
	
	public void print() {
		for(int i =0; i<temps.size(); i++) {
			System.out.println(temps.get(i)); 		//printing for test
		}
	}	


  public static void main(String[] args) {
	  
	  
	 
	  PriorityQueueArrayList mert = new PriorityQueueArrayList();
	
	 for(int i=0; i<mert.temps.size(); i++) {
		  System.out.println(mert.temps.get(i));						//test 
		  
		  }
	 
	 
	  mert.temps.add(55);
	  mert.temps.add(10);
	  mert.temps.add(8);
	  mert.temps.add(70);
	  mert.temps.add(1);
	  
	  
	 
	  
	//  mert.Compare();
	  
	  System.out.println("****");
	  
	  
	  mert.print();
	  System.out.println("****");

	  for(int i = 0; i<mert.temps.size();i++) {
		  System.out.println(mert.temps.get(i));
	  }
	  System.out.println("****");
	  mert.enqueue(5);
	  mert.print();
	  System.out.println("*****");
	  mert.dequeue();
	  mert.print();
	  
	  
	
	
  
  }
			  
			  
  }

