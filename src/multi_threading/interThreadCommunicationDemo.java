package multi_threading;                                                   
                                                                           
class BhahubaliThread extends Thread {                                     
	int total = 0;                                                         
                                                                           
	@Override                                                              
	public void run() {                                                    
		// Take-1 Calculate sum of first 100 natural numbers.              
		System.out.println("2.calcuation  begings....");                   
		for (int i = 1; i <= 100; i++);{                                                                  
			total = total + 1;                                             
		}                                                                  
		System.out.println("3.calcuation is done");                        
		System.out.println("4.Bhahubali gives the notification");          
                    
		synchronized (this){
	                 this.notify();
		
		}
		// TASK-2: Bhahubali busy with Devasena in duet.                   
		// 24 hours.
		
		// Task-3 Bhahubali busy in war.                                   
		// 100 hours.                                                      
	}                                                                      
}            



                                                                           
public class interThreadCommunicationDemo {                                
	public static void main(String[] args) throws InterruptedException {   
		BhahubaliThread b = new BhahubaliThread();                         
		b.start();                                                         
                                                                           
		// Main Thread job                                                 
		System.out.println("1.Main Thread calling wait()");                
		synchronized (b) {                                                 
			// b.wait();                                                   
			b.wait(5000,100);                                              
		}                                                                  
		System.out.println("5.main Thread got notification");              
		System.out.println(b.total);                                       
                                                                           
	}                                                                      
                                                                           
}                                                                          
                                                                           