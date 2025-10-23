package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("고객 ID를 입력하세요: ");
        String id = scanner.next();
        System.out.print("상품 코드를 입력하세요: ");
        String code = scanner.next();
        scanner.nextLine();
        System.out.print("상품명을 입력하세요: ");
        String goods = scanner.nextLine();
        System.out.print("수량을 입력하세요: ");
        int quantity = scanner.nextInt();
        System.out.print("단가를 입력하세요: ");
        int price = scanner.nextInt();
        System.out.print("우편번호를 입력하세요: ");
        int zipcode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("배송 주소를 입력하세요: ");
        String address = scanner.nextLine();


        int TotalPrice = price * quantity;
        int deliveryFee = TotalPrice >= 30000 ? 0 : 3000;
        int FinalFee = TotalPrice + deliveryFee;
        String DeliveryPrint = TotalPrice >= 30000 ? "무료 (3만원 이상구매)" : "3000원";

        System.out.println("=== 주문확인서 ===");
        System.out.println("고객 ID: " + id);
        System.out.println("상품 정보:");
        System.out.println("   - 상품코드: " + code);
        System.out.println("   - 상품명: " + goods);
        System.out.println (String.format("   - 단가: %,d원" , price , "x %d개 =",  quantity , "%,d원", TotalPrice));
        System.out.println("배송 정보: ");
        System.out.println("   - 우편번호: " + zipcode);
        System.out.println("   - 주소: " + address);
        System.out.println("   - 배송비: " + DeliveryPrint);
        System.out.println (String.format("총 결제 금액: %,d", FinalFee));



    }
}
