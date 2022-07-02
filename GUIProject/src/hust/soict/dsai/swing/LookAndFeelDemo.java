package hust.soict.dsai.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelDemo extends JFrame {
    public LookAndFeelDemo(){
        addDemoComponents();
        addLookAndFeelComboBox();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380, 100);
        setVisible(true);
    }

    void addDemoComponents(){
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("Label:"));
        cp.add(new JTextField("Text field"));
        cp.add(new JRadioButton("Radio button"));
        cp.add(new JButton("Button"));
    }

    void addLookAndFeelComboBox(){
        Container cp = getContentPane();
        cp.add(new JLabel("Change look and Feel Here: "));

        LookAndFeelInfo[] temp_lafInfos = UIManager.getInstalledLookAndFeels();
        int new_len = temp_lafInfos.length + 2;
        LookAndFeelInfo[] lafInfos = new LookAndFeelInfo[new_len];
        for (int i = 0; i < temp_lafInfos.length; i++){
            lafInfos[i] = temp_lafInfos[i];
        }

        String[] lafNames = new String [lafInfos.length];
        for (int  i = 0; i < lafInfos.length - 2; i++){
            lafNames[i] = lafInfos[i].getName();
        }
        lafNames[new_len - 2] = UIManager.getSystemLookAndFeelClassName();
        lafNames[new_len - 1] = UIManager.getCrossPlatformLookAndFeelClassName();

        lafNames[lafInfos.length] = UIManager.getSystemLookAndFeelClassName();
        lafNames[lafInfos.length + 1] = UIManager.getCrossPlatformLookAndFeelClassName();
        JComboBox cbLookAndFeel = new JComboBox(lafNames);
        cp.add(cbLookAndFeel);

        JFrame frame = this;
        cbLookAndFeel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int index = cbLookAndFeel.getSelectedIndex();
                try {
                    UIManager.setLookAndFeel(lafInfos[index].getClassName());
                } catch (Exception e){
                    e.printStackTrace();
                }
                SwingUtilities.updateComponentTreeUI(frame);
                setTitle(lafInfos[index].getName() + " Look and Feel");
            }
        });
    }

    public static void main(String[] args) {
        new LookAndFeelDemo();
    }
}
