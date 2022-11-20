package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linha = 4;
		int coluna = 4;
		int[][] matrizA = new int[linha][coluna];
		
		int linha2 = 4;
		int coluna2 = 4;
		int[][] matrizB = new int[linha2][coluna2];
		
		int opcao = 0;
		do {
			System.out.println("\n\tCalculadora Matriz\t");
			System.out.println("");
			
			System.out.println("(1) - Para calcular a Soma das Matrizes");
			System.out.println("(2) - Para calcular a Subtração das Matrizes");
			System.out.println("(3) - Para calcular a Multiplicação das Matrizes");
			System.out.println("(4) - Para calcular a Matriz Identidade");
			System.out.println("(5) - Para Sair");
			
			System.out.println("");
			System.out.print("Digite a opção de calculo que deseja fazer: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
			
				//SOMA DAS MATRIZES
				case 1:
					int[][] soma = new int[linha][coluna];
					System.out.println("\nVocê escolheu Somar!\n");
					for (int i = 0; i < linha; i++) {
						for (int j = 0; j < coluna; j++) {
							System.out.print("Digite um valor da matriz A: ");
							matrizA[i][j] = sc.nextInt();
						}
					}
					
					System.out.println("");
					for (int i = 0; i < linha2; i++) {
						for (int j = 0; j < coluna2; j++) {
							System.out.print("Digite um valor da matriz B: ");
							matrizB[i][j] = sc.nextInt();
						}
					}
					
					System.out.println("\nMatriz A\n");
					for(int[] n: matrizA) {
						for(int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("\n");
					}
					
					System.out.println("\nMatriz B\n");
					for(int[] n: matrizB) {
						for(int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("\n");
					}
					
					for(int l = 0; l < linha; l++) {
						for(int c = 0; c < coluna; c++) {
							soma [l][c] = matrizA[l][c] + matrizB[l][c];
						}
					}
					
					System.out.println("\nMatriz Resultado\n");
					for(int[] n: soma) {
						for(int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("%n");
					}
			        break;
			        
			    //SUBTRAÇÃO DAS MATRIZES    
				case 2:
					int[][] sub = new int[linha][coluna];
					System.out.println("\nVocê escolheu Subtrair!\n");
					for (int i = 0; i < linha; i++) {
						for (int j = 0; j < coluna; j++) {
							System.out.print("Digite um valor da matriz A: ");
							matrizA[i][j] = sc.nextInt();
						}
					}
					
					System.out.println("");
					for (int i = 0; i < linha2; i++) {
						for (int j = 0; j < coluna2; j++) {
							System.out.print("Digite um valor da matriz B: ");
							matrizB[i][j] = sc.nextInt();
						}
					}
					
					System.out.println("\nMatriz A\n");
					for(int[] n: matrizA) {
						for(int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("\n");
					}
					
					System.out.println("\nMatriz B\n");
					for(int[] n: matrizB) {
						for(int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("\n");
					}
					
					for(int l = 0; l < linha; l++) {
						for(int c = 0; c < coluna; c++) {
							sub [l][c] = matrizA[l][c] - matrizB[l][c];
						}
					}
					
					System.out.println("\nMatriz Resultado\n");
					for(int[] n: sub) {
						for(int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("%n");
					}
			        break;
			     
			    //MULTIPLICAÇÃO DAS MATRIZES    
				case 3:
					int[][] mult = new int[linha][coluna2];
					System.out.println("\nVocê escolheu Multiplicar!\n");
					for (int i = 0; i < linha; i++) {
						for (int j = 0; j < coluna; j++) {
							System.out.print("Digite um valor da matriz A: ");
							matrizA[i][j] = sc.nextInt();
						}
					}
					
					System.out.println("");
					for (int i = 0; i < linha2; i++) {
						for (int j = 0; j < coluna2; j++) {
							System.out.print("Digite um valor da matriz B: ");
							matrizB[i][j] = sc.nextInt();
						}
					}
					
					System.out.println("\nMatriz A\n");
					for (int[] n: matrizA) {
						for (int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("\n");
					}
					
					System.out.println("\nMatriz B\n");
					for (int[] n: matrizB) {
						for (int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("\n");
					}
					
					for (int i = 0; i < linha; i++) {
						for (int j = 0; j < coluna2; j++) {
							for (int k = 0; k < linha2; k++) {
								mult[i][j] += matrizA[i][k] * matrizB[k][j];
							}
						}
					}
						
					System.out.println("\nMatriz Resultado\n");
					for (int[] n: mult) {
						for (int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("\n");
					}
			        break;
			        
			    //MATRIZ IDENTIDADE
				case 4:
					System.out.println("\nVocê escolheu Matriz Identidade!");
					int[][] identidade = new int[4][4]; 
					for (int lin = 0; lin < identidade.length; lin++) { 
						for (int col = 0; col < identidade[lin].length; col++) { 
							identidade[lin][col] = lin == col ? 1 : 0; 
						} 
					}
					
					System.out.println("\nMatriz Resultado\n");
					for (int[] n: identidade) {
						for (int v: n) {
							System.out.printf("%3d | ", v);
						}
						System.out.printf("\n");
					}
					break;
					
				case 5:
					System.out.println("\nVocê escolheu Sair!\n");
					break;
			        
				default:
					System.out.println("\nEscolha uma opção valida!\n");
					break;
			}
			
		}while(opcao != 5);
		
		sc.close();
	}

}
