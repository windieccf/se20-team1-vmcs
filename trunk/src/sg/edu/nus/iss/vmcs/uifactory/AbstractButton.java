package sg.edu.nus.iss.vmcs.uifactory;

public interface AbstractButton extends VMCSComponent {
	
	public void addEventHandler(VMCSEventHandler e);
	public void setActive(boolean bool);

}
