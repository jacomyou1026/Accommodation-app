package 숙소어플;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class totalReserve {
 public  void totalReserve() {
	// TODO Auto-generated constructor stub
		JFrame frame = new JFrame();
		frame.setTitle("총 예매내역");
		frame.setLocationRelativeTo(null);
		DefaultTableModel model=null;
		
		//Jtable만들기
		JButton btn =new JButton("후기작성");
		Object columnNames[] = { "호텔명","객실정보","방문일자"};
		model = new DefaultTableModel(columnNames,0);
		
		//row추가
		for (int i = 0; i < 2; i++) {
			model.addRow(new String[] {
					"df","Df","Df"
			});
			
		}
		
		final JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		
		//JLabel
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		table.setEnabled(false);

		frame.add(scrollPane);
		frame.setSize(500,700);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
}
 
 
	public static void main(String[] args) {
		new totalReserve();
	}


}

 