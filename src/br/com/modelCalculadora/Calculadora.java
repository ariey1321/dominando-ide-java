package br.com.modelCalculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite o primeiro valor: ");
		a= scan.nextInt();
		System.out.println("Digite o segundo  valor: ");
		b= scan.nextInt();
		
		
		 int soma = soma(a,b);
		 int subtracao = subtracao (a,b);
	      int divisao = divisao(a,b);
	      int multiplicaçao = multiplicaçao(a,b);
	
	      System.out.println("soma"+soma);
	      System.out.println( "sub"+subtracao);
	      System.out.println("div"+divisao);
	      System.out.println("mult"+multiplicaçao);
	}
	public static int soma(int a, int b) {
		return a+b;
	}
    public static int subtracao(int a, int b) {
			return a-b;
    }
    public static int divisao(int a, int b) {
    	return a/b;
    }
    	
    public static int multiplicaçao(int a, int b) {
    		return a*b;
    
    }
    
}