package org.example.revisaoSOLIDEAbstracao.sistemaDeFuncionarios;

public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(String mensagem){
        System.out.println("SMS: " + mensagem);
    }
}
