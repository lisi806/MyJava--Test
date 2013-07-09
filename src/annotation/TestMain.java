package annotation;

import java.lang.annotation.Annotation;

public class TestMain {

    /**
     * @author lcq 2013-6-5
     * @param args
     */
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("annotation.TestMain");
            Annotation[] aArray = null;
            try {
                aArray = TestMain.class.getMethod("testMytag").getAnnotations();
            } catch (SecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(aArray.length);
            for (Annotation a : aArray) {
                System.out.println(((MyTag)a).name());
                System.out.println(((MyTag)a).age());
            }
            new TestMain().testMytag();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }

    @MyTag(age = 0, name = "aa")
    public static void testMytag(){
    }
}
