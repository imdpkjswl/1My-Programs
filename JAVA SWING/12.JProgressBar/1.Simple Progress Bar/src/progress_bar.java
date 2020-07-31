import javax.swing.*;

public class progress_bar {

	public static void iterate(JProgressBar progress) {    
		int i=0;
		while(i<=2000){    
			progress.setValue(i);    
		  	i=i+20;    
		  
		  	try{ Thread.sleep(150);// sleep 0.15 second 
		  		} catch(Exception e){}
		  	
		}    
	}    
	
	public static void main(String[] args) {
		    
		JFrame frame = new JFrame("Progress Bar");
		
		JProgressBar progress = new JProgressBar(0,2000);    
		    
		progress.setBounds(60,60,200,30);         
		//progress.setValue(0);     
		progress.setStringPainted(true);    
		frame.add(progress);    
	
		frame.setSize(350,200);    
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		iterate(progress); // call iterate, when we need to show.
		
		}     
}
