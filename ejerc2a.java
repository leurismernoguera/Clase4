package class4java;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejerc2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        try{
		            Scanner lector = new Scanner(new FileInputStream("C:\\Users\\Usuario\\Desktop\\numeros.txt"));
		            Scanner sc = new Scanner(System.in);
		            int numero=0;
		            int suma=0, multiplica=1;
		            int seleccion=0, i=0;
		            
		            System.out.println("Los numeros del archivo son: ");
		            
		            while(lector.hasNext()){
		                numero=lector.nextInt();
		                System.out.print(numero+" ");
		                i++;
		                suma+=numero;
		                multiplica=multiplica*numero;
		            }
		            
		            System.out.println("\n1. Sumar los numeros");
		            System.out.println("2. Multiplicar los numeros");
		            System.out.print("Opcion: ");
		            seleccion = sc.nextInt();
		            
		            while(lector.hasNext()){ 
		                   
		            }
		            
		            if(seleccion==1){
		                System.out.println("\nSuma de los numeros: "+suma);
		            }
		            else{
		                System.out.println("\nMultiplicacion de los numeros: "+multiplica);
		            }
		        }
		        catch(FileNotFoundException e){
		            System.err.println(e.getCause());
		        }
		    } 
		}

	

