package com.example.project.practical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loai_yeu_cau")

public class Categories {
	@Id
	@GeneratedValue
	private int lyc_ma;
	private String lyc_ten;
	
	
	public int getLyc_ma() {
		return lyc_ma;
	}
	public void setLyc_ma(int lyc_ma) {
		this.lyc_ma = lyc_ma;
	}
	public String getLyc_ten() {
		return lyc_ten;
	}
	public void setLyc_ten(String lyc_ten) {
		this.lyc_ten = lyc_ten;
	}

}
