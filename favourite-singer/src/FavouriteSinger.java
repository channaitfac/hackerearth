import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FavouriteSinger {

    public static void main(String[] args) throws Exception {

        // ----- Get Input values -----
        // [1] BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputOneSt = br.readLine();                               // Reading input from STDIN
        System.out.println("BufferedReader Input One: " + inputOneSt);    // Writing output to STDOUT
        int inputOneInt = Integer.parseInt(inputOneSt);

        // [2] Scanner
        /* Scanner scanner = new Scanner(System.in);
        String inputTwoSt = scanner.nextLine();                    // Reading input from STDIN
        System.out.println("Scanner Input Two: " + inputTwoSt);    // Writing output to STDOUT
         */
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String inputTwoSt = br.readLine();                               // Reading input from STDIN
        System.out.println("BufferedReader Input Two: " + inputTwoSt);    // Writing output to STDOUT

        // [3] Split 'Input Two' values and make the String Array
        String [] inputTwoArraySt = inputTwoSt.split(" ");
        System.out.println("Scanner Input Two String Array values:" + Arrays.toString(inputTwoArraySt));

        // ----- Proceed application logics -----
        Map<String, Integer> singerVsCount = new HashMap<>();

        int numOfFaSingers = 0;

        for (String s : inputTwoArraySt) {

            Integer count = singerVsCount.get(s);

            if (count == null) {
                singerVsCount.put(s, 1);
                continue;
            } else {
                singerVsCount.put(s, singerVsCount.get(s) + 1);
            }

            if (count >= 1) {
                numOfFaSingers++;
            }
        }

        // Number of favourite singers of Bob
        System.out.println(numOfFaSingers);
    }
}
