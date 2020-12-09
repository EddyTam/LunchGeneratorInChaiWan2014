package lunchgenerator;
import javax.swing.*;
public class Lunchgenerator {
	public static void main(String[] agrs){
		int counter = 0;
		int n = 0;
		String [] resterant = {"八方雲集","Mcdonald","thai food","銀咖喱","醉瓊樓","KFC","太興","譽居","韓館","tam"};	
		do{
			do{
				counter = (int)(Math.random()*10);
			}while(counter>(resterant.length-1));
			Object[] options ={ "OK", "Generate" };  
			n = JOptionPane.showOptionDialog(null, resterant[counter]+"\nGenerate again？", "Lunch Generator",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		}while(n!=0);
	}	
}

