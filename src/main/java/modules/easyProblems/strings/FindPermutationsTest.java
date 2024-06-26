package modules.easyProblems.strings;

import modules.util.PrintUtil;

import java.util.ArrayList;

/**
 * Find all permutations of an entered string using Backtrack Algorithm.
 * - Backtracking is faster than brute force approach since it can remove a large set of answers in one test.
 * - But it has high time complexity,  especially if the problem has a large number of constraints and a complex search space.
 * -Space complexity: Backtracking can also be memory-intensive, as it requires storing the state of the partial solution at each step of the search.
 * -it is called Backtracking because, Backtracking is like trying different paths, and when you hit a dead end, you backtrack to the last choice and try a different route.
 *
 */
public class FindPermutationsTest {

    public static ArrayList<String> permutations(String str) {

        ArrayList<String> combos = new ArrayList<String>();
        if(str == null || str.length()==0 ) return combos;
        findCombos(str.toCharArray(),0,combos);
        return combos;
    }

    public static void findCombos(char[] str, int index, ArrayList<String> data) {

        if(index == str.length -1 ) {

            data.add(new String(str));
        }
        for(int i=index; i<str.length;i++) {

            swap(str,index,i);
            findCombos(str,index+1,data);
            swap(str,index,i);
        }
    }


    private static void swap(char[] str,int i, int j) {

        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
    public static void main(String[] args) {

        String input ="123";
        System.out.println("-------------------------- Entered input = "+input);
        ArrayList<String>  result = permutations(input);
        PrintUtil.print(result);



        input ="A";
        System.out.println("-------------------------- Entered input = "+input);
        result = permutations(input);
        PrintUtil.print(result);




        input ="June";
        System.out.println("-------------------------- Entered input = "+input);
        result = permutations(input);
        PrintUtil.print(result);


        input ="12";
        System.out.println("-------------------------- Entered input = "+input);
        result = permutations(input);
        PrintUtil.print(result);

    }
}
