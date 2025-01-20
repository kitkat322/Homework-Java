package topic_1.topic_1_3;

public class Content {
    private String content;

    public Content () {}

    public void show(){
        System.out.println("Зміст: " + getContent());
    }

    public void setContent(String content){ this.content = content; }
    public String getContent() {return content; }
}
