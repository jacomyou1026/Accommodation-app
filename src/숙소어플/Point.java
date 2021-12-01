package 숙소어플;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Point extends JFrame{
	JPanel jp1 =new JPanel(); //사용가능한 포인트 부분
	JPanel jp2 =new JPanel(); //전체내역 부분
	JLabel jl = new JLabel("포인트");
	JLabel Useable_point = new JLabel("사용 가능한 포인트");
	JLabel total = new JLabel("전체내역");
	
	
	//포인트 점수 
	int point=0;
	//포인트 전체내역부분 - 호텔명과 포인트 넣기.
	void point_total() {
		
	}
	//사용가능한 포인트에 포인트 점수 넣기
	
	
	public Point() {
		setSize(500,700);
		
		setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);

		setTitle("포인트");
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
		
		jl.setFont(new Font("고딕", Font.BOLD, 20));
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
