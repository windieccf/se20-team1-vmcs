package sg.edu.nus.iss.vmcs.uifactory;
/**
 * @version 1.0
 * @author Chen Changfeng
 */
public interface AbstractButton extends VMCSComponent {
	
	public void addEventHandler(VMCSEventHandler e);
	public void setActive(boolean bool);

}
