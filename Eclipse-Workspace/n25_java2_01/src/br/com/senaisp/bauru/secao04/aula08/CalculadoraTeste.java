package br.com.senaisp.bauru.secao04.aula08;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		//calculado cada pessoa
		calc.calcularTotal("Pessoa 1", 10);
		calc.calcularTotal("Pessoa 2", 12);
		calc.calcularTotal("Pessoa 3", 9);
		calc.calcularTotal("Pessoa 4", 8);
		calc.calcularTotal("Pessoa 5", 7);
		calc.calcularTotal("Pessoa 6", 15);
		calc.calcularTotal("Pessoa 7", 11);
		calc.calcularTotal("Pessoa 8",30);
		//mostrando o total da mes
		System.out.println("Total da mesa: " + calc.getGrandeTotal());
		//dividindoa conta entre o 6 participantes 
		System.out.println("A divisao para a 6 pagantes ficou em : " + calc.dividirValor(6));
		
		

	}

}
