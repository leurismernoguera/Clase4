package class4java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejerc1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			        
				        Scanner sc = new Scanner(System.in);
				        int numero1=5;
				        int numero2=8;
				        int numero3=3;
				        int decision=0;
				        
				        if(numero1!=0||numero2!=0||numero3!=0){
				        	 System.out.println("Ingrese primer numero: ");
						        numero1=sc.nextInt();
						        System.out.println("Ingrese segundo numero: ");
						        numero2=sc.nextInt();
						        System.out.println("Ingrese tercer numero: ");
						        numero3=sc.nextInt();
				            
				            menu(decision, numero1, numero2, numero3);
				        }
				        else{
				            menu(decision, numero1, numero2, numero3);
				        }
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
				    
				    public static void menu(int decision, int numero1, int numero2, int numero3){
				        Scanner sc2 = new Scanner(System.in);
				        
				        System.out.println("\neleccione orden de los numeros: ");
				        System.out.println("1. Ascendente");
				        System.out.println("2. Decreciente");
				        System.out.print("Opcion: ");
				        decision=sc2.nextInt();
				        
				        ordenar(numero1, numero2, numero3, decision);
				        mostrar(ordenar(numero1, numero2, numero3, decision));
				    }
				}

		
	


