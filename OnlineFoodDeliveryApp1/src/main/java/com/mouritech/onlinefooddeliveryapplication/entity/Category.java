package com.mouritech.onlinefooddeliveryapplication.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "catid")
	private String catId;
	@Column(name = "categoryname")
	private String categoryName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemid")
	private List<Item> item;

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
	

	public Category(String catId, String categoryName, List<Item> item) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
		this.item = item;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + ", item=" + item + "]";
	}

}

