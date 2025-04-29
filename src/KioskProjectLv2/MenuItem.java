package KioskProjectLv2;

public class MenuItem {

    //속성
    private String name;
    private double price;
    private String explain;

    //생성자
    //class와 이름이 같다. 반환데이터 타입이 존재하지 않는다. 여러개 존재랄 수 있다.
    public MenuItem(String name, double price, String explain) {
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    //기능

    //세터-필요없음
    //게터
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getExplain() {
        return explain;
    }
}
