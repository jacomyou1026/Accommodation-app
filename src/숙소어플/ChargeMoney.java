package 숙소어플;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ChargeMoney  extends JFrame  {
	JOptionPane jp = new JOptionPane();
	int charge_moeny=0; // 사용가능한 코인
	int data=0; //입력 충전
	JTextField jf=null;
	JButton btn1=null;
	JButton btn2 = null;
	JLabel labelname  =null;
	JLabel getmoney =null;
	JLabel jl2 =new JLabel(""+charge_moeny);
	//충전하기 
	void add() {
				int data =Integer.parseInt(jf.getText());
				charge_moeny+=data;
				JOptionPane.showMessageDialog(null, data+"원 충전하였습니다.");
				mypagesMain.money.setText(""+charge_moeny);
				jl2.setText(""+charge_moeny);
			}
	
	//취소하기
	void sub() {
			int data =Integer.parseInt(jf.getText());
			if(charge_moeny-data>=0) {
				charge_moeny-=data;
				JOptionPane.showMessageDialog(null, data+"원 취소하였습니다.");
				mypagesMain.money.setText(""+charge_moeny);
				jl2.setText(""+charge_moeny);
			}
			else {
				JOptionPane.showMessageDialog(null, "최대 환불가능한 금액은 "+charge_moeny+"원 입니다.");
			}
		
	}
	

	public void ChargeMoney(){
		setSize(500,700);
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setVisible(true);
		
		setTitle("충전");
		setBackground(null);
		
		// jpanel
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBounds(45,100, 400,500);
		jp.setBackground(new Color(255,255,255));
		jp.setBorder(new LineBorder(new Color(248,248,248),2,true));

		
		
		//jp2
		JPanel jp2 = new JPanel();
		jp2.setBackground(new Color(255,255,255));
		jp2.setBorder(new LineBorder(new Color(248,248,248),2,true));
		
		jp2.setLayout(null);
		jp2.setBounds(30,80,350,100);
			
		
		JLabel jl1 = new JLabel("사용가능한 코인");

		
		//총 보유 라벨
		jl1.setBounds(50,25,200,50);
		jl2.setBounds(230,25,100,50);
		jl2.setForeground(new Color(200,61,102));
		
		jl1.setFont(new Font("고딕", Font.BOLD, 17));
		jl2.setFont(new Font("고딕", Font.BOLD, 20));
		
		
	
		labelname = new JLabel(" 님 안녕하십니까?");
		getmoney = new JLabel("충전금액을 입력해주세요?");
		jf = new JTextField("insert coin please (원)생략");
		jf.setBorder(new LineBorder(new Color(248,248,248),2,false));

		//placeholder
		jf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText(null);
			}
		});
	
		//버튼
		btn1 = new JButton("충전하기");
		btn2 = new JButton("취소하기");
		
	
		//크기설정
		labelname.setBounds(125,10, 300, 50);
		getmoney.setBounds(90, 150, 300, 150);
		jf.setBounds(30, 260, 350, 50);
		btn1.setBounds(30, 340, 170, 50);
		btn2.setBounds(210, 340, 170, 50);
		btn1.setBackground(new Color(255,255,255));
		btn2.setBackground(new Color(255,255,255));
		btn1.setForeground(new Color(115,160,227)); 
		btn2.setForeground(new Color(115,160,227)); 
		btn1.setBorder(new LineBorder(new Color(115,160,227),2,true));
		btn2.setBorder(new LineBorder(new Color(115,160,227),2,true));
	
		labelname.setFont(new Font("고딕", Font.BOLD, 20));
		getmoney.setFont(new Font("고딕", Font.BOLD, 20));
	
		jp.add(labelname);
		jp.add(getmoney);
		jp.add(jp2);
		jp.add(jf);
		jp.add(btn1);
		jp.add(btn2);
		jp2.add(jl1);
		jp2.add(jl2);

		//버튼 이벤트 
		ActionListener al =new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = e.getActionCommand();
				switch (s){
				case "충전하기":
					add();
				
					break;
				case "취소하기":
					
					if(charge_moeny-data>=0) {
							sub();
							
					
					}else{
						JOptionPane.showMessageDialog(null, "최대 환불가능한 금액은 "+charge_moeny+"원 입니다.");
						
					}
					break;

				}
			}
		};
		


		btn1.addActionListener(al);
		btn2.addActionListener(al);
		
		add(jp);

	}

	
}
