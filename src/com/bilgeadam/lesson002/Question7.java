package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Birinci sayıyı girin: ");
		int sayi1 = scanner.nextInt();
		System.out.println("İkinci sayıyı girin: ");
		int sayi2 = scanner.nextInt();
		int toplam= sayi1+sayi2;
		int a = (toplam)%2;		
		boolean sonuc = a == 0;
		System.out.println(sonuc);
		
}
}