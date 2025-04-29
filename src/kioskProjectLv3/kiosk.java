package kioskProjectLv3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kiosk {

    //속성
    private List<MenuItem> menuItems;
    private Scanner scanner;

    //생성자
    public kiosk() {
        menuItems = new ArrayList<>();
        scanner = new Scanner(System.in);

        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    // 기능(메서드)
    public void start() {
        //1,2,3,4 순서대로 출력되게 한다.
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for(int i = 0; i <menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println(item.getName() + "  |  " + item.getPrice() + "  |  " + item.getExplain());
            }
            System.out.println("0. 종료");

            System.out.print("선택 번호: ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("프로그램 종료");
                return;
            } else if (choice >= 1 && choice <= menuItems.size()) {
                MenuItem select = menuItems.get(choice - 1);
                System.out.println(select.getName() + "를 선택하셨습니다.");
            } else {
                System.out.println("잘못된 선택입니다. 올바른 번호를 입력해주세요.");
            }
        }
    }
}

