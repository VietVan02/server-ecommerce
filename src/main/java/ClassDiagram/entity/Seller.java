package ClassDiagram.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_user_seller")
public class Seller  {

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
	private List<Order> orders;

	@Column(name = "cccd")
	private String cccd;

	@Column(name = "exp") // 0: < 1 năm, 1: 1-2 năm, 2: 2-3 năm, 3: trên 3 năm
	private Integer exp;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

}
