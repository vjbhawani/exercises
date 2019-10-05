package designpatterns.behavioral.command.example.refactoring_guru;

public abstract class Command {

    protected final Editor editor;
    protected String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public abstract boolean execute();

    protected void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }
}
