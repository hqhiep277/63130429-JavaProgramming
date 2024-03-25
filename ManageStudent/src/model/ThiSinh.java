package model;

import java.util.Date;
import java.util.Objects;

public class ThiSinh {
	 	private int maThiSinh;
	 	
	    private String tenThiSinh;

	    private Tinh queQuan;

	    private Date ngaySinh;

	    private boolean gioiTinh;

	    private float diem1, diem2, diem3;

		public ThiSinh(int maThiSinh, String tenThiSinh, Tinh queQuan, Date ngaySinh, boolean gioiTinh, float diem1,
				float diem2, float diem3) {
		
			this.maThiSinh = maThiSinh;
			this.tenThiSinh = tenThiSinh;
			this.queQuan = queQuan;
			this.ngaySinh = ngaySinh;
			this.gioiTinh = gioiTinh;
			this.diem1 = diem1;
			this.diem2 = diem2;
			this.diem3 = diem3;
		}

		public int getMaThiSinh() {
			return maThiSinh;
		}

		public void setMaThiSinh(int maThiSinh) {
			this.maThiSinh = maThiSinh;
		}

		public String getTenThiSinh() {
			return tenThiSinh;
		}

		public void setTenThiSinh(String tenThiSinh) {
			this.tenThiSinh = tenThiSinh;
		}

		public Tinh getQueQuan() {
			return queQuan;
		}

		public void setQueQuan(Tinh queQuan) {
			this.queQuan = queQuan;
		}

		public Date getNgaySinh() {
			return ngaySinh;
		}

		public void setNgaySinh(Date ngaySinh) {
			this.ngaySinh = ngaySinh;
		}

		public boolean isGioiTinh() {
			return gioiTinh;
		}

		public void setGioiTinh(boolean gioiTinh) {
			this.gioiTinh = gioiTinh;
		}

		public float getDiem1() {
			return diem1;
		}

		public void setDiem1(float diem1) {
			this.diem1 = diem1;
		}

		public float getDiem2() {
			return diem2;
		}

		public void setDiem2(float diem2) {
			this.diem2 = diem2;
		}

		public float getDiem3() {
			return diem3;
		}

		public void setDiem3(float diem3) {
			this.diem3 = diem3;
		}

		@Override
		public int hashCode() {
			return Objects.hash(diem1, diem2, diem3, gioiTinh, maThiSinh, ngaySinh, queQuan, tenThiSinh);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ThiSinh other = (ThiSinh) obj;
			return Float.floatToIntBits(diem1) == Float.floatToIntBits(other.diem1)
					&& Float.floatToIntBits(diem2) == Float.floatToIntBits(other.diem2)
					&& Float.floatToIntBits(diem3) == Float.floatToIntBits(other.diem3) && gioiTinh == other.gioiTinh
					&& maThiSinh == other.maThiSinh && Objects.equals(ngaySinh, other.ngaySinh)
					&& Objects.equals(queQuan, other.queQuan) && Objects.equals(tenThiSinh, other.tenThiSinh);
		}
		
		
	    
	    
}
