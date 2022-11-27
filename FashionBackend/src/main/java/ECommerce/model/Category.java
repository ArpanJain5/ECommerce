package ECommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {
	
	@Id
	@GeneratedValue
	int categoryID;
	String categoryName, categoryDesk;
	
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDesk() {
		return categoryDesk;
	}
	public void setCategoryDesk(String categoryDesk) {
		this.categoryDesk = categoryDesk;
	}
	
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", categoryName=" + categoryName + ", categoryDesk="
				+ categoryDesk + "]";
	}
}
