package ���Ҿ���;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Point extends JFrame{
	JPanel jp1 =new JPanel(); //��밡���� ����Ʈ �κ�
	JPanel jp2 =new JPanel(); //��ü���� �κ�
	JLabel jl = new JLabel("����Ʈ");
	JLabel Useable_point = new JLabel("��� ������ ����Ʈ");
	JLabel total = new JLabel("��ü����");
	
	
	//����Ʈ ���� 
	int point=0;
	//����Ʈ ��ü�����κ� - ȣ�ڸ�� ����Ʈ �ֱ�.
	void point_total() {
		
	}
	//��밡���� ����Ʈ�� ����Ʈ ���� �ֱ�
	
	
	public Point() {
		setSize(500,700);
		
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

		setTitle("����Ʈ");
		jp1.setLayout(null);
		jp1.setBorder(new LineBorder(new Color(222,222,222),3,true));
		jp1.setBackground(Color.white);
		jp2.setLayout(null);
		jp2.setBackground(Color.white);
		jp2.setBorder(new LineBorder(new Color(222,222,222),3,true));	
		
		jl.setBounds(220,20,500,40);
		jp1.setBounds(20,70,450,100);
		jp2.setBounds(20,180,450,470);
		Useable_point.setBounds(70,35,150,30);
		total.setBounds(200,10,500,40);
		
		jl.setFont(new Font("���", Font.BOLD, 20));
		jp2.add(total);
		jp1.add(Useable_point);
		
		this.add(jp2);
		this.add(jl);
		this.add(jp1);
	}
	public static void main(String[] args) {
		new Point();
	}
}
