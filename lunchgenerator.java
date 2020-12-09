package lunchgenerator;
import javax.swing.*;
public class Lunchgenerator {
	public static void main(String[] agrs){
		int i = 0;
		int n = 0;
		String [] a = {"八方雲集","Mcdonald","thai food","銀咖喱","醉瓊樓","KFC","太興","譽居","韓館","tam"};	
		do{
			do{
				i = (int)(Math.random()*10);
			}while(i>(a.length-1));
			Object[] options ={ "OK", "Generate" };  
			n = JOptionPane.showOptionDialog(null, a[i]+"\nGenerate again？", "Lunch Generator",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		}while(n!=0);
	}	
}

