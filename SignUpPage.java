import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class SignUpPage extends Frame implements ActionListener {
	TextField textField1=new TextField(20);
	TextField textField2=new TextField(20);
	TextField textField3=new TextField(20);
	TextField textField4=new TextField(20);
	Button button;
	
	//constructor
	SignUpPage(){
		//frame settings
		setTitle("Sign up page");
		setSize(350,100);
		setVisible(true);
		//setting layout
		setLayout(new FlowLayout());
		button=new Button("SIGN UP");
		//label Settings
		Label l1=new Label("First Name");
		Label l2=new Label("Last Name");
		Label l3=new Label("Email");
		Label l4=new Label("Phone no.");
		
	    l1.setAlignment(Label.CENTER);
	    l2.setAlignment(Label.CENTER);
	    l3.setAlignment(Label.CENTER);
	    l4.setAlignment(Label.CENTER);
	    
     	
		//adding the components in the frame
		add(button);
		add(l1);
		add(textField1);
    	add(l2);
    	add(textField2);
    	add(l3);
    	add(textField3);
    	add(l4);
    	add(textField4);
    	textField1.setText("First Name");
		textField2.setText("Last Name");
		textField3.setText("Email");
		textField4.setText("Phone no.");
    
		
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Username:"+textField1.getText()+" "+textField2.getText());
		System.out.println("Email:"+textField3.getText());
		System.out.println("Phone no:"+textField4.getText());
	}

    
	public static void main(String[] args) {
		SignUpPage demo=new SignUpPage();

	}

}