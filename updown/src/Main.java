import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        float answer = (float) Math.random() * 100;
        answer = (float) Math.floor(answer);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (input.equals(String.valueOf(answer)) != true) {
            if (Double.valueOf(input).doubleValue() < answer) {
                System.out.println("up");
            } else if (Double.valueOf(input).doubleValue() > answer) {
                System.out.println("down");
            } else if (Double.valueOf(input).doubleValue() == answer) {
                System.out.println(Double.valueOf(input).doubleValue()+ "정답!");
                break;
            }
            input = scanner.nextLine();
        }
    }
}
