package packageTwo;
import packageOne.Base;
public class Derived extends Base{
	public void doshow()
	{ 
	 display();
	 }
	 public static void main(String[] args){
		 Derived der = new Derived();
		 der.display();
		 der.doshow();
	 }
}
