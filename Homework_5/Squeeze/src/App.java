import javax.swing.JOptionPane;

import Homework_tools.stringStuff;

public class App {
    public static void main(String[] args) throws Exception {
       String a = JOptionPane.showInputDialog("String 1?");
       String b = JOptionPane.showInputDialog("String 2?");
       JOptionPane.showMessageDialog(null, stringStuff.squeeze(a, b),"Result" , 0);
    }
}