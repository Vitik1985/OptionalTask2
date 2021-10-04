import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class OptionalTask2 {
    public static void main(String[] args) throws IOException { //Вывести числа в порядке возрастания (убывания) значений их длины.
        String command;
        boolean i = true;
        ArrayList<Integer> array_number = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("Enter the number or stop: ");
        while (i) {
            command = br.readLine();
            if (!command.equals("stop")) {
                System.out.print("Enter the number or stop: ");
                array_number.add(Integer.parseInt(command));
            } else {
                i = false;
            }
        }
        Collections.sort(array_number);
        for (int array : array_number) {
            System.out.println(array);
        }
    }

}
