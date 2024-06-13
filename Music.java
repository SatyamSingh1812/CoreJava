class  MusicSystem{
    public  void PlayMusic(){
        System.out.println("Music is playing");
    }
    public  void MusicTurnOff(){
        System.out.println("Turn off the music");
    }
    public void ChangeSong(){
        System.out.println("Please change the song.");
    }
}
public class Music {
    public static void main(String[] args) {
        MusicSystem play = new MusicSystem();
        MusicSystem TurnOff = new MusicSystem();
        MusicSystem Change = new MusicSystem();
        play.PlayMusic();
        TurnOff.MusicTurnOff();
        Change.ChangeSong();

    }
}

