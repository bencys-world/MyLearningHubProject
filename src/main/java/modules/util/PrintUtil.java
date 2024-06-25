package modules.util;

public class PrintUtil {


    public static void print(int[] numbers) {
        StringBuffer values = new StringBuffer();
        if(numbers!=null) {

            for(int i=0;i<numbers.length;i++) {
                values.append(numbers[i]);
                values.append("  ");
            }

            System.out.println(values.toString());
        }

    }
}
