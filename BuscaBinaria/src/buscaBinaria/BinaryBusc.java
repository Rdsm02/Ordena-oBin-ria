package buscaBinaria;

import java.util.Scanner;

public class BinaryBusc {
	
	static int vet[];
	
	public static void main(String[] args) {		
		
		vet = new int[10];
		
		for(int i = 0; i < 10; i++){
			
//			show.nextInt();
			vet[i] = i;
			
			System.out.println("vetor ["+ i + "] =" + (i + 1));
			
			
		}
		Scanner in = new Scanner(System.in);
		int opcao = in.nextInt();
		encontrou(0, 10, opcao);
		
	}
	
	public static boolean encontrou(int inicio, int fim, int chavebusca){
		
		
		int meio = 0;
		meio = ((inicio + meio)/2);
		
		if(inicio > fim){
			return false;
			
		}else if (fim < inicio){
			return false;
			
		}else if(vet[meio] == chavebusca){
			
			return true;
			
		}else if(chavebusca > vet[meio]){
			
			return encontrou(vet[meio+1], fim, chavebusca);
					
		}else if(chavebusca < vet[meio]){
			
			return encontrou(inicio, meio-1,chavebusca);
		}			
			
		return true;
}
}
