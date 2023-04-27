package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim = scanner.nextLine();
		System.out.println("isim= " + isim);
		int sayi1 = 10;
		int sayi2 = scanner.nextInt();
//		double sayi3 = scanner.nextDouble();
//		long sayi4 = scanner.nextLong();
//		float sayi5 = scanner.nextFloat();
		
		System.out.println("sonuc=" + (sayi1+sayi2));
		scanner.nextLine();
		System.out.println("Lütfen bir iism giriniz");
		String isim2= scanner.nextLine();
		System.out.println("isim2:"+isim2);
		isim2 = scanner.nextLine();
		System.out.println("isim2:"+isim2);
		
	}
}
