package com.example.project.practical.model;

import java.sql.Date;


import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.example.project.practical.pojo.MessageReceivedData;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@SqlResultSetMapping(
		name = "messageReceivedmapping",
		classes = {@ConstructorResult(
					targetClass = MessageReceivedData.class,
					columns = {
							@ColumnResult(name = "gtn_id"),
							@ColumnResult(name = "gt_noidung"),
							@ColumnResult(name = "lyc_ten"),
							@ColumnResult(name = "gt_trangthai"),
							@ColumnResult(name = "gtn_noinhan"),
							@ColumnResult(name = "gtn_ngaynhan"),
							
							
							
					}
				
				
				)
	
		}
		
)
@NamedNativeQuery(
		name = "MessageReceived.getAllMessageReceives", 
		query = "select gtn.gtn_id, gt.gt_noidung,lyc.lyc_ten, gt.gt_trangthai, gtn.gtn_noinhan, gtn.gtn_ngaynhan"
				+ " from goi_tin gt"
				+ " inner join loai_yeu_cau lyc on gt.lyc_ma = lyc.lyc_ma"
				+ " inner join goi_tin_nhan gtn on gt.gt_id=gtn.gt_id;",
			resultSetMapping = "messageReceivedmapping",
			resultClass = MessageReceivedData.class
		)

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "goi_tin_nhan")
public class MessageReceived {
	@Id
	private int gtn_id;
	private int gt_id;
	private String gtn_noinhan;
	private Date gtn_ngaynhan;
	  

}
