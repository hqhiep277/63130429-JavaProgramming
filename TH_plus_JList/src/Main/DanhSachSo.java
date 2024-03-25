package Main;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DanhSachSo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNhapSo;
    private DefaultListModel<Integer> listModel;
    private JList<Integer> listCacSo;

    public DanhSachSo() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("Chọn tác vụ");

        JButton btnToDenSoChan = new JButton("Tô đen số Chẵn");
        JButton btnToDenSoNguyenTo = new JButton("Tô đen số nguyên tố");
        JButton btnBTen = new JButton("Bỏ tô đen");
        JButton btnToDenSoLe = new JButton("Tô đen số Lẻ");
        JButton btnXaCcGi = new JButton("Xóa các giá trị tô đen");
        JButton btnTinhTong = new JButton("Tính tổng các số trong danh sách");

        listModel = new DefaultListModel<>();
        listCacSo = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(listCacSo);

        JLabel lblNhpThngTin = new JLabel("Nhập thông tin");

        JButton btnNhap = new JButton("Nhập");
        txtNhapSo = new JTextField();
        txtNhapSo.setColumns(10);

        JButton btnClose = new JButton("Đóng");

        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(5)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addComponent(btnToDenSoNguyenTo)
                        .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnToDenSoChan, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnToDenSoLe, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBTen, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXaCcGi, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTinhTong))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(btnNhap, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(txtNhapSo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addGap(10)
                            .addComponent(lblNhpThngTin, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClose, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addGap(32)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel)
                        .addComponent(lblNhpThngTin))
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addGap(10)
                            .addComponent(btnToDenSoChan)
                            .addGap(11)
                            .addComponent(btnToDenSoLe)
                            .addGap(11)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(btnToDenSoNguyenTo)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(btnNhap)
                                .addComponent(txtNhapSo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addGap(11)
                    .addComponent(btnBTen)
                    .addGap(4)
                    .addComponent(btnXaCcGi)
                    .addGap(11)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(btnTinhTong)
                        .addComponent(btnClose)))
        );
        contentPane.setLayout(gl_contentPane);
        btnNhap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(txtNhapSo.getText());
                    listModel.addElement(number);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(contentPane, "Vui lòng nhập số nguyên", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
                txtNhapSo.setText("");
            }
        });

        btnToDenSoChan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorEvenNumbers();
            }
        });

        btnToDenSoLe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorOddNumbers();
            }
        });

        btnToDenSoNguyenTo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPrimeNumbers();
            }
        });

        btnBTen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearSelection();
            }
        });

        btnXaCcGi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearList();
            }
        });

        btnTinhTong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateSum();
            }
        });

        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void colorEvenNumbers() {
        ArrayList<Integer> selectedIndices = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            if (listModel.get(i) % 2 == 0) {
                selectedIndices.add(i);
            }
        }
        listCacSo.setSelectedIndices(selectedIndices.stream().mapToInt(Integer::intValue).toArray());
    }

    private void colorOddNumbers() {
        ArrayList<Integer> selectedIndices = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            if (listModel.get(i) % 2 != 0) {
                selectedIndices.add(i);
            }
        }
        listCacSo.setSelectedIndices(selectedIndices.stream().mapToInt(Integer::intValue).toArray());
    }

    private void colorPrimeNumbers() {
        ArrayList<Integer> selectedIndices = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            if (isPrime(listModel.get(i))) {
                selectedIndices.add(i);
            }
        }
        listCacSo.setSelectedIndices(selectedIndices.stream().mapToInt(Integer::intValue).toArray());
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void clearSelection() {
        listCacSo.clearSelection();
    }

    private void clearList() {
        listModel.removeAllElements();
    }

    private void calculateSum() {
        int sum = 0;
        for (int i = 0; i < listModel.getSize(); i++) {
            sum += listModel.get(i);
        }
        JOptionPane.showMessageDialog(contentPane, "Tổng các số trong danh sách là: " + sum, "Tính tổng", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DanhSachSo frame = new DanhSachSo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
