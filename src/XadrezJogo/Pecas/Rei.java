package XadrezJogo.Pecas;

import Tabuleiro.Tabuleiro;
import XadrezJogo.Cor;
import XadrezJogo.PecaXadrez;

public class Rei extends PecaXadrez {
    public Rei(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "R";
    }
}
