package sg.edu.nus.iss.vmcs.uifactory;
/**
 * @version 1.0
 * @author Chen Changfeng
 */
import java.awt.event.ActionListener;

public interface AbstractTextField extends VMCSComponent {
	
	public void setText(String text);
	public void setColumns(int length);
	public void setEditable(boolean editable);
	public void setBackground(int r, int g, int b);
	public void setForeground(int r, int g, int b);
	public void setEchoChar(char c);
	public void addEventHandler(VMCSEventHandler e);

}
