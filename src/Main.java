import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bet bet = new Bet();
        int var;
        System.out.println("Введите ставку \n");
        var = Integer.parseInt(scanner.nextLine());
        System.out.println("Ставка принята! \n");
    }
}
