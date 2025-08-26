package br.com.senaisp.bauru.gizelle.test;

import br.com.senaisp.bauru.gizelle.classes.ConectorBancoDados;

public class ConectorBancoDadosTest {

	public static void main(String[] args) {
		ConectorBancoDados conn =  ConectorBancoDados.getIntancia();
		System.out.println(conn.getConnStr());
		
		ConectorBancoDados conn2 = ConectorBancoDados.getIntancia();
				System.out.println(conn2.getConnStr());
		
		System.out.println(conn);
		System.out.println(conn2);
	}

}
