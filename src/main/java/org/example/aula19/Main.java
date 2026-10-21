package org.example.aula19;

public class Main {
    public static void main(String[] args) {
        Oracle oracle = new Oracle();
        conectarBanco(oracle);

        BancoDeDados mySQL = BancoDeDadosFactory.getBancoDeDados("M");
        mySQL.chamarBanco();
    }

    static void conectarBanco(Oracle oracle){
        oracle.chamarBanco();
    }
}
