import java.util.Scanner;
class mangotree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int treeNumber = scanner.nextInt();
        scanner.close();

        if (treeNumber <= columns || treeNumber % columns == 1 || treeNumber % columns == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}