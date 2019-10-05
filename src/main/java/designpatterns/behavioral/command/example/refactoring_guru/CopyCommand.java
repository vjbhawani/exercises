package designpatterns.behavioral.command.example.refactoring_guru;

public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    public boolean execute() {
        String selectedText = editor.textField.getSelectedText();
        editor.clipboard = selectedText;
        return false;
    }
}
