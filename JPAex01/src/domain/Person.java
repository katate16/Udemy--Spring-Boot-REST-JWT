package domain;
import java.io.Serializable;
import java.text.MessageFormat;

public class Person implements Serializable{
	private Integer Id;
	private String Name;
	private String Email;
	
	public Person() {}

	public Person(Integer id, String name, String email) {
		super();
		Id = id;
		Name = name;
		Email = email;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public String toString() {
		return MessageFormat.format("Person [id = {0}, name = {1}, email = {2}]", Id, Name, Email);
	}
	
}