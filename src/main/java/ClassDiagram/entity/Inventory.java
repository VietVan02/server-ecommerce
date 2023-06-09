package ClassDiagram.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbl_inventory")
public class Inventory   {

	@Column(name = "total_import")
	private Integer total_import_item;

	@Column(name = "total_item")
	private Integer quantity_item;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id") // Liên kết với nhau qua khóa ngoại person_id
	private Product product;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "color_id") // Liên kết với nhau qua khóa ngoại person_id
	private Color color;

	@Column(name = "category_code")
	private String category_code;

	@Column(name = "display")
	private Integer display;

	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public Inventory(Integer total_import_item, Integer quantity_item, Product product, Color color,
                     String category_code) {
		super();
		this.total_import_item = total_import_item;
		this.quantity_item = quantity_item;
		this.product = product;
		this.color = color;
		this.category_code = category_code;
	}

	public Integer getTotal_import_item() {
		return total_import_item;
	}

	public void setTotal_import_item(Integer total_import_item) {
		this.total_import_item = total_import_item;
	}

	public Integer getQuantity_item() {
		return quantity_item;
	}

	public void setQuantity_item(Integer quantity_item) {
		this.quantity_item = quantity_item;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getCategory_code() {
		return category_code;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Integer getDisplay() {
		return display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
	}

}
