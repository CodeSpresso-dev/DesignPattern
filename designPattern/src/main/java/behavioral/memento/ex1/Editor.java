package behavioral.memento.ex1;

public class Editor {
    private String content;

    public EditorState createState(){
        return new EditorState(content);
    }
    public void restore(EditorState editorState){
        this.content = editorState.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
