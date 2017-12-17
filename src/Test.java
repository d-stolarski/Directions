import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Dostępne kierunki:");
        for(Direction e : Direction.values()){
            System.out.println(e);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz kierunek geograficzny z dostępnych:");
        Direction dir = Direction.valueOf(scan.nextLine());
        System.out.println(dir.showDirInfo());

        System.out.println("Podaj wartość od 0 do 3 dla odpowiedniego kierunku:");
        Direction direction = Direction.convert(scan.nextInt());
        System.out.println("Wybrałeś " + direction.name());

        scan.close();
    }
}
