﻿package com.queryscore;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Score {
	
	public static JLabel jlb22 ;//显示结果的
	
    public static void main(String[] args) {
    	
    	JFrame frame = new JFrame();
        frame.setSize(300, 250);//窗体大小  
        frame.setTitle("学生成绩判定");//窗体标签  
        frame.setLayout(new GridLayout(4, 1));//网格式布局  
        frame.setLocationRelativeTo(null);//在屏幕中间显示(居中显示)
        
        
        JPanel panel1 = new JPanel();//
        JPanel panel2 = new JPanel();//
        JPanel panel3 = new JPanel();//
        JPanel panel4 = new JPanel();//
        
        //第一行
        JLabel label1 = new JLabel("学生成绩判定");
        label1.setFont(new Font("黑体", Font.BOLD,   26));   
        panel1.add(label1);
        
        //第二行
        JLabel jlb1 = new JLabel("请输入学生成绩："); 
        jlb1.setFont(new Font("宋体", Font.BOLD,   20));  
        final JTextField jtf1=new JTextField(4); //创建文本框  
        jtf1.setFont(new Font("宋体", Font.BOLD,   20));  
        panel2.add(jlb1);
        panel2.add(jtf1);
        
        //第三行
        JLabel jlb2 = new JLabel("学生成绩等级："); 
        jlb2.setFont(new Font("宋体", Font.BOLD,   20));  
        jlb22 = new JLabel("待定"); 
        jlb22.setFont(new Font("宋体", Font.BOLD,   22)); 
        jlb22.setForeground(Color.red);
        panel3.add(jlb2);
        panel3.add(jlb22);
        
        //第四行创建按钮  
        JButton jb1 = new JButton("查询");  
        JButton jb2 = new JButton("取消");
        jb1.setFont(new Font("宋体", Font.PLAIN,   18));
        jb2.setFont(new Font("宋体", Font.PLAIN,   18));
        jb1.setFocusPainted(false); //设置不绘制焦点
        jb2.setFocusPainted(false); //设置不绘制焦点
        panel4.add(jb1);
        panel4.add(jb2);
        
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        
          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出关闭JFrame  
        frame.setVisible(true);//显示窗体  
        frame.setResizable(false);//锁定窗体    
        
        
        //查询按钮添加一个活动监听  
        jb1.addActionListener(new ActionListener() {  
              
            @Override  
            public void actionPerformed(ActionEvent e) {  
                //System.exit(0);  
            	String chengji = jtf1.getText().trim();
            	queryscore(chengji);
            }  
        });  
        
        
      //取消按钮添加一个活动监听  
        jb2.addActionListener(new ActionListener() {  
              
            @Override  
            public void actionPerformed(ActionEvent e) {  
                //System.exit(0);  
            	
            	jtf1.setText("");  
            	jlb22.setText("待定"); 
            }  
        });
    }
    
    //判断成绩的函数
    public static void queryscore(String chengjiStr){
    	
    	try {
    		
    		double chengji = Double.valueOf(chengjiStr);
    		
    		if (chengji>100){
    			jlb22.setText("无效成绩"); 
			}
			else if (90<=chengji && chengji <= 100){
				jlb22.setText("优秀"); 
			}
			else if (chengji >= 80 && chengji < 90){
				jlb22.setText("良好"); 
			}
			else if (chengji >= 70 && chengji < 80){
				jlb22.setText("中等"); 
			}
			else if (chengji >= 60 && chengji < 70){
				jlb22.setText("及格"); 
			}else {
				jlb22.setText("不及格"); 
			}
    		
		} catch (NumberFormatException e) {
			
			jlb22.setText("无效成绩"); 
		}
    	
    }
    
    
    //用ascii码 判断是不是有效的数字   暂时没有用到
    public static boolean isNumeric(String str){
    	
        for(int i=str.length();--i>=0;){
            int chr=str.charAt(i);
            if(chr<48 || chr>57)
                return false;
        }
       return true;
    }  
}