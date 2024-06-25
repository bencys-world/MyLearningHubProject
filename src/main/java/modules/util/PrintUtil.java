package modules.util;

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
}
