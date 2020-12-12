

package Kartoyun;

import java.awt.Button;
import java.awt.HeadlessException;
import java.awt.Label;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.Action;

public class kartT extends JButton  {

		String ad;
	   int servis;
	   int forhand;
	   int backhand;
	    
	public kartT(String ad,int forhand,int backhand,int servis) {
		this.ad=ad;
		this.servis=servis;
		this.forhand=forhand;
		this.backhand=backhand;
		
	}

public kartT() throws HeadlessException {
	// TODO Auto-generated constructor stub
}

public kartT(String text) throws HeadlessException {
	super(text);
	// TODO Auto-generated constructor stub
}




}
