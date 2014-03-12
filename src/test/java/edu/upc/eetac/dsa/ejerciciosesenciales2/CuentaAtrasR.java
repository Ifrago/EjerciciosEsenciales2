package edu.upc.eetac.dsa.ejerciciosesenciales2;

public class CuentaAtrasR implements Runnable{
	
	static public String UltimaEscritura=null;
	int inicial=0;
	int numThreads=0;
	
	public CuentaAtrasR (int init){
		inicial=init;
	}
	public synchronized void UltimaEscritura(){
		
		System.out.println(Thread.currentThread().getName()+" - "+inicial+" - última escritura: "+UltimaEscritura);
		UltimaEscritura=Thread.currentThread().getName();
	}
	
	
	public void run() {

		try{
			while(inicial!=0){					
				UltimaEscritura();
				Thread.sleep(1000);
				inicial--;
			}
			numThreads=Thread.activeCount();
			System.out.println("Ultima escritura "+Thread.currentThread().getName()+" - "+numThreads+" Threads activos.");
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
  }


}
