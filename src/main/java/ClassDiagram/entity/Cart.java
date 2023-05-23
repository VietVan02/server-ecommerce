package ClassDiagram.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_cart")
public class Cart {

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	private List<CartDetail> cart_details;
	@Id
	private Long id;

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<CartDetail> getCart_details() {
		return cart_details;
	}

	public void setCart_details(List<CartDetail> cart_details) {
		this.cart_details = cart_details;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
