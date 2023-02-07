package ariketaLiburutegia;

import java.util.Scanner;

public class liburua extends liburutegia implements prestable {
	private boolean mailegua;

	public liburua() {
		super();
		this.mailegua=false;
	}
	public liburua (boolean m, int k, String i, int p) {
		super(k,i,p);
		this.mailegua=m;
	}
	public liburua (liburua l) {
		super();
		this.mailegua=l.mailegua;
	}
	public void LiburuaSortu (Scanner teklatua) {
		super.leer(teklatua);
		System.out.println("Utzita dago? (True/False)");
		this.mailegua=teklatua.nextBoolean();
	}
	@Override
	public String toString() {
		return super.toString() + "liburua [mailegua=" + mailegua + "]";
	}
	@Override
	public void mailegatu() {
		// TODO Auto-generated method stub
		this.mailegua=true;
	}
	@Override
	public void itzuli() {
		// TODO Auto-generated method stub
		this.mailegua=false;
	}
	@Override
	public boolean mailegatua() {
		// TODO Auto-generated method stub
		return this.mailegua;
	}
	public boolean isMailegua() {
		return mailegua;
	}
	public void setMailegua(boolean mailegua) {
		this.mailegua = mailegua;
	}
}