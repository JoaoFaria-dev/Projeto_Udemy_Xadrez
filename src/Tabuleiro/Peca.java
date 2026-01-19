package Tabuleiro;

public class Peca {

    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        //Posição de uma peça recem criada sempre vai ser nula
        posicao = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
        // Só o get para que não seja possivel alterar
    }
}
