package Training;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }
}
