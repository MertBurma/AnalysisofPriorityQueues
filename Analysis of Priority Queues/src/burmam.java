/*
 * Mert Burma   
 * 041701033
 * 29.11.2020
 * Summary
 */


import java.util.PriorityQueue;
import java.util.Random;

public class burmam {

	public static  void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(" N\t\tMyPriorityQueue\t\t\tPriorityQueueArrayList");
		System.out.println("---------------------------------------------------------------------------");
		
				
		int size=10;
		Random random = new Random();
		while(size <= 100) {                                //define array
		int[]  randomintegers = new int[size];
			
		for(int i = 0; i<randomintegers.length; i++) {
			randomintegers[i] = random.nextInt(100000);
			
		}
		
		
		
		
		PriorityQueueArrayList mert = new PriorityQueueArrayList();
		
		
		long startarraylist = System.nanoTime();
		for (int value : randomintegers)
          mert.enqueue(value);										//calculate PriorityQueueArrayList class's enqueue and dequeue time
		long endTime = System.nanoTime();
		long estimatedTime = endTime - startarraylist;
		double seconds = (double)estimatedTime/1000000000; 
		
		
		long startarraylistremove = System.nanoTime();
		while(mert.dequeue()==null) {
			mert.dequeue();
		}
		
		long endTimeremove = System.nanoTime();
		long estimatedTimeremove = endTimeremove - startarraylistremove;
		double secondsremove = (double)estimatedTimeremove/1000000000; 
		
		MyHeap<Integer> myHeap = new MyHeap<>();

        
		long startheap = System.nanoTime();
		for (int value : randomintegers)							//calculate heaps class's enqueue and dequeue time
            myHeap.add(value);
		long endTimeheap = System.nanoTime();
		long estimatedTimeheap = endTimeheap - startheap;
		double secondsheap = (double)estimatedTimeheap/1000000000; 
		
		
		long startheapremove = System.nanoTime();
		while(!myHeap.isEmpty()) {
			myHeap.remove();
		}
		long endTimeheapremove = System.nanoTime();
		long estimatedTimeheapremove = endTimeheapremove - startheapremove;
		double secondsheapremove = (double)estimatedTimeheapremove/1000000000;
		
	
	
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		
		long startpQueue = System.nanoTime();
		for (int value : randomintegers)
			pQueue.add(value);										//calculate java's own class's enqueue and dequeue time
		long endTimepQueue = System.nanoTime();
		long estimatedTimepQueue = endTimepQueue - startpQueue;
		double secondspQueue = (double)estimatedTimepQueue/1000000000; 
		
		
		long startpQueueremove = System.nanoTime();
		while(!pQueue.isEmpty()) {
		pQueue.remove();
		}
		long endTimepQueueremove = System.nanoTime();
		long estimatedTimepQueueremove = endTimepQueueremove - startpQueueremove;
		double secondspQueueremove = (double)estimatedTimepQueueremove/1000000000; 
		
	
		double javapriority = secondspQueue + secondspQueueremove;
		double myheap =  secondsheapremove + secondsheap;					
		double myclass = secondsremove + seconds;
		

		
		System.out.println(size+"\t\t"+ myheap/javapriority+"\t\t"+ myclass/javapriority );
		System.out.println("---------------------------------------------------------------------------");
		
		
		size=size + 10;				//I increase size  every while loop
		
		}
		
		
	}

}
