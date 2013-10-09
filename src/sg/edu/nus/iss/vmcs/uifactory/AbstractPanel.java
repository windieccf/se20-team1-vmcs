package sg.edu.nus.iss.vmcs.uifactory;



public interface AbstractPanel extends VMCSComponent {
	public void add(VMCSComponent component);
	public void show();
	public void setLayout(Object layout);
	public void add(String name, VMCSComponent component);
}
