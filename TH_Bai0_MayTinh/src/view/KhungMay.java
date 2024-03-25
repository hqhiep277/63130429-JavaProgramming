package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KhungMay extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtRes;

    public KhungMay() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 479, 331);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Nhập số b");
        lblNewLabel.setBounds(57, 150, 72, 20);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Nhập số a");
        lblNewLabel_1.setBounds(57, 102, 72, 20);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        contentPane.add(lblNewLabel_1);
        
        txtA = new JTextField();
        txtA.setBounds(139, 104, 164, 20);
        contentPane.add(txtA);
        txtA.setColumns(10);
        
        txtB = new JTextField();
        txtB.setColumns(10);
        txtB.setBounds(139, 152, 164, 20);
        contentPane.add(txtB);
        
        JButton btnNewButton = new JButton("Cộng");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                int result = a + b;
                txtRes.setText(String.valueOf(result));
            }
        });
        btnNewButton.setBounds(40, 223, 89, 23);
        contentPane.add(btnNewButton);
        
        JButton btnTr = new JButton("Trừ");
        btnTr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                int result = a - b;
                txtRes.setText(String.valueOf(result));
            }
        });
        btnTr.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnTr.setBounds(148, 223, 89, 23);
        contentPane.add(btnTr);
        
        JButton btnNhn = new JButton("Nhân");
        btnNhn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                int result = a * b;
                txtRes.setText(String.valueOf(result));
            }
        });
        btnNhn.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNhn.setBounds(247, 225, 89, 23);
        contentPane.add(btnNhn);
        
        JButton btnChia = new JButton("Chia");
        btnChia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                int result = a / b;
                txtRes.setText(String.valueOf(result));
            }
        });
        
        btnChia.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnChia.setBounds(346, 225, 89, 23);
        contentPane.add(btnChia);
        
        JLabel lblNewLabel_1_1 = new JLabel("Kết quả:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel_1_1.setBounds(202, 29, 72, 20);
        contentPane.add(lblNewLabel_1_1);
        
        txtRes = new JTextField();
        txtRes.setEditable(false);
        txtRes.setColumns(10);
        txtRes.setBounds(267, 31, 89, 20);
        contentPane.add(txtRes);
    }
}
