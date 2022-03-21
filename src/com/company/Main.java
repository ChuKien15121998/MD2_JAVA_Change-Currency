package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao loai tien muon chuyen (USD or VND): ");
        String input = scanner.next();

        switch (input) {
            case "VND":
                System.out.println("Nhap vao so tien muon chuyen: ");
                double VND = scanner.nextDouble();
                double USD = VND / 23000;
                System.out.println("USD: " + USD);
                break;
            case "USD":
                System.out.println("Nhap vao so  tien muon chuyen: ");
                double Dola = scanner.nextDouble();
                double VietNam = Dola * 23000;
                System.out.println("VND: " + VietNam);
                break;
        }
    }
}
