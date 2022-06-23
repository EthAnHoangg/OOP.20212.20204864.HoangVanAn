package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.Store.Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

    public AddCompactDiscToStoreScreen(Store store){
        super(store);
        Container cp  = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        cp.add(createSouthForCD(), BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Store");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(6,2));

        JLabel title =  new JLabel("CD's title: ");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 18));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        center.add(title);
        JTextField tfTitle = new JTextField(10);
        center.add(tfTitle);

        JLabel category =  new JLabel("CD's category: ");
        category.setFont(new Font(title.getFont().getName(), Font.PLAIN, 18));
        category.setHorizontalAlignment(SwingConstants.CENTER);
        center.add(category);
        JTextField tfCategory = new JTextField(10);
        center.add(tfCategory);


        JLabel director = new JLabel("CD's director: ");
        director.setFont(new Font(title.getFont().getName(), Font.PLAIN, 18));
        director.setHorizontalAlignment(SwingConstants.CENTER);
        center.add(director);
        JTextField tfDirector = new JTextField(10);
        center.add(tfDirector);

        JLabel artist = new JLabel("CD's artist: ");
        artist.setFont(new Font(title.getFont().getName(), Font.PLAIN, 18));
        artist.setHorizontalAlignment(SwingConstants.CENTER);
        center.add(artist);
        JTextField tfArtist = new JTextField(10);
        center.add(tfArtist);

        JLabel length = new JLabel("CD's length");
        length.setFont(new Font(title.getFont().getName(), Font.PLAIN, 18));
        length.setHorizontalAlignment(SwingConstants.CENTER);
        center.add(length);
        JTextField tfLength = new JTextField(10);
        center.add(tfLength);

        JLabel cost = new JLabel("CD's cost");
        cost.setFont(new Font(title.getFont().getName(), Font.PLAIN, 18));
        cost.setHorizontalAlignment(SwingConstants.CENTER);
        center.add(cost);
        JTextField tfCost = new JTextField(10);
        center.add(tfCost);

        return center;
    }

    private class TFInputListener implements ActionListener{
        public void actionPerformed(ActionEvent evt){

        }
    }
}
