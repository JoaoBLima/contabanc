package Aplicacao;

import java.util.Scanner;

import Entidades.Contabanc;

public class Programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int V = 0;
		Contabanc c = new Contabanc(0, null);
		c.abrirconta(null);
        c.Final();
        c.depositar(V);
	}

}
