package view;

import java.util.Random;

import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {
		int l = 3;
		int col = 5;
		int mat[][] = new int [l][col];
		
		Random gerador = new Random();
		for (int i=0;i<l;i++) {
			for(int j=0;j<col;j++){
				mat[i][j] = gerador.nextInt(100);
			}
		}
		
		for(int k=0;k<l;k++) {
		Thread s =  new ThreadMatriz(mat[k][0],mat[k][1],mat[k][2],mat[k][3],mat[k][4]);
		s.start();
		}
	}

}
