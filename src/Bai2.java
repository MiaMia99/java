import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int so = input.nextInt();//22
        String chuoi ="";
        int chuc = so/10;
        int Donvi = so % 10;
        chuoi += laychuoi(chuc) + "mươi";
        //String chuoi = laychuoi(so);
        System.out.println(chuoi);
    }
    public static String laychuoi(int so){
        switch (so){
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            default:
                return "";

        }
    }
}
