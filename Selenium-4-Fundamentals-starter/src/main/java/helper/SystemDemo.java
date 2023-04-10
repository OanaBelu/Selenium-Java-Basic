//package helper;
//
//public class DemoHelper {
//
//    /**
//     * To slow down the execution
//     * For demo purposes only!
//     */
//    public static void pause() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

package helper;

import java.lang.*;

public class SystemDemo {

    public static void main(String[] args) {

        // prints Java Runtime Version before property set
        System.out.print("Previous : ");
        System.out.println(System.getProperty("java.runtime.version" ));
        System.setProperty("java.runtime.version", "Java Runtime 1.6.0");

        // prints Java Runtime Version after property set
        System.out.print("New : ");
        System.out.println(System.getProperty("java.runtime.version" ));
    }
}
