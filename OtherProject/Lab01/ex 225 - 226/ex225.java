import javax.swing.JOptionPane;

public class ex225 {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You've just entered ";
        strNum1 = JOptionPane.showInputDialog(null, "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        strNum2  = JOptionPane.showInputDialog(null, "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num2 = Double.parseDouble(strNum2);
        strNotification += strNum1 + " and ";
        strNotification += strNum2;

        JOptionPane.showMessageDialog(null, strNotification,
                "Show two numbers",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Sum of 2 numbers = " + (num1 + num2),
                "Sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Difference of 2 numbers = " + (Math.abs(num1 - num2)),
                "Difference", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Product of 2 numbers = " + (num1 * num2),
                "Product", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "Quotient of 2 numbers = " + (num1 / num2),
                "Quotient", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

