package cucumber.runner;

import managers.Reflection;
import managers.WebDriverManager;
import org.junit.Test;

public class KrujkaMednaia {

//    String home = "pageObjects.HomePage";
//    String url = "url";
//    Class c = Class.forName(home);
//    Field f = c.getField(url);

//    public KrujkaMednaia() throws ClassNotFoundException, NoSuchFieldException {
//    }
//
//    @Test
//    public void test() throws NoSuchFieldException, NoSuchMethodException {
//        Class c = null;
//        try {
//            c = Class.forName(home);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        System.out.println(c.getDeclaredMethod("getUrl").toString());
//        Method meth = c.getDeclaredMethod("getUrl");
//        f.setAccessible(true);
//        System.out.println(f.getName());
//    }
//
//    @Test
//    public void testo() throws Exception {
//        // MZ: Find the correct method
//        for (Method method : c.getDeclaredMethods()) {
//            if ((method.getName().startsWith("get"))
//                    && (method.getName().length() == (f.getName().length() + 3))) {
//                if (method.getName().toLowerCase().endsWith(f.getName().toLowerCase())) {
//                    method.invoke(c.newInstance());
//                }
//            }
//        }
//    }


    @Test
    public void sasha() throws Exception {
        WebDriverManager.createDriver();
        WebDriverManager.driver.get("https://www.phptravels.net/index.php");
        Reflection.pageInit("HomePage");
        WebDriverManager.closeDriver();
    }

    @Test
    public void sasha2() throws Exception {
        WebDriverManager.createDriver();
        WebDriverManager.driver.get("https://www.phptravels.net/login.php");
        Reflection.pageInit("LoginPage");
        WebDriverManager.closeDriver();
    }
}
