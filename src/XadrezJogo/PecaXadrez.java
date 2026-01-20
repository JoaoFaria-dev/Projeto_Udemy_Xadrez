package XadrezJogo;

import Tabuleiro.Peca;
import Tabuleiro.Tabuleiro;
import XadrezJogo.Cor;

public class PecaXadrez extends Peca {
    private Cor cor;
    private int contabilizadorMovimento;

    public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}