package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile

        // 반복문 While
        int distance = 65; // 전체 거리 65m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m

        System.out.println(" --- 반복문 #1 --- ");

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #2 --- ");

        // Do While 반복문
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 2;
        } while (move + height < distance);
        System.out.println("도착했습니다.");

    }
}
