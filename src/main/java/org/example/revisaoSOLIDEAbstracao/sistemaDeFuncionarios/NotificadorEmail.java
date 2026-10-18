package org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios;

public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(String mensagem){
        System.out.println("Email: " + mensagem);
    }
}
