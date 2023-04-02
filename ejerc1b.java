package class4java;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ejerc1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				        
				        Scanner sc = new Scanner(System.in);
				        int numero1=0;
				        int numero2=0;
				        int numero3=0;
				        int decision=0;
				        
				        System.out.println("Ingrese primer numero: ");
				        numero1=sc.nextInt();
				        System.out.println("Ingrese segundo numero: ");
				        numero2=sc.nextInt();
				        System.out.println("Ingrese tercer numero: ");
				        numero3=sc.nextInt();
				        
				        System.out.println("\nSeleccione orden de los numeros: ");
				        System.out.println("1. Ascendente");
				        System.out.println("2. Decreciente");
				        System.out.print("Decision: ");
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
				    
				        System.out.println("Numeros Ordenados:");
				        for(int i=0; i<array.length; i++){
				            System.out.println(array[i]);
				        }
				    }
			}





	


