package com.example.project.practical.model;

import java.sql.Date;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

import com.example.project.practical.pojo.MessageSentData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SqlResultSetMapping(
		name = "messageSentmapping",
		classes = {@ConstructorResult(
					targetClass = MessageSentData.class,
					columns = {
							@ColumnResult(name = "gtg_id"),
							@ColumnResult(name = "gt_noidung"),
							@ColumnResult(name = "gt_trangthai"),
							@ColumnResult(name = "gtg_noigui"),
							@ColumnResult(name = "gtg_ngaygui"),
							@ColumnResult(name = "gtg_ngayht"),
							
					}
				
				
				)
	
		}
		
)
@NamedNativeQuery(
		name = "MessageSent.getAllMessageSents", 
		query = "select gtg.gtg_id, gt.gt_noidung, gt.gt_trangthai, gtg.gtg_noigui, gtg.gtg_ngaygui, gtg.gtg_ngayht "
				+ "from goi_tin gt"
				+ " inner join goi_tin_gui gtg on gt.gt_id=gtg.gt_id",
			resultSetMapping = "messageSentmapping",
			resultClass = MessageSentData.class
		)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageSent {
	@Id
	
	private int gtg_id;
	private int gt_id;
	private String gtg_noigui;
	private Date gtg_ngaygui;
	private Date gtg_ngayht;

}
