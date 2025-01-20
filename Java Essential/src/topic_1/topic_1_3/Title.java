package topic_1.topic_1_3;

public class Title {
    private String title;

    public Title () {}

    public void show(){
        System.out.println("Назва: " + getTitle());
    }

    public void setTitle(String title) {this.title = title; }
    public String getTitle() {return title; }
}
