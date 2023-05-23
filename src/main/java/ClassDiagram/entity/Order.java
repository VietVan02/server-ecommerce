package ClassDiagram.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_order")
public class Order  {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "seller")
	private Seller seller;

	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private Payment payment;

	@Column(name = "total_price")
	private Long total_price;

	@Column(name = "discount_price")
	private Long discount_price;


	@Column(name = "total_item")
	private Integer total_item;

	@Column(name = "order_info")
	private String orderInfo;

	@Column(name = "status")
	private Integer status;

	@Column(name = "create_ship_date")
	private String createdShipDate;

	@Column(name = "complete_date")
	private String completeDate;

	@JsonManagedReference
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<OrderDetail> orderDetails = new ArrayList<>();

	public Order() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getTotal_price() {
		return total_price;
	}

	public void setTotal_price(Long total_price) {
		this.total_price = total_price;
	}

	public Long getDiscount_price() {
		return discount_price;
	}

	public void setDiscount_price(Long discount_price) {
		this.discount_price = discount_price;
	}

	public Integer getTotal_item() {
		return total_item;
	}

	public void setTotal_item(Integer total_item) {
		this.total_item = total_item;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}



	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}


	public void setCreatedShipDate(String createdShipDate) {
		this.createdShipDate = createdShipDate;
	}

	public String getCompleteDate() {
		return completeDate;
	}

	public void setCompleteDate(String completeDate) {
		this.completeDate = completeDate;
	}


}
