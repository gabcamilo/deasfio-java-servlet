package br.com.zup.gabriela.camilo.casaDoCodigo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static List<Autor> listaAutor = new ArrayList<>();
    private static Integer chaveSequencialAutor = 1;

    public static List<Autor> getListaAutor() {
        return listaAutor;
    }

    public void adiciona(Autor empresa) {
        empresa.setId(Banco.chaveSequencialAutor++);
        Banco.listaAutor.add(empresa);
    }
}
