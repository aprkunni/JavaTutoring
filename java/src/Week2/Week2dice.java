import java.util.Scanner;

public class Week2dice {
    public static void main(String[] args){
        int dice1, dice2 ,dice3;
        Scanner inputDice = new Scanner(System.in);
        dice1 = inputDice.nextInt();
        dice2 = inputDice.nextInt();
        dice3 = inputDice.nextInt();

        if ((dice1 == dice2)&&(dice2 ==dice3)&&(dice1 == dice3)) {
            System.out.println(10000+(dice1*1000));
        }
        else if(dice1 == dice2){
            System.out.println(10000+(dice1*100));
        }
        else if (dice2 == dice3) {
            System.out.println(10000 + (dice2 * 100));
        }
        else if(dice1 == dice3){
            System.out.println(10000+(dice1*100));
        }
        else{
            int max;
            max = Math.max(dice1,dice2);
            max = Math.max(max,dice3);
            System.out.println(max*100);
            }


        }



    }
