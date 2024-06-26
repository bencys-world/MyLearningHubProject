package modules.util;

import java.util.ArrayList;

public class PrintUtil {


    public static void print(int[] numbers) {
        StringBuffer values;
        if(numbers!=null) {

            values = new StringBuffer();
            for(int each: numbers) {
                values.append(each).append(" ");
            }

            System.out.println(values);
        }

    }

    public static void print(ArrayList<String> data) {

        if(data == null )  return;

        for(String each : data) {
            System.out.println(each);
        }
    }
}
