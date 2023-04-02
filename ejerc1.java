package class4java;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Ejer1a {

	public static void main(String[] args) {
		        
		        Scanner sc = new Scanner(System.in);
		        int numero1=10;
		        int numero2=8;
		        int numero3=3;
		        int decision=0; 
		        
		        System.out.println("Vector:");
		        System.out.println(numero1+" "+numero2+" "+numero3);
		        
		        System.out.println("\neleccione orden de los numeros: ");
		        System.out.println("1. Ascendente");
		        System.out.println("2. Decreciente");
		        System.out.print("Opcion: ");
		        decision=sc.nextInt();
		        
		        ordenar(numero1, numero2, numero3, decision);
		        mostrar(ordenar(numero1, numero2, numero3, decision));
		    }
		    
		    public static int[]ordenar(int numero1, int numero2, int numero3, int decision){
		    
		        int array[] = new int[]{numero1, numero2, numero3};
		        
		        if(decision==1){
		            Arrays.sort(array);
		            
		            return array;
		        }
		        else{
		            Integer array1[] = new Integer[]{numero1, numero2, numero3};
		            Arrays.sort(array1, Collections.reverseOrder());
		            
		            for(int i=0; i<3; i++){
		                array[i] = array1[i];
		            }
		            
		            return array;
		        }
		    }
		    
		    public static void mostrar(int array[]){
		    
		        System.out.println("Valores Ordenados:");
		        for(int i=0; i<array.length; i++){
		            System.out.println(array[i]);
		        }
		    }
	}

