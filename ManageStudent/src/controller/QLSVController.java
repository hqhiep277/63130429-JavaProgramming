package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import view.QLSVView;

public class QLSVController implements Action {
	
	private QLSVView qlsvView;
	
	

	public QLSVController(QLSVView qlsvView) {
	
		this.qlsvView = qlsvView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog(qlsvView, cm);
		if(cm.equals("Thêm")) {
			this.qlsvView.xoaForm();
			this.qlsvView.qlsvModel.setLuaChon("Thêm");
		} else if(cm.equals("Lưu")) {
			try {
				int id = Integer.valueOf(this.qlsvView.formID.getText());
				String ten = this.qlsvView.formName.getText();
				int que = this.qlsvView.formQueQuan.getSelectedIndex();
				Date ngaySinh = new Date(this.qlsvView.formBirth.getText());
				boolean sex = true;
				String pickSex = this.qlsvView.sexGroupBtn.getSelection()+"";
				if(pickSex.equals("Name")) {
					sex = true;
				} else if(pickSex.equals("Nữ")) {
					sex = false;
				}
				
				float mon1 = Float.valueOf(this.qlsvView.fieldMon1.getText());
				float mon2 = Float.valueOf(this.qlsvView.fieldMon2.getText());
				float mon3 = Float.valueOf(this.qlsvView.fieldMon3.getText());
				
				if(this.qlsvView.qlsvModel.getLuaChon().equals("") || this.qlsvView.qlsvModel.getLuaChon().equals("Thêm")) {
					
				} else if(this.qlsvView.qlsvModel.getLuaChon().equals("Cập nhật")) {
					
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

}
