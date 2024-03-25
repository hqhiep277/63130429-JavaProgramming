package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JPasswordField txtPass;
	 public LoginForm() {
	        setTitle("FORM ĐĂNG NHẬP");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 450, 300);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        JLabel lblNewLabel = new JLabel("Form Đăng Nhập");
	        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        lblNewLabel.setBounds(146, 11, 183, 42);
	        contentPane.add(lblNewLabel);
	        
	        JLabel lblTnngNhp = new JLabel("Tên Đăng Nhập");
	        lblTnngNhp.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        lblTnngNhp.setBounds(36, 96, 119, 42);
	        contentPane.add(lblTnngNhp);
	        
	        txtName = new JTextField();
	        txtName.setBounds(165, 96, 152, 31);
	        contentPane.add(txtName);
	        txtName.setColumns(10);
	        
	        JLabel lblMtKhu = new JLabel("Mật Khẩu");
	        lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        lblMtKhu.setBounds(46, 149, 119, 42);
	        contentPane.add(lblMtKhu);
	        
	        txtPass = new JPasswordField();
	        txtPass.setBounds(165, 151, 148, 31);
	        contentPane.add(txtPass);
	        
	        JButton btnLogin = new JButton("Đăng Nhập");
	        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        btnLogin.setBounds(178, 219, 139, 31);
	        contentPane.add(btnLogin);

	   
	        btnLogin.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String username = txtName.getText();
	                String password = new String(txtPass.getPassword());

	           
	                if (username.equals("63CNTT") && password.equals("123")) {
	                   
	                    Home homeFrame = new Home();
	                    homeFrame.setVisible(true);
	                    dispose(); 
	                } else {
	                    
	                    JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng. Vui lòng thử lại.", "Lỗi Đăng Nhập", JOptionPane.ERROR_MESSAGE);
	                    txtPass.setText("");
	                }
	            }
	        });
	    }

	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    LoginForm frame = new LoginForm();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }
	}