package com.example.project.practical.pojo;

import java.sql.Date;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MessageReceivedData {
	
	private int gtn_id;
	private String gt_noidung;
	private String lyc_ten;
	private String gt_trangthai;
	private String gtn_noinhan;
	private Date gtn_ngaynhan;
	
	
	
	
	
	
	

}
