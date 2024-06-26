package modules.designPatterns.SingletonPattern;

import com.google.gson.internal.bind.util.ISO8601Utils;

/**
 * Singleton class
 * - Only once instance of the class at any given time.
 * - volatile will ensure that change done by some thread will be automatically visible to other threads.
 * - synchronized block ensures that only one thread can access the block at a time.
 * - Creating a local var and assigning the class level obj will improve performance.
 */
public class SingletonPatternTest {

    private String data= null;
    private static volatile  SingletonPatternTest  obj = null;

    private SingletonPatternTest(String data) {

        this.data = data;
    }

    public static SingletonPatternTest  getInstance(String data) {

        SingletonPatternTest tempObj = obj;

        if(tempObj == null) {

            synchronized (SingletonPatternTest.class) {
                System.out.println(" Obj is null. Init for the 1st time. ");
                tempObj = obj = new SingletonPatternTest(data);
            }
        }else {
            tempObj.data =  obj.data = data;
        }
        System.out.println(tempObj.data);
        return tempObj;
    }

    public static void main(String[] args) {

        SingletonPatternTest.getInstance("Bency");
        SingletonPatternTest.getInstance("Christine");
        SingletonPatternTest.getInstance("June");

    }

}
