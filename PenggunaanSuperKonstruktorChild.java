public class PenggunaanSuperKonstruktorChild extends PenggunaanSuperKonstruktor {
int age;	
	PenggunaanSuperKonstruktorChild (int umur) {
		super (umur);
	}
	
	public static void main (String args [] ) {
		PenggunaanSuperKonstruktorChild s = new PenggunaanSuperKonstruktorChild (24);
		s.getAge();
	}
}