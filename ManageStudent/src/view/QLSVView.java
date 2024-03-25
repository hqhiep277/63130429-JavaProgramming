package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.QLSVModel;
import model.Tinh;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	
	public QLSVModel qlsvModel; 
	public JTextField countryTextField;
	public JTable table;
	public JTextField formName;
	public JTextField formID;
	public JTextField formBirth;
	public JTextField fieldMon1;
	public JTextField fieldMon2;
	public JTextField fieldMon3;
	public Object formQueQuan;
	public ButtonGroup sexGroupBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		this.qlsvModel = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 518);
        this.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("student.png")));
        
        Action action = new QLSVController(this);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(fileMenu);
		
		JMenu openItem = new JMenu("Open");
		openItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		fileMenu.add(openItem);
		
		JMenuItem closeItem = new JMenuItem("Close");
		closeItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		fileMenu.add(closeItem);
		
		JSeparator separator = new JSeparator();
		fileMenu.add(separator);
		
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		fileMenu.add(exitItem);
		
		JMenu aboutMenu = new JMenu("About");
		aboutMenu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(aboutMenu);
		
		JMenuItem aboutItem = new JMenuItem("About me");
		aboutItem.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		aboutMenu.add(aboutItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel countryLabel = new JLabel("Quê quán");
		countryLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		countryLabel.setBounds(10, 11, 66, 35);
		contentPane.add(countryLabel);
		
		countryTextField = new JTextField();
		countryTextField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		countryTextField.setBounds(270, 9, 99, 41);
		contentPane.add(countryTextField);
		countryTextField.setColumns(10);
		
		JLabel lblMSinhVin = new JLabel("Mã sinh viên");
		lblMSinhVin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMSinhVin.setBounds(188, 11, 81, 35);
		contentPane.add(lblMSinhVin);
		
		JButton btnNewButton = new JButton("Tìm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(379, 15, 76, 31);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 57, 445, 2);
		contentPane.add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(454, 75, -435, 2);
		contentPane.add(separator_1);
		
		JLabel lblDanhSchSinh = new JLabel("Danh sách sinh viên");
		lblDanhSchSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDanhSchSinh.setBounds(10, 61, 122, 35);
		contentPane.add(lblDanhSchSinh);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 sinh vi\u00EAn", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 107, 461, 118);
		contentPane.add(scrollPane);
		
		JComboBox comboBox_1 = new JComboBox();
		
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_1.addItem("");
		for(Tinh tinh : listTinh) {
			comboBox_1.addItem(tinh.getTenTinh());
		}
		
		comboBox_1.setBounds(83, 15, 81, 31);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 236, 445, 2);
		contentPane.add(comboBox_2);
		
		JLabel lblThngTinSinh = new JLabel("Thông tin sinh viên");
		lblThngTinSinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblThngTinSinh.setBounds(10, 230, 122, 35);
		contentPane.add(lblThngTinSinh);
		
		JLabel countryLabel_1 = new JLabel("Quê quán");
		countryLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		countryLabel_1.setBounds(10, 263, 66, 35);
		contentPane.add(countryLabel_1);
		
		JLabel countryLabel_1_1 = new JLabel("Họ và tên");
		countryLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		countryLabel_1_1.setBounds(10, 287, 66, 35);
		contentPane.add(countryLabel_1_1);
		
		JLabel countryLabel_1_2 = new JLabel("Mã Sinh Viên");
		countryLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		countryLabel_1_2.setBounds(10, 317, 66, 35);
		contentPane.add(countryLabel_1_2);
		
		JLabel countryLabel_1_2_1 = new JLabel("Ngày sinh");
		countryLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		countryLabel_1_2_1.setBounds(10, 342, 66, 35);
		contentPane.add(countryLabel_1_2_1);
		
		formName = new JTextField();
		formName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		formName.setColumns(10);
		formName.setBounds(83, 294, 99, 22);
		contentPane.add(formName);
		
		formID = new JTextField();
		formID.setFont(new Font("Tahoma", Font.PLAIN, 13));
		formID.setColumns(10);
		formID.setBounds(83, 324, 99, 22);
		contentPane.add(formID);
		
		formBirth = new JTextField();
		formBirth.setFont(new Font("Tahoma", Font.PLAIN, 13));
		formBirth.setColumns(10);
		formBirth.setBounds(83, 349, 99, 22);
		contentPane.add(formBirth);
		
		JComboBox formQueQuan = new JComboBox();
		
		ArrayList<Tinh> listTinh2 = Tinh.getDSTinh();
		formQueQuan.addItem("");
		for(Tinh tinh : listTinh2) {
			formQueQuan.addItem(tinh.getTenTinh());
		}
		
		formQueQuan.setBounds(83, 267, 81, 22);
		contentPane.add(formQueQuan);
		
		JLabel formSex = new JLabel("Giới tính");
		formSex.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formSex.setBounds(264, 263, 66, 35);
		contentPane.add(formSex);
		
		JLabel formMon1 = new JLabel("Môn 1");
		formMon1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formMon1.setBounds(264, 287, 66, 35);
		contentPane.add(formMon1);
		
		JLabel formMon2 = new JLabel("Môn 2");
		formMon2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formMon2.setBounds(264, 317, 66, 35);
		contentPane.add(formMon2);
		
		JLabel formMon3 = new JLabel("Môn 3");
		formMon3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		formMon3.setBounds(264, 342, 66, 35);
		contentPane.add(formMon3);
		
		fieldMon1 = new JTextField();
		fieldMon1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fieldMon1.setColumns(10);
		fieldMon1.setBounds(307, 296, 99, 22);
		contentPane.add(fieldMon1);
		
		fieldMon2 = new JTextField();
		fieldMon2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fieldMon2.setColumns(10);
		fieldMon2.setBounds(307, 326, 99, 22);
		contentPane.add(fieldMon2);
		
		fieldMon3 = new JTextField();
		fieldMon3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fieldMon3.setColumns(10);
		fieldMon3.setBounds(307, 351, 99, 22);
		contentPane.add(fieldMon3);
		
		JRadioButton rdBtnNam = new JRadioButton("Nam");
		rdBtnNam.setBounds(318, 271, 62, 23);
		contentPane.add(rdBtnNam);
		
		JRadioButton rdBtnNu = new JRadioButton("Nữ");
		rdBtnNu.setBounds(382, 271, 53, 23);
		contentPane.add(rdBtnNu);
		
		ButtonGroup sexGroupBtn = new ButtonGroup();
		sexGroupBtn.add(rdBtnNam);
		sexGroupBtn.add(rdBtnNu);
		
		JComboBox comboBox_2_1 = new JComboBox(this.qlsvModel.getDsThiSinh());
		comboBox_2_1.setBounds(10, 400, 445, 2);
		contentPane.add(comboBox_2_1);
		
		JButton btnThem = new JButton("Thêm");
		btnThem.addActionListener(action);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThem.setBounds(20, 410, 76, 31);
		contentPane.add(btnThem);
		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(action);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa.setBounds(106, 410, 76, 31);
		contentPane.add(btnXoa);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.addActionListener(action);
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCapNhat.setBounds(193, 410, 91, 31);
		contentPane.add(btnCapNhat);
		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(action);
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLuu.setBounds(293, 410, 76, 31);
		contentPane.add(btnLuu);
		
		JButton btnHuy = new JButton("Hủy ");
		btnHuy.addActionListener(action);
		btnHuy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHuy.setBounds(379, 410, 76, 31);
		contentPane.add(btnHuy);
		
		this.setVisible(true);
	}
	
	public void xoaForm() {
		fieldMon1.setText("");
		fieldMon2.setText("");
		fieldMon3.setText("");
		formBirth.setText("");
		formID.setText("");
		formName.setText("");
	}
}
