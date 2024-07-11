package multi_threading;

class Table{
	public synchronized void printMulTable(int num) {
		for(int i=1;i<=10;i++) {
			//10*1=10
			System.out.println(num+"*"+i+"="+(num*i));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	  }
	}
}

class ViratThread extends Thread{
	  private Table t;
	  private int num;
	  ViratThread(Table t,int num) {
	  System.out.println("ViratThread...");
  	this.t=t;
  	this.num=num;
  }
	  @Override
	  public void run() {
	   	t.printMulTable(num);
	   }
}
class SachinThread extends Thread{
	  private Table t;
	  private int num;
	 public SachinThread(Table t,int num) {
           	this.t=t;
           	this.num=num;
  }    @Override
	   public void run() {
	  t.printMulTable(num);
	  }
}
class DhoniThread extends Thread{
     private Table t;
     private int num;
public DhoniThread(Table t,int num) {
	this.t=t;
	this.num=num;
}
@Override
public void run() {
 	t.printMulTable(num);
 }
}
public class Test {
	public static void main(String[] args) {
		    Table t = new Table();
		DhoniThread dhoni= new DhoniThread(t,7);
	   SachinThread sachin= new SachinThread(t,9);
		ViratThread virat= new ViratThread(t,11);
		
		dhoni.start();
		sachin.start();
	    virat.start();
	}
}