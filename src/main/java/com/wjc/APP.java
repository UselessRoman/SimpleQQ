package com.wjc;

import com.wjc.config.SpringConfig;
import com.wjc.service.UserService;
import com.wjc.view.SignInView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class APP extends SignInView {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

    UserService userService = ctx.getBean(UserService.class);

    public APP() {


        //登录按钮的事件
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkSignIn();
            }
        });
        //注册按钮的事件
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    userSignUp();
                }catch (Exception exception)
                {
                    exception.printStackTrace();
                    showErrorMessage("注册失败");
                }
            }
        });
        //取消按钮的事件
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private void userSignUp() {
        String userName = "";
        int id = Integer.parseInt(idField.getText().trim());
        String password = String.valueOf(passwordField.getPassword());
        if(userService.addNewUser(userName, password, id))
        {
            frame.dispose();
            new ClientAPP();
        }
    }

    private void checkSignIn() {
        int id = Integer.parseInt(idField.getText().trim());

        String password = String.valueOf(passwordField.getPassword());

        if(userService.findPasswordByID(id).equals(password))
        {
            frame.dispose();
            new ClientAPP();
        }
        else
        {
            showErrorMessage("登陆失败！");
        }
    }

    private void showErrorMessage(String msg) {
        JOptionPane.showMessageDialog(frame, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }


    public static void main(String[] args) {

//
//        System.out.println(userService.findPasswordByID(1));
//
//        System.out.println(userService.addNewUser("wwww", "www", 6));
        new APP();
    }
}
