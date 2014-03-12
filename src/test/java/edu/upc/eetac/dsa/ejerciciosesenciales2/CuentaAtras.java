package edu.upc.eetac.dsa.ejerciciosesenciales2;


public class CuentaAtras extends Thread {
	
	static public String UltimaEscritura=null;
	String IDThread=null;
	int init=0;
	int numThreads=0;

	public CuentaAtras (String id, int inicio){
		IDThread=id;
		init=inicio;		
	}
	public synchronized void UltimaEscritura(){
		
		System.out.println(IDThread+" - "+init+" - última escritura: "+UltimaEscritura);
		UltimaEscritura=IDThread;
	}
	
	public void run() {

		try{
			while(init!=0){			
				UltimaEscritura();
				Thread.sleep(1000);
				init--;
			}
			numThreads=Thread.activeCount();
			System.out.println("Ultima escritura "+IDThread+" - "+numThreads+" Threads Activos.");
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}       
    }	
}
