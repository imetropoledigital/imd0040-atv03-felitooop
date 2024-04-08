package br.ufrn.imd;

public class Musician extends Person{
    public boolean playClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;

    public Musician(boolean playClassicalMusic, boolean canImprovise, boolean canCompose) {
        super("João", "Natal/RN");
        this.playClassicalMusic = playClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
    }

    public void play(){
        int play;
    }
}
