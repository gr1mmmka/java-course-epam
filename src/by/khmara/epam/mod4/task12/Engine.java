package by.khmara.epam.mod4.task12;

public class Engine {
	private boolean isFilled;
	private int engineVolume;
	
	public Engine(boolean isFilled, int engineVolume) {
		super();
		this.isFilled = isFilled;
		this.engineVolume = engineVolume;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public int getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(int engineVolume) {
		this.engineVolume = engineVolume;
	}
	
	
}
