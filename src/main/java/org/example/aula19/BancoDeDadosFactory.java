package org.example.aula19;

public class BancoDeDadosFactory {

    public static BancoDeDados getBancoDeDados(String tpBancoDeDados){
        if(tpBancoDeDados.equalsIgnoreCase("o")){
            return new Oracle();
        } else if(tpBancoDeDados.equalsIgnoreCase("m")){
            return new MySql();
        } else {
         throw new IllegalArgumentException("Opção de banco de dados inválida.");
        }
    }
}
