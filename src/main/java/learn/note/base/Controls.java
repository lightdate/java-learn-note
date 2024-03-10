package learn.note.base;

public class Controls {
    public static void main(String[] args) {

    }

    private void ifControl(int num) {
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    private void forControl() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

    private void switchControl(int num) {
        switch (num) {
            case 1:
                System.out.println(num);
                break;
            case 2:
                System.out.println(num + num);
                break;
            default:
                System.out.println(num * num);
        }
    }

    private void whileControl(int num) {
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }

    private void do_whileControl(int num) {
        do {
            System.out.println(num);
            num--;
        } while (num > 0);
    }

    private void sampleIfControl(int num) {
        String isPositive = (num > 0) ? "Positive" : "other";
        String whatNum = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
    }
}
