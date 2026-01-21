package XadrezJogo.Pecas;

import Tabuleiro.Tabuleiro;
import XadrezJogo.Cor;
import XadrezJogo.PecaXadrez;

public class Torre extends PecaXadrez {
    public Torre(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "T";
    }
}
