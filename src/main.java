import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println();
        int b = 5;
        try(Scanner fin = new Scanner(new File("in.txt"));
            PrintStream fout = new PrintStream(new File("out.txt"))){

            while (fin.hasNextInt()){
                int a = fin.nextInt();
                System.out.println(a);
                for (int i = 0; i < 1000; i++) {
                    fout.printf("%7d %8d %9d\n", a,a*a,a*a*a);
                    a++;
                }

            }

        }catch (FileNotFoundException e){
            System.out.println("ошибка"+e);
            return;
        }

        try(Scanner fin = new Scanner(new File("in.txt"));
            PrintStream fout = new PrintStream(new File("out.txt"))){

        }catch (FileNotFoundException e){
            System.out.println("ошибка"+e);
            return;
        }

    }

}
