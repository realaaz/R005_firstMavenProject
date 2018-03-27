import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class firstTestClass {

//    public static void main(String[] args) throws IOException {
//        // String[] testData = { "0975156900", "(097)5156900", "(097)515-69-00", "(097)51-56-900", "+380975156900",
//        //         "+38 097 515 69 00" };
//
//        test1_isPhone();
//        test2_isPhone();
//    }

    // method under testing
    public static boolean isPhone(String text) {
        String regex = "(?:\\+38)? ?(?:0\\d{2}|\\(0\\d{2}\\)) ?\\d{2}(?:\\d{3}|\\d[- ]\\d{2}[- ]|[ -]\\d{2}[ -]\\d)\\d{2}";
        return text.matches(regex);
    }

    // testcase 1
    @Test
    public static void test1_isPhone() {
        // TC
        // Test data

        String testData = "0975156900";

        boolean result = isPhone(testData);

        Assert.assertTrue(result, "Test 1 failed result");

    }


    // testcase 2
    @Test
    public static void test2_isPhone() {

        String testData = "asdaddasds";

        boolean result = isPhone(testData);

        Assert.assertFalse(result, "Test 2 failed result");
    }

    // testcase 3
    @Test
    public static void test3_isPhone() {

        String testData = "";

        boolean result = isPhone(testData);

        Assert.assertFalse(result, "Test 3 failed result");

    }

    // testcase 4
    @Test
    public static void test4_isPhone() {

        String testData = "<!№%:,,..;,.;()";

        boolean result = isPhone(testData);

        Assert.assertFalse(result, "Test 4 failed result");

    }

    @Test //
    public static void test5_isPhone() {

        String testData = "1";

        boolean result = isPhone(testData);

        Assert.assertFalse(result, "Test 5 failed result");

    }

    @Test
    public static void test6_isPhone() {

        String testData = "<999999999999999999999999999";

        boolean result = isPhone(testData);

        Assert.assertFalse(result, "Test 6 failed result");

    }

    @Test
    public static void test7_isPhone() {

        String testData = "(097)5156900";

        boolean result = isPhone(testData);

        Assert.assertTrue(result, "Test 7 failed result");

    }

    @Test
    public static void test8_isPhone() {

        String testData = "+38(097)5156900";

        boolean result = isPhone(testData);

        Assert.assertTrue(result, "Test 8 failed result");

    }




}