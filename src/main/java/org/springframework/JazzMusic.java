package org.springframework;

public class JazzMusic implements Music {
    @Override
    public void playMusic() {
        System.out.println("Jazz music...");
    }
}

