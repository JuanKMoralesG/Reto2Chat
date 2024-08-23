package com.example.reto2chat.view;

import com.example.reto2chat.model.UserModel;

import java.util.List;

public interface UserListContract {

    //Muestra la lista de usuarios en la interfaz de usuario.
    void displayUsers(List<UserModel> users);

    //Muestra un mensaje de error en la interfaz de usuario.
    void showError(String message);
}

