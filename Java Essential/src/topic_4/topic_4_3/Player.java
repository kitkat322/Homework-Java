package topic_4.topic_4_3;

public class Player implements Playable, Recodable{

    @Override
    public void play(){
        System.out.println("Player plays");
    }

    public void record(){
        System.out.println("Player records");
    }

    public void pause(){
        System.out.println("Player is paused");
    }

    public void stop(){
        System.out.println("Player is stopped");
    }
}
