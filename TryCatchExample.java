public class TryCatchExample {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 2;

            int result = a / b;

            System.out.println("Result = " + result);
        }
        catch (Exception e) {
            System.out.println("Exception Occurred");
        }

        System.out.println("Program Ended");
    }
}