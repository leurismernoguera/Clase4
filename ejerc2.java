package class4java;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Ejerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        try{
		            Scanner lector = new Scanner(new FileInputStream("C:\\Users\\Usuario\\Desktop\\numeros.txt"));
		            int numero=0;
		            int suma=0;
		            
		            System.out.println("Los numeros son: ");
		            
		            while(lector.hasNext()){
		                numero=lector.nextInt();
		                System.out.print(numero+" ");
		                suma+=numero;
		            }
		            System.out.println("\nSuma de los numeros: "+suma);
		        }
		        catch(FileNotFoundException e){
		            System.err.println(e.getCause());
		        }
		    } 
		}

	


