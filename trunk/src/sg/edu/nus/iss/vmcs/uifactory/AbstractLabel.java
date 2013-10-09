package sg.edu.nus.iss.vmcs.uifactory;

public interface AbstractLabel extends VMCSComponent {
	
	public int getAlignment();
	public String getText();
	public void setAlignment(int alignment);
	public void setText(String text);

}
