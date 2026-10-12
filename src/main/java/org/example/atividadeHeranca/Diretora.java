package org.example.atividadeHeranca;

public class Diretora extends Gerente{
    void definirMeta(String meta){
        System.out.println(super.nome + " definiu a meta " + meta);
    }
}
