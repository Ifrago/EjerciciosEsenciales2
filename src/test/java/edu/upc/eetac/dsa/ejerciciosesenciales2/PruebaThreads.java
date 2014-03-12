package edu.upc.eetac.dsa.ejerciciosesenciales2;

import edu.upc.eetac.dsa.ejerciciosesenciales2.CuentaAtras;
import edu.upc.eetac.dsa.ejerciciosesenciales2.CuentaAtrasR;

public class PruebaThreads {
	
	public static void main(String args[])
	{
	
		try{
	//instanciamos los Threads de la subclase Threads	
	CuentaAtras contador1 = new CuentaAtras("ID1", 4);
	CuentaAtras contador2 = new CuentaAtras("ID2", 7);
	CuentaAtras contador3 = new CuentaAtras("ID3", 8);
	
	//Instanciaos los Threads de la interfaz Runnable
	new Thread ( new CuentaAtrasR(4) , "ID5").start();
	new Thread ( new CuentaAtrasR(7) , "ID6").start();
	new Thread ( new CuentaAtrasR(8) , "ID7").start();
	
	//Ejecutamos los Threads de la subclase Threads
	contador1.start();
	contador2.start();
	contador3.start();

		}catch(IllegalThreadStateException ie){
			ie.printStackTrace();
		}
	
	
	}
}
