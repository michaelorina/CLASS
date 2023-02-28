//package menuexample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Salesio
 */
public class MenuExample extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    MenuExample(){
    setTitle("Our Example");
    setSize(500, 300);    
     //create a Menu Bar
        JMenuBar myMenuBar = new JMenuBar();
        //Menus
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("OPEN...");
        openItem.addActionListener(this);
        JMenuItem saveItem = new JMenuItem("Save Item...");
        saveItem.addActionListener(this);
        
        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyItem = new JMenuItem("Copy...");
             copyItem.addActionListener(this);
        JMenuItem pasteItem = new JMenuItem("Paste");
        
        //add components
        fileMenu.add(openItem);        fileMenu.add(saveItem);
        editMenu.add(copyItem);         editMenu.add(pasteItem);
        
        myMenuBar.add(fileMenu); myMenuBar.add(editMenu);
        
        
        setJMenuBar(myMenuBar); 
        setVisible(true);
    }
            
    public static void main(String[] args) {
        
        JFrame myWin = new MenuExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("You clicked: " + e.getActionCommand());
        if(e.getActionCommand().equals("Copy...")){
            JOptionPane.showMessageDialog(this, "You are a copy person");
        }
    }
    
}