package ClassDiagram.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tbl_brand")
public class Brand {

	@Column(name = "name")
	private String name;

	@Column(name = "code")
	private String code;

	@Column(name = "made_in")
	private String madeIn;

	@Column(name = "display")
	private Integer display; // 1 : show, 0: hidden

	@JsonIgnore
	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
	private Set<Product> products;

	public Brand() {
		super();
	}

	public Brand(String name) {
		super();
		this.name = name;
	}

	public Brand(String name, Set<Product> products) {
		super();
		this.name = name;
		this.products = products;
	}

	public Brand(String name, String code, String madeIn) {
		super();
		this.name = name;
		this.code = code;
		this.madeIn = madeIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

	public Integer getDisplay() {
		return display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
