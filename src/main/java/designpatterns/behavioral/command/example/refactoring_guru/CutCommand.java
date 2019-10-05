package designpatterns.behavioral.command.example.refactoring_guru;

public class CutCommand extends Command {
    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText().isEmpty()) {
            return false;
        }
        backup();

        String text = editor.textField.getText();
        String selectedText = editor.textField.getSelectedText();
        editor.clipboard = selectedText;

        editor.textField.setText(text.substring(editor.textField.getSelectionStart(),editor.textField.getSelectionEnd()));

        return true;
    }
}
