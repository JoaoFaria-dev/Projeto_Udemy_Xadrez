package XadrezJogo;

import Tabuleiro.Tabuleiro;
import XadrezJogo.Pecas.Rei;
import XadrezJogo.Pecas.Torre;
import Tabuleiro.Posicao;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;
    private int Turno;
    private Cor jogadorDaVez;
    private boolean check;
    private boolean checkMate;

    public PartidaXadrez() {
        tabuleiro = new Tabuleiro(8,8);
        stupInicial();
    }

    public PecaXadrez[][] getPecaXadrez() {
        PecaXadrez[][] matriz = new PecaXadrez[tabuleiro.getLinhasTabuleiro()][tabuleiro.getColunaTabuleiro()];
        for (int i = 0; i<tabuleiro.getLinhasTabuleiro(); i++) {
            for (int j = 0; j<tabuleiro.getColunaTabuleiro(); j++) {
                matriz[i][j] = (PecaXadrez) tabuleiro.pecasTabuleiros(i, j);
                //Transformar as peças do tabuleiro em peça de xadrez
            }
        }
        return matriz;
    }

    private void stupInicial(){
        tabuleiro.localPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2,1));
        tabuleiro.localPeca(new Rei(tabuleiro, Cor.PRETO), new Posicao(0,4));
        tabuleiro.localPeca(new Rei(tabuleiro, Cor.BRANCO ), new Posicao(7,4));
    }
}
