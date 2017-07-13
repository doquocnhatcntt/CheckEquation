package equation;
/**
 *
 * @author Nhatdqse61645
 */
public class CheckEquation {

    private int a, b, c;

    public CheckEquation() {
        a = 1;
        b = 1;
        c = 1;
    }

    public boolean checkEquationIsValid() {
        boolean check = true;
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    check = false;
                }
            }
        } else {
            int delte = b * b - 4 * a * c;
            if (delte < 0) {
                check = false;
            }
        }
        return check;
    }

    public static void main(String args[]) {
//        int a = 2;
//        int b = 2;
//        int c;
    }
}
