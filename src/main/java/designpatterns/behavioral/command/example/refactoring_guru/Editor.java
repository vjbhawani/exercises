package designpatterns.behavioral.command.example.refactoring_guru;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private Stack<Command> commandHistory = new Stack<>();

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }

    private void init() {
        JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");

        Editor editor = this;
        ctrlC.addActionListener(e -> {
            System.out.println("copy");
            execute(new CopyCommand(editor));
        });
        ctrlX.addActionListener(e -> {
            System.out.println("cut");
            execute(new CutCommand(editor));
        });
        ctrlV.addActionListener(e -> {
            System.out.println("paste");
            execute(new PasteCommand(editor));
        });
        ctrlZ.addActionListener(e -> {
            System.out.println("undo");
            if(!commandHistory.empty()) {
                Command command = commandHistory.pop();
                command.undo();
            }
        });

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void execute(Command command) {
        if(command.execute()) {
            commandHistory.push(command);
        }
    }

}