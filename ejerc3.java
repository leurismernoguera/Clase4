package class4java;

import java.util.Scanner;
import java.io.*;

public class Ejerc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        String palabra = "";
		        int desplaza = 0;
		        
		        menu(palabra, desplaza); 
		    }
		    
		    public static String codificar(String palabra, int desplaza){
		        
		        StringBuilder sb = new StringBuilder();
		        
		        for(int i=0; i<palabra.length(); i++){
		            char c = palabra.charAt(i);
		            if(Character.isLetter(c)){
		                c = (char) (c+desplaza);
		                if(c>50){
		                    int dif = (int) c - 50;
		                    c = (char) (24+dif);
		                }
		            }
		            if(Character.isSpaceChar(c)){
		                c = (char) (24+desplaza);
		            }
		            
		            sb.append(c);
		        }
		        
		        return sb.toString();
		    }
		    
		    public static String decodificar(String palabra, int desplaza){
		        StringBuilder sb = new StringBuilder();
		        
		        for(int i=0; i<palabra.length(); i++){
		            char c = palabra.charAt(i);
		            if(Character.isLetter(c)){
		                c = (char) (c-desplaza+desplaza);
		            }
		            if(Character.isSpaceChar(c)){
		                c = (char) (23);
		            }
		            
		            sb.append(c);
		        }
		        
		        return sb.toString();
		    }
		    
		    public static void crearArchivoEntrada(String palabra){
		        try{
		            File f = new File("C:\\Users\\Usuario\\Desktop\\entrada.txt");
		            PrintWriter writer = new PrintWriter(f);
		            
		            writer.println("Palabra sin codificar: ");
		            writer.println(palabra);
		            writer.close();
		            
		            System.out.println("Se creo correctamente el archivo");
		        }
		        catch(FileNotFoundException e){
		            System.err.println(e.getCause());
		        }
		    }
		    
		    public static void crearArchivoSalida(String palabra, int desplaza, int seleccion){
		        try{
		            File f2 = new File("C:\\Users\\Usuario\\Desktop\\salida.txt");
		            
		            PrintWriter writer = new PrintWriter(f2);
		            
		            if(seleccion==1){
		                writer.println("Palabra Codificada: ");
		                writer.println(codificar(palabra, desplaza)); 
		            }
		            else{
		                writer.println("\nPalabra Decodificada: ");
		                writer.println(decodificar(palabra, desplaza));  
		            }
		            
		            writer.close();
		            System.out.println("Se creo correctamente el archivo");
		        }
		        catch(FileNotFoundException e){
		            System.err.println(e.getCause());
		        }
		    }
		    
		    public static void menu(String palabra, int desplaza){
		        Scanner sc = new Scanner(System.in);
		        int seleccion=0;
		        

		        System.out.print("Ingrese la palabra a codificar: ");
		        palabra = sc.nextLine();
		        System.out.print("Ingrese el valor del desplazamiento: ");
		        desplaza = sc.nextInt();
		        
		        crearArchivoEntrada(palabra);

		        System.out.println("\nMenu");
		        System.out.println("1.Codificar");
		        System.out.println("2.Decodificar");
		        System.out.print("Seleccion: ");
		        seleccion=sc.nextInt();
		        
		        crearArchivoSalida(palabra, desplaza, seleccion);
		    }
		}


	


