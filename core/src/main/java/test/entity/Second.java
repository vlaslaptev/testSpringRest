package test.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Second {

	private String firstField;
	private Integer secondField;
	private BigDecimal thirdField;

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

	public BigDecimal getThirdField() {
		return thirdField;
	}

	public void setThirdField(BigDecimal thirdField) {
		this.thirdField = thirdField;
	}
}
