package one;

public class SoftwareResource {

	String name;
	String manufacturer;
	String yearOfPublication;
	String version;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(String yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public SoftwareResource(String name, String manufacturer, String yearOfPublication, String version) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.yearOfPublication = yearOfPublication;
		this.version = version;
	}

	@Override
	public String toString() {
		return "SoftwareResource [name=" + name + ", manufacturer=" + manufacturer + ", yearOfPublication="
				+ yearOfPublication + ", version=" + version + "]";
	}

}
