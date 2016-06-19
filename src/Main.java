import java.util.Scanner;

/**
 * Created by dns on 19.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        int length = 1;
        String output = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++){
            if (word.charAt(i) == word.charAt(i + 1)){
                length=+1;
            }
            if (word.charAt(i) != word.charAt(i + 1)){
                output = String.valueOf(+ word.charAt(i));
                if (length > 1){
                    output = String.valueOf(+length);
                }
            }
        }
        System.out.print(output);
    }
}
