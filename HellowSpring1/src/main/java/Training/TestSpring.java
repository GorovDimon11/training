package Training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //musicPlayer.playMusic();

        boolean comparing = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparing);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
