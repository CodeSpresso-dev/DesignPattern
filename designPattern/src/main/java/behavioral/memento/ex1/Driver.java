package behavioral.memento.ex1;

public class Driver {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history=new History();

        editor.setContent("FirstInitialized");
        history.push(editor.createState());

        editor.setContent("SecondInitialized");
        history.push(editor.createState());

        editor.setContent("ThirdInitialized");
        history.push(editor.createState());

        editor.setContent("FourthInitialized");
        history.push(editor.createState());

        editor.setContent("FifthInitialized");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }
}
