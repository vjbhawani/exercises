package designpatterns.behavioral.command.example.refactoring_guru;

public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if(editor.clipboard == null)
        return false;

        backup();

        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }


}
