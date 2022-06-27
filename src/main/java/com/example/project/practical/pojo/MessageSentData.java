package com.example.project.practical.pojo;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MessageSentData {
	private int gtg_id;
	private String gt_noidung;
	private String gt_trangthai;
	private String gtg_noigui;
	private Date gtg_ngaygui;
	private Date gtg_ngayht;

}
