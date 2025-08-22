package bms.run;

import bms.service.BookService;

import java.util.Scanner;

public class Application {

    private static final BookService bs = new BookService();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("======== 도서 관리 시스템 ========");
            System.out.println("1. 모든 도서 정보 조회");
            System.out.println("2. 도서 찾기");
            System.out.println("3. 도서 추가");
            System.out.println("4. 도서 정보 수정");
            System.out.println("5. 도서 처분");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택하세요.: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: bs.selectAllBooks(); break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 9:
                    System.out.println("프로그램을 종료합니다. 이용해 주셔서 감사합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 메뉴를 선택해주세요");
            }

        }

    }
}
