public class Main {

    public static void main(String[] args) throws InterruptedException {

        String hello = new String("Hello, SkyPro!" + "\nlesson-2");

        for (int i = 0; i < hello.length(); i++) {
            System.out.print(hello.charAt(i));
            Thread.sleep(200);

        }
    }
}