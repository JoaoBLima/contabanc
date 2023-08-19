package Entidades;

import java.util.Scanner;

public class Contabanc {
	private int numconta;
	private String nome;
	private double saldo;
	private String inicio;
	private String s1 = "S";
	
	
	public Contabanc(int numconta, String nome) {
		
		this.numconta = numconta;
		this.nome = nome;
	}
	
	
	
	



	public String getInicio() {
		return inicio;
	}







	public void setInicio(String inicio) {
		this.inicio = inicio;
	}







	public int getNumconta() {
		return numconta;
	}
	public void setNumconta(int numconta) {
		this.numconta = numconta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void Final() {
		System.out.println("o numero da conta : " +this.getNumconta());
		System.out.println("nome titular: " +this.getNome());
		System.out.println( "saldo : " +this.getSaldo());
	}
	public void depositar(int V) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("quanto deseja adicionar? ");
		 V = sc.nextInt();
		 this.setSaldo(this.getSaldo() + V);
		 System.out.println("dados atualizados ");
		 System.out.println( "saldo : " +this.getSaldo());
		 
		 
	}
	public void abrirconta(String inicio) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o numero da conta");
		numconta = sc.nextInt();
		System.out.println("Informe o nome");
		nome = sc.next();
		System.out.println("havera um deposito?");
		inicio = sc.next();
		if(inicio.equals(s1))  {
			
     	System.out.println("quanto quer depositar?");
	   saldo = sc.nextDouble();
	
			
		}
		
			
		
		
			
		}
		
		
	}
	
	


