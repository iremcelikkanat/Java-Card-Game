package Kartoyun;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class kartBasketbol extends JButton {
	String ad;
	  int ikilik;
	    int ucluk;
	  int serbestAtis;
	
	public kartBasketbol(String ad,int ikilik,int ucluk,int serbestAtis) {
		this.ad=ad;
		this.ikilik=ikilik;
		this.ucluk=ucluk;
		this.serbestAtis=serbestAtis;
	}
	
	public kartBasketbol(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	public kartBasketbol(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public kartBasketbol(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public kartBasketbol(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}

}
