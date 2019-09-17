/**
 * Sample Skeleton for 'calcView.fxml' Controller Class
 */

package calculater;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class calcViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Screen"
    private TextField Screen; // Value injected by FXMLLoader

    @FXML // fx:id="equal"
    private Button equal; // Value injected by FXMLLoader


    @FXML
    void Back(MouseEvent event) 
    {

    }

    @FXML
    void Clear(MouseEvent event) 
    {
      Screen.clear();
      num1 = 0;
      num2 = 0;
      num = 0;
    }
    
    @FXML
    void half(MouseEvent event) 
    {
    	op = 'x';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText("x");
        Screen.clear();
    }

    @FXML
    void modulus(MouseEvent event) 
    {
    	op = '%';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText("%");
        Screen.clear();
    }

    @FXML
    void decide(MouseEvent event) 
    {
    	op = 'd';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText("d");
        Screen.clear();
    }
    
    @FXML
    void square(MouseEvent event) 
    {
    	op = 's';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText("s");
        Screen.clear();
    }

    @FXML
    void root(MouseEvent event) 
    {
    	op = 'r';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText("-");
        Screen.clear();
    }
    
    @FXML
    void Divide(MouseEvent event) 
    {
    	op = '/';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText("-");
        Screen.clear();
    }

    @FXML
    void Multiply(MouseEvent event) 
    {
    	op = '*';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText("-");
        Screen.clear();
    }
    
    @FXML
    void Subtraction(MouseEvent event) 
    {
    	// Screen.setText(String.valueOf(add));
    	op = '-';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText("-");
        Screen.clear();
    }
    
    @FXML
    void Addition(MouseEvent event)
    {
    	op = '+';
      num1 = Double.parseDouble(Screen.getText());
      Screen.appendText("+");
      Screen.clear();
    }
    
    @FXML
    void Dot(MouseEvent event) 
    {
    	op = '.';
        num1 = Double.parseDouble(Screen.getText());
        Screen.appendText(".");
    }
    
    double num1 = 0;
    char op;
    double num2 = 0;
    double num = 0;

//                    ==============================******************================================
    
    
    @FXML
    void Calculation(MouseEvent event) 
    {
         switch(op)
         {
         case '+':
        	 num2 = Integer.parseInt(Screen.getText());
        	 num = num1 + num2;
        	 Screen.setText(String.valueOf(num));
        	 num1 = 0; num2 = 0;
        	 break;
         case '-':
        	 num2 = Integer.parseInt(Screen.getText());
        	 num = num1 - num2;
        	 Screen.setText(String.valueOf(num));
        	 num1 = 0; num2 = 0;
        	 break;
         case '*':
        	 num2 = Integer.parseInt(Screen.getText());
        	 num = num1 * num2;
        	 Screen.setText(String.valueOf(num));
        	 num1 = 0; num2 = 0;
        	 break;
         case '/':
        	 num2 = Integer.parseInt(Screen.getText());
        	 num = num1 / num2;
        	 Screen.setText(String.valueOf(num));
        	 num1 = 0; num2 = 0;
        	 break;
         case 'x':
        	 num = num1 / 2;
        	 Screen.setText(String.valueOf(num));
        	 num1 = 0; num2 = 0;
        	 break;
         case '%':
        	 num2 = Integer.parseInt(Screen.getText());
        	 num = num1 % num2;
        	 Screen.setText(String.valueOf(num));
        	 num1 = 0; num2 = 0;
        	 break;
         case 'd':
        	 num = num1*(-1);
        	 Screen.setText(String.valueOf(num));
        	 num1 = 0; num2 = 0;
        	 break;
         case 'r':
        	 num = num1;
        	 Screen.setText(String.valueOf(Math.sqrt(num)));
        	 num1 = 0; num2 = 0;
        	 break;
         case 's':
        	 num2 = Integer.parseInt(Screen.getText());
        	 num = num1;
        	 Screen.setText(String.valueOf(Math.pow(num, num2)));
        	 num1 = 0; num2 = 0;
        	 break;
         case '.':
        	 num2 = Integer.parseInt(Screen.getText());
        	 num = num1;
        	 Screen.setText(String.valueOf(num));
        	 num1 = 0; num2 = 0;
         }
    }

    @FXML
    void nine(MouseEvent event) 
    {
       Screen.appendText("9");
    }
    
    @FXML
    void eight(MouseEvent event) 
    {
    	Screen.appendText("8");
    }

    @FXML
    void seven(MouseEvent event) 
    {
    	Screen.appendText("7");
    }

    @FXML
    void six(MouseEvent event) 
    {
    	Screen.appendText("6");
    }

    @FXML
    void five(MouseEvent event)
    {
    	Screen.appendText("5");
    }

    @FXML
    void four(MouseEvent event)
    {
    	Screen.appendText("4");
    }

    @FXML
    void three(MouseEvent event) 
    {
    	Screen.appendText("3");
    }

    @FXML
    void two(MouseEvent event) 
    {
    	Screen.appendText("2");
    }
    
    @FXML
    void one(MouseEvent event) 
    {
    	Screen.appendText("1");
    }

    @FXML
    void zero(MouseEvent event) 
    {
    	Screen.appendText("0");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() 
    {
     
    }
}
