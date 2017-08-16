
public class LightOffC implements Command {
	Light light;
	
	public LightOffC(Light light){
		this.light = light;
	}
	@Override
	public void execute() {
		light.off();
	}
	
}
