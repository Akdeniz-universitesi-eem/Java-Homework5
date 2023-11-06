import javax.swing.JOptionPane;

import Homework_tools.stringStuff;

public class App {
    public static void main(String[] args) throws Exception {
        String string = JOptionPane.showInputDialog("String ?");
        JOptionPane.showMessageDialog(null,stringStuff.changeCase(string), string, 0);
    }
}
