package br.com.senaisp.bauru.secao03.aula05;

public class Casting01 {

	public static void main(String[] args) {
		//Isso da erro porque o byte vai de -128 á 127
		//byte bVlr = 128;
		short sVlr = 128;
		//Mostrando o short convertido para byte
		System.out.println("Isso vai dar perda na conversão: " + ( (byte)sVlr));
		byte bVlr = 127;
		bVlr++;//iria para 128, mas o limite do byte é -128 á 127
		System.out.println("Isso vai extrapolar o limite do byte: " + bVlr);
		
		
	}

}
