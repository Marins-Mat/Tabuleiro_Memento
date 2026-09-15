public class Jogador {

    private int linha = 0;
    private int coluna = 0;

    public void mover(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public JogadaMemento salvar() {
        return new JogadaMemento(linha, coluna);
    }

    public void restaurar(JogadaMemento memento) {
        this.linha = memento.getLinha();
        this.coluna = memento.getColuna();
    }

    public void mostrarPosicao() {
        System.out.println("Posição atual: [" + linha + ", " + coluna + "]");
    }
}
