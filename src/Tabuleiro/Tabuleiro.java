package Tabuleiro;

public class Tabuleiro {

    private int linhasTabuleiro;
    private int colunaTabuleiro;
    private Peca[][] pecasTabuleiro;

    public Tabuleiro(int linhasTabuleiro, int colunaTabuleiro) {
        this.linhasTabuleiro = linhasTabuleiro;
        this.colunaTabuleiro = colunaTabuleiro;
        pecasTabuleiro = new Peca[linhasTabuleiro][colunaTabuleiro];
    }

    public int getColunaTabuleiro() {
        return colunaTabuleiro;
    }

    public void setColunaTabuleiro(int colunaTabuleiro) {
        this.colunaTabuleiro = colunaTabuleiro;
    }

    public int getLinhasTabuleiro() {
        return linhasTabuleiro;
    }

    public void setLinhasTabuleiro(int linhasTabuleiro) {
        this.linhasTabuleiro = linhasTabuleiro;
    }
}
