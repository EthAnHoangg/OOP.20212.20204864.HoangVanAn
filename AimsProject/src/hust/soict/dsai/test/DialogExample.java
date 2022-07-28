package hust.soict.dsai.test;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
import java.util.List;

import static java.util.Arrays.asList;

public class DialogExample {
    private static JDialog d;
//    DialogExample() {
//        JFrame f= new JFrame();
//        d = new JDialog(f , "Dialog Example", true);
//        d.setLayout( new FlowLayout() );
//        JButton b = new JButton ("OK");
//        b.addActionListener ( new ActionListener()
//        {
//            public void actionPerformed( ActionEvent e )
//            {
//                DialogExample.d.setVisible(false);
//            }
//        });
//        d.add( new JLabel ("Click button to continue."));
//        d.add(b);
//        d.setSize(300,300);
//        d.setVisible(true);
//    }
    public static void main(String args[]) {
//        new DialogExample();
        String content = "ten em la Hoang Van an";
        int a = content.indexOf("");
        System.out.println(a);
    }
}