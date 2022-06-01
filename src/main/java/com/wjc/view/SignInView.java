package com.wjc.view;

import javax.swing.*;
import java.awt.*;

public class SignInView {
    protected JFrame frame;
    protected JButton signInButton, cancelButton, signUpButton;
    protected JPasswordField passwordField;
    protected JTextField idField;
    protected JPanel enterPanel;
    protected JPanel buttonPanel;

    public SignInView() {
        initUI();
    }

    private void initUI() {
        //设置登录窗口标题、默认大小以及布局
        frame = new JFrame("登录");
        frame.setSize(300, 400);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        enterPanel=new JPanel();
        buttonPanel=new JPanel();

        signInButton=new JButton("登录");
        signUpButton=new JButton("注册");
        cancelButton=new JButton("取消");

        passwordField=new JPasswordField();
        idField=new JTextField();

        enterPanel.setLayout(new GridLayout(2,3));
        enterPanel.add(new JLabel("账号"));
        enterPanel.add(idField);
        enterPanel.add(new JLabel("密码"));
        enterPanel.add(passwordField);

        buttonPanel.add(signInButton);
        buttonPanel.add(signUpButton);
        buttonPanel.add(cancelButton);



       frame.add(enterPanel,"North");
       frame.add(buttonPanel,"South");


        frame.setVisible(true);
    }
}
