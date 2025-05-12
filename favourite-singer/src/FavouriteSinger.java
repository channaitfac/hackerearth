//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

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
        String inputTwoSt = br.readLine();                                // Reading input from STDIN
        System.out.println("BufferedReader Input Two: " + inputTwoSt);    // Writing output to STDOUT

        // [3] Split 'Input Two' values and make the String Array
        String [] inputTwoArraySt = inputTwoSt.split(" ");
        System.out.println("Scanner Input Two String Array values:" + Arrays.toString(inputTwoArraySt));

        // ----- Proceed application logics -----
        int numOfFaSingers = getNumOfFaSingers(inputTwoArraySt);
        System.out.println(numOfFaSingers);
    }

    /**
     * Count favourite singers
     * @param inputTwoArraySt Singers details
     * @return Number of favourite singers
     */
    private static int getNumOfFaSingers(String[] inputTwoArraySt) {

        int numOfFaSingers = 0;
        Set<String> favSingers = new HashSet<>();
        Map<String, Integer> singerVsCount = new HashMap<>();

        for (String singer : inputTwoArraySt) {

            int count = (singerVsCount.get(singer) != null ? (singerVsCount.get(singer) + 1): 1);
            singerVsCount.put(singer, count); // Map Singer vs their Songs count

            if(count >= 2 && !favSingers.contains(singer)) { // Count favourite singers
                numOfFaSingers++;
                favSingers.add(singer);
            }
        }

        return numOfFaSingers;
    }
}