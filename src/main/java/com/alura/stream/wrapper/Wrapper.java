package com.alura.stream.wrapper;

public class Wrapper {
	/**
	 * ::Wrappers:: são classes de objetos que representam tipos primitivos. Existe
	 * um ::wrapper:: para cada primitivo, conforme a lista a seguir:
	 * 
	 * boolean : Boolean byte : Byte short : Short char : Character int : Integer
	 * long : Long float : Float double : Double
	 * 
	 */

	public static void main(String[] args) {

		// Objeto para primitivo
		Integer valor = Integer.valueOf(10);
		int primitivo = valor.intValue();

		// Primitivo para objeto
		Integer valor2 = Integer.valueOf(primitivo);

		/**
		 * Os ::wrappers:: de números inteiros possuem uma variação do parseXXX que
		 * recebe como segundo argumento a base a ser usada na conversão:
		 */
		
		short i1 = Short.parseShort("11",10); // 11  Decimal
		int i2 = Integer.parseInt("11",16);   // 17  HexaDecimal
		byte i3 = Byte.parseByte("11",8);     // 9   Octal
		int i4 = Integer.parseInt("11",2);    // 3   Binary
		int i5 = Integer.parseInt("A",16);    // 10  HexaDecimal
		int i6 = Integer.parseInt("FF",16);   // 255 HexaDecimal
		
		/**
		 * Além destes, as classes Long e Integer ainda possuem outros métodos para fazer a conversão direta para a base escolhida:
		 * */

		String binaryString = Integer.toBinaryString(8); //1000, binary
		String hexString = Long.toHexString(11);       // B, Hexadecimal
		String octalString = Integer.toOctalString(22);  // 26 Octal
		
	}

}
