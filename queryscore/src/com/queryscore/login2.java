package com.queryscore;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class login2 extends JFrame{

JLabel lable=new JLabel("用户名");

JTextField userNameTextField=new JTextField();

JLabel passLable= new JLabel("密码");

JTextField passTextField=new JTextField();

JButton loginBtn=new JButton("登录");

JButton exitBtn=new JButton("关闭");

public login2(){

this.setBounds(50,50,250,150);

Container c=this.getContentPane();

c.setLayout(new GridLayout(3, 2, 10, 10));

c.add(lable);

c.add(userNameTextField);

c.add(passLable);

c.add(passTextField);

c.add(loginBtn);

c.add(exitBtn);

loginBtn.addActionListener(new ActionListener() {

@Override

public void actionPerformed(ActionEvent e) {

// TODO Auto-generated method stub

String name=userNameTextField.getText();

String pass=passTextField.getText();

if(name.equals("Tom")&&pass.equals("123")){

System.out.println("登录成功");

}else{

System.out.println("用户名或者密码错误");

}

}

});

exitBtn.addActionListener(new ActionListener() {

@Override

public void actionPerformed(ActionEvent e) {

// TODO Auto-generated method stub

System.exit(0);

}

});

this.setDefaultCloseOperation(EXIT_ON_CLOSE);

this.setVisible(true);

}

public static void main(String[] args){

new login2();

}

}
