public class ControlFlowDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Simple if
        if (a > b) {
            System.out.println("a is greater than b");
        }

        // if-else
        if (a > b) {
            System.out.println("a is greater than b (if-else)");
        } else {
            System.out.println("a is not greater than b (if-else)");
        }

        // switch statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other Day");
        }

        // for loop: 0 to 4
        for (int i = 0; i < 5; i++) {
            System.out.println("for loop i = " + i);
        }

        // while loop: 0 to 4
        int i = 0;
        while (i < 5) {
            System.out.println("while loop i = " + i);
            i++;
        }

        // do-while loop: 0 to 4
        int j = 0;
        do {
            System.out.println("do-while loop j = " + j);
            j++;
        } while (j < 5);
    }
}

