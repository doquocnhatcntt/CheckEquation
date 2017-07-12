/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;

/**
 *
 * @author Nhatdqse61645
 */
public class CheckEquation {

    private int a, b, c;

    public CheckEquation() {
        a = 0;
        b = 0;
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
        return check
    }

    public static void main(String args[]) {
//        int a = 2;
//        int b = 2;
//        int c;
    }
}
