package Program;

import java.util.Stack;

public class UndoRedo {

    private Stack<String> undoStack;
    private Stack<String> redoStack;

    UndoRedo() {

        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();

    }

    public void write(String word) {
        undoStack.push(word);
    }

    public String UndoStack() {

        String lastWord = undoStack.pop();
        redoStack.push(lastWord);

        return lastWord;

    }

    public String RedoStack() {

        String lastWord = redoStack.pop();
        undoStack.push(lastWord);

        return lastWord;
    }

    public static void main(String[] args) {

        UndoRedo obj1 = new UndoRedo();
        obj1.write("Three");
        obj1.write("Two");
        obj1.write("One");

        System.out.println(obj1.UndoStack());

        System.out.println(obj1.RedoStack());

    }

}
