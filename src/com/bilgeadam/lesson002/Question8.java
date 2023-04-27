package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vize noutunuzu girin:");
		int vize=scanner.nextInt();
		System.out.println("Final noutunuzu girin:");
		int finalnotu = scanner.nextInt();
		scanner.nextLine();
		System.out.println("İsminizi girin:");
		String ogrenciIsmi=scanner.nextLine();
		float ort= vize*0.4f+finalnotu*0.6f;
		boolean gectikaldi = (ort>60);
		System.out.print(ogrenciIsmi + " adlı öğrenci ");
		System.out.println(gectikaldi? "geçti." : "kaldı.");
	}

}
