import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько было белок?: ");
        int n = scanner.nextInt();
        System.out.println("Сколько орехов они нашли?: ");
        int k = scanner.nextInt();
        int result = k / n;
        System.out.println("Каждой белке по "+result+" орехов");
    }
}