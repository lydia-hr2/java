package aggregation;

public class Human {
	private String name;
	private Car car;

	public Human(String string, Object object) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, Car car) {
		this.name = name;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}

}
