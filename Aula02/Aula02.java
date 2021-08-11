package Aula02;

import java.util.*;

public class Aula02 {

	public static void main(String[] args) {
		//System.out.println("Fatorial recursivo de 5: " + fatorialRec(5) );
		//System.out.println("Fatorial recursivo de 4: " + fatorialIte(4) );
		//System.out.println("Fibonacci recursivo de 20: " + fibonacciRec(20) );
		//System.out.println("Fibonacci iterativo de 20: " + fibonacciIte(20) );
	
		Pilha pilha = new Pilha();
		pilha.adicionar("Coca-cola");
		pilha.adicionar("Pepsi");
		pilha.adicionar("Fanta");
		pilha.imprimir();
		pilha.adicionar("Teen");
		pilha.imprimir();
		pilha.remover();
		pilha.remover();
		pilha.adicionar("Dolly");
		pilha.imprimir();
		pilha.remover();
		pilha.remover();
		pilha.remover();
	}


	public static long fibonacciRec(int n ){
		if( n < 2 )
			return n;
		return fibonacciRec(n-1) + fibonacciRec(n-2);
	}

	public static long fibonacciIte(int n ){
		int fib = 0;
		int ant = 0;
		for( int i = 1; i<= n; i++){
			if( i == 1){
				fib = 1;
				ant = 0;
			}else{
				fib += ant;
				ant = fib - ant;
			}
		}
		return fib;	
	}	





	// Fatorial Recursivo
	public static int fatorialRec( int n ){
		if ( n == 1) 
			return 1;
		return n * fatorialRec(n-1);			
	}

	// Fatorial Iteratico
	public static int fatorialIte( int n ){
		int fat = 1;
		for( int i = 1; i<= n; i++){
			fat = fat * i;
		}
		return fat;			
	}	

	
    
}