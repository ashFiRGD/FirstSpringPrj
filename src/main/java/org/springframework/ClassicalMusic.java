package org.springframework;

public class ClassicalMusic implements Music {

    @Override
    public void playMusic() {
        System.out.println("Classical music...");
    }
}
