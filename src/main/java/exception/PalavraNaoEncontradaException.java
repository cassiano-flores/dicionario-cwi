package exception;

public class PalavraNaoEncontradaException extends RuntimeException {

    public PalavraNaoEncontradaException() {
        super("Palavra nao existe no dicionario pesquisado");
    }
}
