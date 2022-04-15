import java.util.Random;
import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        String handType;
        int choice;
        String rule = "";
        Scanner scanner = new Scanner(System.in);


        System.out.println("가위바위보 게임 : ");
        handType = scanner.next();

        Random rand = new Random();
        choice = rand.nextInt(3);

        switch (choice) {
            case 0:
                rule = "가위";
                break;
            case 1:
                rule = "바위";
                break;
            case 2:
                rule = "보";
                break;


        }

        if (handType.equals("가위")) {
            System.out.println("플레이어는 " + handType + " 컴퓨터는 " + rule + "를 냈습니다.");
            switch (rule) {
                case "가위":
                    System.out.println("비겼습니다.");
                    break;
                case "바위":
                    System.out.println("졌습니다.");
                    break;
                case "보":
                    System.out.println("이겼습니다.");
                    break;


            }
        }
        else if (handType.equals("바위")) {
            System.out.println("플레이어는 " + handType + " 컴퓨터는 " + rule + "를 냈습니다.");
            switch (rule) {
                case "가위":
                    System.out.println("이겼습니다.");
                    break;
                case "바위":
                    System.out.println("비겼습니다.");
                    break;
                case "보":
                    System.out.println("졌습니다.");
                    break;


            }

        }
        else if (handType.equals("보")) {
            System.out.println("플레이어는 " + handType + " 컴퓨터는 " + rule + "를 냈습니다.");
            switch (rule) {
                case "가위":
                    System.out.println("졌습니다.");
                    break;
                case "바위":
                    System.out.println("이겼습니다.");
                    break;
                case "보":
                    System.out.println("비겼습니다.");
                    break;


            }
        }
        else {
            System.out.println("가위 바위 보 중 하나");
        }
    }
}

