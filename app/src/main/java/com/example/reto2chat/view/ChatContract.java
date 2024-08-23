package com.example.reto2chat.view;

import com.example.reto2chat.model.MessageModel;

import java.util.List;

public interface ChatContract {
    //Muestra la lista de conversaciones en la interfaz de usuario.
    void showConversations(List<MessageModel> conversations);

    //Muestra una confirmación de que el mensaje ha sido enviado correctamente.
    void showMessageSentConfirmation();
}
