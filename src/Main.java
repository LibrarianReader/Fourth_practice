import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        table.setVisible(true); // было видно
        table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  закрывалось
        table.setSize(300,200);
        table.setResizable(false); // чтобы нельзя было менять размер окна
    }
}