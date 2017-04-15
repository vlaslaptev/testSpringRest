package test.entity;

import javax.persistence.Entity;

@Entity
public class First extends AbstractEntity {

	private String firstField;
	private Integer secondField;

	public String getFirstField() {
		return firstField;
	}

	public void setFirstField(String firstField) {
		this.firstField = firstField;
	}

	public Integer getSecondField() {
		return secondField;
	}

	public void setSecondField(Integer secondField) {
		this.secondField = secondField;
	}
}
