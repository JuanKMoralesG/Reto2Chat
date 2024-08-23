package com.example.reto2chat.view;

public interface LoginContract {
    interface View{
        void  showToast(String message);
        void navigateToHome();
        String getEmail();
        String getPassword();
    }
}
