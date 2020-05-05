package view.presentationLayer;
import model.businessLayer.BaseProduct;
import model.businessLayer.CompositeProduct;
import model.businessLayer.MenuItem;
import model.businessLayer.Restaurant;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserInterface {
    private JFrame jFrame;
    private JButton waiterButton;
    private JButton administratorButton;
    private JPanel mainPanel;
    private JPanel administratorPanel;
    private JButton doneAdministratorButton;
    private JButton createNewItemButton;
    private JButton deleteItemButton;
    private JButton editItemButton;
    private JPanel waiterPanel;
    private JButton createNewOrderButton;
    private JButton computePriceForOrderButton;
    private JButton generateBillButton;
    private JButton doneWaiterButton;
    private JButton baseProductButton;
    private JButton compositeProductButton;
    private JPanel productTypePanel;
    private JPanel compositeProductPanel;
    private JButton doneChooseButton;
    private JButton doneCompositeProductButton;
    private JTextField textField1;
    private JTextField textField2;
    private JButton doneBaseProductButton;
    private JPanel baseProductPanel;
    private JTextField nameCompositeProduct;
    private JPanel chooseMenuItemPanel;
    private JList listMenuItems;
    private JTextField compositionValue;
    private JButton createBaseProductButton;
    private JButton createCompositeProductButton;

    private void setAllPanelsNull(){
        waiterPanel.setVisible(false);
        administratorPanel.setVisible(false);
        mainPanel.setVisible(false);
        productTypePanel.setVisible(false);
        compositeProductPanel.setVisible(false);
        baseProductPanel.setVisible(false);
        chooseMenuItemPanel.setVisible(false);
    }
    public UserInterface() {
        waiterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.add(waiterPanel);
                setAllPanelsNull();
                waiterPanel.setVisible(true);
            }
        });
        administratorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.add(administratorPanel);
                setAllPanelsNull();
                administratorPanel.setVisible(true);
            }
        });
        createNewItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.add(productTypePanel);
                setAllPanelsNull();
                productTypePanel.setVisible(true);
            }
        });
        baseProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.add(baseProductPanel);
                setAllPanelsNull();
                baseProductPanel.setVisible(true);
            }
        });
        compositeProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.add(compositeProductPanel);
                ArrayList<String> list = new ArrayList<>();
                    list.add("tomato");
                    list.add("carrot");
                    list.add("cheese");

                    /*for (String s: list) {

                        final JCheckBox cb = new JCheckBox(s);
                        chooseMenuItemPanel.add(cb);
                    }*/

                setAllPanelsNull();
                compositeProductPanel.setVisible(true);
                chooseMenuItemPanel.setVisible(true);
            }
        });
        doneWaiterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAllPanelsNull();
                mainPanel.setVisible(true);
            }
        });
        doneAdministratorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAllPanelsNull();
                mainPanel.setVisible(true);
            }
        });
        doneChooseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAllPanelsNull();
                administratorPanel.setVisible(true);
            }
        });
        doneCompositeProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAllPanelsNull();
                productTypePanel.setVisible(true);
            }
        });
        doneBaseProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setAllPanelsNull();
                productTypePanel.setVisible(true);

            }
        });
    }
    public void createGUI() {
        jFrame = new JFrame("Restaurant Management");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(400,300));
        jFrame.pack();
        jFrame.add(mainPanel);
        mainPanel.setVisible(true);
        administratorPanel.setVisible(false);
        waiterPanel.setVisible(false);
        productTypePanel.setVisible(false);
        compositeProductPanel.setVisible(false);
        baseProductPanel.setVisible(false);
        chooseMenuItemPanel.setVisible(false);
    }
    public static void main(String args[]){
            UserInterface userInterface = new UserInterface();
            userInterface.createGUI();
            userInterface.jFrame.setVisible(true);
        }
}
