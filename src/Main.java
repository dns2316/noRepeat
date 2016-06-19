import java.util.Scanner;

/**
 * Created by dns on 19.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        int length = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++){
            if (word[i] == word[i + 1]){
                length=+1;
            }
            if (word[i] != word[i - 1]){
                String a =+ word[i];
                if (length > 1){
                    a = String.valueOf(+length);
                }
            }
        }
    }
}
