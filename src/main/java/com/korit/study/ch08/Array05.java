package com.korit.study.ch08;

import java.util.Scanner;

public class Array05 {
    public static String[] products = new String[]{"아이폰5", "아이폰6", "아이폰7", "아이폰8", "아이폰9", "아이폰10", "아이폰11"};
    public static int[] prices = new int[]{500000, 600000, 700000, 800000, 900000, 1000000, 1100000};

    public static void main(String[] args) {
        System.out.println("[ 물건 관리 시스템 ]");
        showMainMenuView();
    }

    public static void showMainMenuView() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. 물건 조회");
            System.out.println("2. 물건 추가");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int selectedNumber = scanner.nextInt();
            scanner.nextLine();

            if (selectedNumber == 0) {
                isExit = true;
            } else if (selectedNumber == 1) {
                showProductList();
            } else if (selectedNumber == 2) {
                adl();
            }
        }
    }
    public static void showProductList() {
        Scanner scanner = new Scanner(System.in);
        int size = 3;
        while (true) {
            System.out.println("물건 조회");
            System.out.println("뒤로가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));
            int selectedPage = scanner.nextInt();
            scanner.nextLine();


            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지를 찾을 수 없습니다.");
            } else {
                String[] products0fPagination = pagination(selectedPage, size);
                int startIndex = (selectedPage - 1) * size;
                for (int i = 0; i < products0fPagination.length; i++) {
                    System.out.printf("%d. %s - %,d원\n", i + 1, products0fPagination[i], prices[startIndex + i]);
                }
                System.out.println();
            }
        }
    }

    public static int getLastPage(int size) {
        return products.length % size == 0 ? products.length / size : products.length / size + 1;
    }

    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size;
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && products.length % size != 0 ? products.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = products[i];
        }
        return paginationArray;


    }
    public static void adl() {
        Scanner scanner = new Scanner(System.in);
        String newProduct = null;
        while (true) {
            System.out.println("[물건 추가 기능]");
            System.out.print("물건 입력: ");
            newProduct = scanner.nextLine();

            if (findByProduct(newProduct) == null) {
                break;
            }
            System.out.println("이미 존재하는 물건입니다. 다시 입력하세요.");
        }

        add(newProduct);
        System.out.println("<< 물건 추가 완료. >>");
    }
    public static String findByProduct(String product) {
        for (String n : products) {
            if (n.equals(product)) {
                return n;
            }
        }
        return null;
    }
    public static void add(String product) {
        String[] newArray = new String[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newArray[i] = products[i];
        }
        newArray[newArray.length - 1] = product;
        products = newArray;
    }
}
