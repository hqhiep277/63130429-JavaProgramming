package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class TinhToan extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JTextField txtX1;
    private JTextField txtX2;
    private JTextField txtSoNghiem;

    public TinhToan() {
        setTitle("TÍNH PTB2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Giải Phương Trình Bậc 2");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(123, 11, 206, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Số a");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(30, 82, 58, 14);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Số b");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1.setBounds(30, 111, 58, 14);
        contentPane.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_2 = new JLabel("Số c");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_2.setBounds(30, 138, 58, 14);
        contentPane.add(lblNewLabel_1_2);
        
        txtA = new JTextField();
        txtA.setBounds(76, 82, 67, 20);
        contentPane.add(txtA);
        txtA.setColumns(10);
        
        txtB = new JTextField();
        txtB.setColumns(10);
        txtB.setBounds(76, 111, 67, 20);
        contentPane.add(txtB);
        
        txtC = new JTextField();
        txtC.setColumns(10);
        txtC.setBounds(76, 136, 67, 20);
        contentPane.add(txtC);
        
        JButton btnGiai = new JButton("Giải");
        btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnGiai.setBounds(309, 110, 58, 23);
        contentPane.add(btnGiai);
        
        txtX1 = new JTextField();
        txtX1.setEditable(false);
        txtX1.setColumns(10);
        txtX1.setBounds(324, 194, 67, 20);
        contentPane.add(txtX1);
        
        txtX2 = new JTextField();
        txtX2.setEditable(false);
        txtX2.setColumns(10);
        txtX2.setBounds(324, 230, 67, 20);
        contentPane.add(txtX2);
        
        JLabel lblNewLabel_2 = new JLabel("X1");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(270, 194, 46, 14);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_2_1 = new JLabel("X2");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_2_1.setBounds(270, 233, 46, 14);
        contentPane.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_3 = new JLabel("Phương Trình");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(10, 219, 92, 14);
        contentPane.add(lblNewLabel_3);
        
        txtSoNghiem = new JTextField();
        txtSoNghiem.setEditable(false);
        txtSoNghiem.setColumns(10);
        txtSoNghiem.setBounds(105, 218, 128, 20);
        contentPane.add(txtSoNghiem);

        // Thêm mã xử lý cho nút Giải
        btnGiai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lấy giá trị của a, b, c từ các trường nhập liệu
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Double.parseDouble(txtC.getText());

                // Tính delta
                double delta = b * b - 4 * a * c;

                // Kiểm tra điều kiện và tính nghiệm
                if (delta > 0) {
                    // Hai nghiệm phân biệt
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    txtX1.setText(String.valueOf(x1));
                    txtX2.setText(String.valueOf(x2));
                    txtSoNghiem.setText("Có hai nghiệm phân biệt");
                } else if (delta == 0) {
                    // Nghiệm kép
                    double x = -b / (2 * a);
                    txtX1.setText(String.valueOf(x));
                    txtX2.setText(String.valueOf(x));
                    txtSoNghiem.setText("Có một nghiệm kép");
                } else {
                    // Vô nghiệm
                    txtX1.setText("");
                    txtX2.setText("");
                    txtSoNghiem.setText("Vô nghiệm");
                }
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TinhToan frame = new TinhToan();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
