package br.ufrn.imd;

public class GuitarPlayer extends Musician{
    public int howManyYears;
    public boolean playEletronicGuitar;
    public boolean playAcousticGuitar;
    public GuitarPlayer(int howManyYears, boolean playEletronicGuitar, boolean playAcousticGuitar){
        super(false, false, false);
        this.howManyYears = howManyYears;
        this.playEletronicGuitar = playEletronicGuitar;
        this.playAcousticGuitar = playAcousticGuitar;
    }

    public void playGuitar(){
        int play;
    }
}
