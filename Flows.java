public class Flows {


    public void methodA(String input) {
        System.out.println("j");
        System.out.println("a");
        if (input.equals("start")) {
            System.out.println("v");
        } else {
            System.out.println("q");
            System.out.println("m");
        }
        System.out.println("a");
    }

    public void methodB(String input) {
        System.out.println("e");
        if (input.equals("yooo")) {
            System.out.println("v");
        } else {
            System.out.println("r");
            System.out.println("s");
        }
    }

    public int methodC(String input) {
        System.out.println("j");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.println("o");
        if (number == 12) {
            System.out.println("v");
            System.out.println("t");
        }

    }
}
