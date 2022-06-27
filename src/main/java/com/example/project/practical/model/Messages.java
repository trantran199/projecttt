package com.example.project.practical.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor



public class Messages {
	@Id

	private int gt_id;
	
	private String gt_noidung;
	private String gt_trangthai;
	

}
