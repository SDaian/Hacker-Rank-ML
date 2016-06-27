
import java.util.ArrayList;

import java.util.Collections;


public class Solution {

	
	public static void main(String[] args) {
		
		//Por comodidad ya se cargan directamente los arrays pero descomentando este codigo se pueden cargar desde teclado
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				{
					int a = sc.nextInt();
					arr[i][j]=a;
				}
		}
		int m = sc.nextInt();
		int [][] array2 = new int [m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				{
					int a = sc.nextInt();
					array2[i][j]=a;
				}
		}*/
		
		//Arreglo de enteros de nxn; En este caso n = 4.
		int n = 4;
		int arr[][] = { { 1, 3, 2, 4 }, { 8, 1, 2, 9 }, { 1, 1, 2, 2 },
	            { 7, 5, 3, 6 } };
		
		//Numero de consultas; En este caso m = 3;
		int m = 3;
		
		//Coordenadas de consultas en formato de arreglo
		int array2[][] = { { 1, 1, 2, 2 }, { 1, 2, 3, 4 }, { 4, 4, 4, 4 } };
		
		
		System.out.println("Sample input");
		System.out.println(n);
		
		//Se imprimen ambos arreglos
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				{
					System.out.print(arr[i][j]);
					System.out.print(" ");
				}
			System.out.println();
		}
		System.out.println(m);
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				{
					System.out.print(array2[i][j] );
					System.out.print(" ");
				}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Sample output");
		ArrayList<Integer> numbers = null;
		
		//En este bloque FOR se ven las coordenadas de las consultas, y se realiza la consulta en el arreglo principal agregando
		//los numeros correspondientes a una lista que sera ordenada de menor a mayor.
		for (int x = 0; x < array2.length; x++) {
			numbers = new ArrayList<Integer>();
		    for(int i=array2[x][0]-1;i<array2[x][2];i++){
				for(int j=array2[x][1]-1;j<array2[x][3];j++)
					{
						numbers.add(arr[i][j]);
					}
			}
		    
		    //Se ordena la lista con los numeros de menor a mayor
		    Collections.sort(numbers);
		    
		    //Se verifica cual es el "median number" y se lo imprime
			int middle = numbers.size()/2;
			 
	        if (numbers.size() % 2 == 1) {
	            System.out.println(numbers.get(middle));
	        } else {
	           System.out.println( (numbers.get(middle-1) + numbers.get(middle)) / 2);
	        }
			
		}
		
	}
}
