package com.example.demo.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // 實體類與資料表對應(會自動建立資料表)
@Table(name = "room") // 若資料表名與實體類一致可以不用設定此行
public class Room {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)  // room_id 自動生成, 從 1 開始每次自動 +1 過號不補
	@Column(name = "room_id")
	private Integer roomId;
	
	@Column(name = "room_name", nullable = false, unique = true)
	private String roomName;
	
	@Column(name = "room_size", columnDefinition = "integer default 0")
	private Integer roomSize;
	
	
}
