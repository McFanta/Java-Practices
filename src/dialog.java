import static javax.swing.JOptionPane.*;
public class dialog {
    public static void main(String[] args) {
        String name = showInputDialog("Name:");
        showMessageDialog(null, "Hello " + name);
    }
}
