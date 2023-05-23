package ClassDiagram.entity;

import com.example.demo.common.Erole;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_role")
public class Role   {

	@Enumerated(EnumType.STRING)
	@Column(name = "name")
	private Erole name;

	@ManyToMany(mappedBy = "roles")
	private List<User> users = new ArrayList<User>();
	
	public Role() {}

	public Role(Erole name) {
		super();
		this.name = name;
	}



	public Erole getName() {
		return name;
	}

	public void setName(Erole name) {
		this.name = name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	

}
