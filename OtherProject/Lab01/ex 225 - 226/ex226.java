import javax.swing.*;

public class ex226 {
    public static void main(String[] args) {
        String strNumChoice;


        strNumChoice = JOptionPane.showInputDialog(null,
                "1. Solve the first-degree equation with one variable. \n" +
                        "2. Solve the system of first degree equations with two variables. \n" +
                        "3. Solve the second-degree equation with one variable.",
                JOptionPane.INFORMATION_MESSAGE);

        int NumChoice = Integer.parseInt(strNumChoice);

        if (NumChoice == 1){
            String stra, strb;
            stra = JOptionPane.showInputDialog(null, "Input the number a",
                    JOptionPane.INFORMATION_MESSAGE);
            double a = Double.parseDouble(stra);
            if (a != 0) {
                strb = JOptionPane.showInputDialog(null, "Input the number b",
                        JOptionPane.INFORMATION_MESSAGE);
                double b = Double.parseDouble(strb);
                JOptionPane.showMessageDialog(null,
                        "x = " + (b / a),
                        "Solution", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "a must not be 0, try again!",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (NumChoice == 2) {
            String stra11, stra12, stra21, stra22, strb1, strb2;
            stra11 = JOptionPane.showInputDialog(null, "Input the number a11",
                    JOptionPane.INFORMATION_MESSAGE);
            double a11 = Double.parseDouble(stra11);
            stra12 = JOptionPane.showInputDialog(null, "Input the number a12",
                    JOptionPane.INFORMATION_MESSAGE);
            double a12 = Double.parseDouble(stra12);
            strb1 = JOptionPane.showInputDialog(null, "Input the number b1",
                    JOptionPane.INFORMATION_MESSAGE);
            double b1 = Double.parseDouble(strb1);
            stra21 = JOptionPane.showInputDialog(null, "Input the number a21",
                    JOptionPane.INFORMATION_MESSAGE);
            double a21 = Double.parseDouble(stra21);
            stra22 = JOptionPane.showInputDialog(null, "Input the number a22",
                    JOptionPane.INFORMATION_MESSAGE);
            double a22 = Double.parseDouble(stra22);
            strb2 = JOptionPane.showInputDialog(null, "Input the number b2",
                    JOptionPane.INFORMATION_MESSAGE);
            double b2 = Double.parseDouble(strb2);

            double D  = a11 * a22 - a12 * a21;
            double D1 = b1 * a22 - b2* a12;
            double D2 = a11 * b2 - a21 * b1;
            if (D == 0){
                if (D1 == 0){
                    JOptionPane.showMessageDialog(null,
                            "Infinite solution!",
                            "Infinite solutions", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No solution!",
                            "No solution", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "x1 = " + (D1/D),
                        "First variable solution", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,
                        "x2 = " + (D2/D),
                        "Second variable solution", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (NumChoice == 3) {
            String stra, strb, strc;
            stra = JOptionPane.showInputDialog(null, "Input the number a",
                    JOptionPane.INFORMATION_MESSAGE);
            double a = Double.parseDouble(stra);
            if (a == 0){
                JOptionPane.showMessageDialog(null,
                        "a must not be zero!",
                        "Error!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                strb = JOptionPane.showInputDialog(null, "Input the number b",
                        JOptionPane.INFORMATION_MESSAGE);
                double b = Double.parseDouble(strb);
                strc = JOptionPane.showInputDialog(null, "Input the number c",
                        JOptionPane.INFORMATION_MESSAGE);
                double c = Double.parseDouble(strc);
                double delta = Math.pow(b, 2) - 4 * a * c;
                if (delta < 0){
                    JOptionPane.showMessageDialog(null,
                            "No real solution!",
                            "No real solution!", JOptionPane.INFORMATION_MESSAGE);
                } else if (delta == 0) {
                    JOptionPane.showMessageDialog(null,
                            "Unique solution x = " + (-b/(2 * a)),
                            "Unique solution!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "x1 = " + ((-b + Math.sqrt(delta))/(2 * a)),
                            "First solution!", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null,
                            "x2 = " + ((-b - Math.sqrt(delta))/(2 * a)),
                            "Second solution!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Choose again!",
                    "Option error.", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
