package modules.easyProblems.numbers;

import modules.util.PrintUtil;

import java.util.*;

/**
 * Print sorted list of unique elements in the entered array.
 * - Create Integer array from int array.
 * - create a HashSet from Integer array using Collection.
 * - Create a list based on HashSet and sort the list.
 */
public class FindUniqueNumbersInArrayTest {

    public static void findUniqueNumbers(int[] array) {

        if(array==null || array.length==0) {
            System.out.println("Input list is empty. ");
            return;
        }

        Integer[] numbers = Arrays.stream(array).boxed().toArray(Integer[] :: new);
        HashSet<Integer> uniqueList = new HashSet<Integer>();
        Collections.addAll(uniqueList,numbers);
        List<Integer> list = new ArrayList<Integer>(uniqueList);
        Collections.sort(list);

        System.out.println("Unique numbers in   is as below ...");
        PrintUtil.print(array);
        for(Integer each : list) {
            System.out.println(each);
        }

    }


    public static void main(String[] args) {

        System.out.println("*******************");
        int[] list1 = {1,1,3,3,3,3,66,7,100,7,1,2,2,2};
        findUniqueNumbers(list1);
        System.out.println("*******************");

        int[] list2 = {};
        findUniqueNumbers(list2);

        System.out.println("*******************");

        int[] list3 = {1,5,7,2,1};
        findUniqueNumbers(list3);



    }
}
