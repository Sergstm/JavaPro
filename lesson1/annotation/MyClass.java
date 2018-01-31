package homework.lesson1.annotation;

public class MyClass {

    @Test(a = 2, b = 5)
    public void test(int a, int b) {
        System.out.println("First num = " + a + "\nSecond num = " + b);
    }
}
