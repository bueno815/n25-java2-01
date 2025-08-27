package br.com.senaisp.bauru.gizelle.classes;

import java.sql.SQLException;

public class Produto {
	private int id;
	private String descricao;
	private double saldo;
	private double preco;
	private ConectorBancoDados conn;
	//constructor
	public Produto(String descricao, double saldo, double preco) throws SQLException {
		this.descricao = descricao;
		this.saldo = saldo;
		this.preco = preco;
		conn = ConectorBancoDados.getInstancia();
	}

}
