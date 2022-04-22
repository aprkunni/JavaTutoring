import java.util.Scanner;

public class Week2 {
    public static void  main(String[] args) {
        int nowtime;
        int nowtime2;
        int setTime1;

        Scanner startTime = new Scanner(System.in);
        nowtime = startTime.nextInt();
        nowtime2 = startTime.nextInt();
        setTime1 = startTime.nextInt();

        nowtime2 += setTime1 %60;
        nowtime += (setTime1/60) + (nowtime2 /60);

        nowtime2 %= 60;
        nowtime %= 24;

        System.out.println(nowtime + " " + nowtime2);


    }
}
