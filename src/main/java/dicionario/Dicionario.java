package dicionario;

import exception.PalavraNaoEncontradaException;

import java.util.Map;
import java.util.TreeMap;

public class Dicionario {

    Map<String, String> dicionarioPortugues;
    Map<String, String> dicionarioIngles;

    public Dicionario() {
        this.dicionarioPortugues = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        this.dicionarioIngles = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario) {

        switch (dicionario) {
            case PORTUGUES:
                dicionarioPortugues.put(palavra, traducao);
                break;

            case INGLES:
                dicionarioIngles.put(palavra, traducao);
        }
    }

    public String traduzir(String palavra, TipoDicionario dicionarioDeBusca) throws PalavraNaoEncontradaException {
        String traducao = "";

        switch (dicionarioDeBusca){
            case PORTUGUES:
                traducao = dicionarioPortugues.get(palavra);
                break;
            case INGLES:
                traducao = dicionarioIngles.get(palavra);
                break;
            default:
                break;
        }

        if (traducao == null) {
            throw new PalavraNaoEncontradaException();
        }

        return traducao;
    }
}
