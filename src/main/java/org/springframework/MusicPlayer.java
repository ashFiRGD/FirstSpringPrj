package org.springframework;


public class MusicPlayer {
    private Music music;
    public MusicPlayer(Music music) {
        this.music = music;
    }



    public void playMusic() {
    music.playMusic();
    }


}
