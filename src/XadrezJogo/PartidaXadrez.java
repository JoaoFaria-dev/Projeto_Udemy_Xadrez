package XadrezJogo;

import Tabuleiro.Tabuleiro;

public class PartidaXadrez {
    private Tabuleiro tabuleiro;
    private int Turno;
    private Cor jogadorDaVez;
    private boolean check;
    private boolean checkMate;

    public PartidaXadrez() {
        tabuleiro = new Tabuleiro(8,8);
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
}
