package topic_1.topic_1_3;

public class Author {

    private String author;

    public Author(){}

    public void setAuthor(String author){ this.author = author; }
    public String getAuthor(){ return author; }


    public void show(){
        System.out.println("Автор: " + getAuthor());
    }
}
