public class Main {

    public static void main(String[] args) {
        Jogador jogador = new Jogador();

        // ogador começa na posição [0, 0]
        jogador.mostrarPosicao();
        System.out.println("Inicio");

        // alva a posição antes de fazer uma jogada
        JogadaMemento posicaoSalva = jogador.salvar();

        // Faz uma jogada ruim
        jogador.mover(5, 5);
        jogador.mostrarPosicao();

        // Desfaz a jogada ruim
        jogador.restaurar(posicaoSalva);
        System.out.println("-> Desfez a jogada!");
        jogador.mostrarPosicao();
    }
}
