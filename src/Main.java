import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("Input.txt");
        Scanner s = new Scanner(f);
        Lock santa = new Lock();
        String total;
        String dir;
        int num;
        int count = 0;
        int start;
        int zero = 0;
        while (s.hasNext()) {
            count++;
            start = santa.getCurrentNum();
            total = s.nextLine();
            total = total.substring(0, 1) + " " + total.substring(1);
            dir = total.substring(0, 1);
            num = Integer.parseInt(total.substring(2));
            santa.rotate2(dir, num);
            zero = santa.getZeroCount();
            System.out.println("Current Number: " + santa.getCurrentNum() + " || Line Count: " + count + " || Amount Added: " + num + " || Direction: " + dir + " || Before: " + start + " || Amount of Zeros: " + zero);
        }

        System.out.println(zero);
    }
}
