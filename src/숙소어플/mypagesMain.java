package ���Ҿ���;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

class mypagesMain extends JFrame{
	static JLabel money= new JLabel();
	JOptionPane jp = new JOptionPane();
	ChargeMoney cm = new ChargeMoney();
	JPanel panel = new JPanel();
	ImageIcon img1 = new ImageIcon("ȸ������.PNG");
	totalReserve tr =new totalReserve();
	
	//���� 
	void charge() {
		money.setText(""+cm.charge_moeny);
		System.out.println(cm.charge_moeny);
		panel.add(money);
		money.setBounds(300, 220, 150, 60);
		money.setForeground(new Color(200,61,102));
	}
	
	
	//����Ʈ --����Ʈ �ֱ�
	//charge()�� ����ϰ� �Ͻø� �˴ϴ�!
	void point() {
		
		
	}
	
	public mypagesMain() {
		setSize(500,700);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		panel.setLayout(null);
 		setTitle("����������");
 		
 		//�̹��� ����
 		JLabel jl = new JLabel(img1);
 		jl.setBounds(5,30,69,50);
 		
 		
 		//jpanel2 - ����Ʈ
 		JPanel jpanel2= new JPanel();
 
 		jpanel2.setBackground(new Color(248,248,248));
 		String[] btntext = {"����Ʈ","�����ݾ�","���೻��"};
 		JButton[] btn = new JButton[btntext.length];
 		
 		for (int i = 0; i < btntext.length; i++) {
			btn[i] = new JButton(btntext[i]);
			btn[i].setBackground(new Color(255,255,255));
			btn[i].setBorder(new LineBorder(new Color(115,160,227),1,true));
	        
			panel.add(btn[i]);
		} 		
		JLabel label = new JLabel("�� �ȳ��Ͻʴϱ�?");
		label.setFont(new Font("d",Font.BOLD,10));
		
		ActionListener al =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				switch (s){
				case "����Ʈ":
					new Point();
					break;
				case "�����ݾ�":
					cm.ChargeMoney();
					break;
				case "���೻��":
					tr.totalReserve();
					break;
			}
			}
		};
		
		//�����ϱ�
		charge();
		
		//point�κ�
		point();
		
		panel.setBounds(30, 50, 430, 500);
		panel.setBackground(new Color(255,255,255));
		panel.setBorder(new LineBorder(new Color(248,248,248),3,true));
		jpanel2.setBounds(0,100,430,100);
		
		label.setBounds(110, 5, 300, 100);
		//����Ʈ
		btn[0].setBounds(50,120,150,60);
		btn[1].setBounds(50,220,150,60);
		btn[2].setBounds(0,320,430,60);
		
 		panel.add(label);
 		panel.add(jpanel2);
 		panel.add(jl);
		for (int i = 0; i < btn.length; i++) {
			btn[i].addActionListener(al);
		}
		panel.add(jl);
		panel.add(label);
		this.add(panel);
	}
	public static void main(String[] args) {
		new mypagesMain(); 
	}
}
