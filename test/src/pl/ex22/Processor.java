package pl.ex22;

public class Processor {
	private String model;
	private String brand;
	private String serial;
	
	public Processor(String model, String brand, String serial) {
		super();
		this.model = model;
		this.brand = brand;
		this.serial = serial;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
}
