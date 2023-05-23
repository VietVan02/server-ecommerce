package ClassDiagram.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_product")
public class Product  {

	@Column(name = "type")
	private Integer type;

	@Column(name = "name") // 1, 2, 3
	private String name;

	@Column(name = "slug")
	private String slug;

	@Column(name = "description", columnDefinition = "TEXT") // 1, 2, 3
	private String description;

	@Column(name = "price") // 1, 2, 3 // gia thuc te ban ra
	private Long price;

	@Column(name = "main_image")
	private String mainIamge;



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id") // 1, 2, 3
	private Category category;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brand_id") // 1, 2, 3
	private Brand brand;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id") // 1, 2, 3
	private Supplier supplier;

//	----------------	INVENTORY	--------------------
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Inventory> inventories;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<Image> images; // 1, 2, 3

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
	private List<Comment> comments;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderDetail> orderDetails = new ArrayList<>();

	public Product() {
		super();
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}


	public String getMainIamge() {
		return mainIamge;
	}

	public void setMainIamge(String mainIamge) {
		this.mainIamge = mainIamge;
	}



	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Inventory> getInventories() {
		return inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}


}
