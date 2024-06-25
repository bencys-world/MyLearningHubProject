package modules.util;

public class PrintUtil {


    public static void print(int[] numbers) {
        StringBuffer values = null;
        if(numbers!=null) {

            values = new StringBuffer();
            for(int i=0;i<numbers.length;i++) {
                values.append(numbers[i]);
                values.append("  ");
            }

            System.out.println(values);
        }

    }
}
