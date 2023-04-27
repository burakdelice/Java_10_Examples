package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question6 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	System.out.println("Bir yarıçap giriniz: ");
	double yaricap = scanner.nextFloat();
	double daireAlan = (Math.PI *yaricap*yaricap);
	double daireCevre= (2 * Math.PI * yaricap);
			
	System.out.println("Bu dairenin alanı = " +daireAlan);
	System.out.println("Bu dairenin çevresi = "+ daireCevre);
}
}
