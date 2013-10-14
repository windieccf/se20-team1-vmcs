package sg.edu.nus.iss.vmcs.uifactory;
/**
 * @version 1.0
 * @author Chen Changfeng
 */
public abstract class UIFactory {

	private static UIFactory singleton;
	public static final int AWTFactory = 0;
	
	public static synchronized UIFactory getInstance() {
		
		//Default will be used AWT factory
		return getInstance(AWTFactory);
	}
	
	private static synchronized UIFactory getInstance(int type) {
		if (type == AWTFactory) {
			singleton = new AWTFactory();
		} else {
			throw new UnsupportedOperationException("Unsupport Factory Parameter");
		}
		return singleton;
	}
	
	public abstract AbstractButton createButton();
	public abstract AbstractLabel createLabel();
	public abstract AbstractPanel createPanel();
	public abstract AbstractTextField createTextField();
	
}
