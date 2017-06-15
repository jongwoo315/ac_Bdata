package ldg.mybatis.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("Serial") // serial = 데이터를 String으로 변경하는 과정
public class Comment implements Serializable{	// Serializable = 데이터를 자동으로 변환시켜주는 과정
	private Long commentNo;
	private String userId;
	private Date regDate;
	private String commentContent;
	
	public Comment(){}

	public Comment(Long commentNo, String userId, Date regDate, String commentContent){
		this.commentNo = commentNo;
		this.userId = userId;
		this.regDate = regDate;
		this.commentContent = commentContent;
	}

	public Long getCommentNo() {return commentNo;}
	public String getUserId() {return userId;}
	public Date getRegDate() {return regDate;}
	public String getCommentContent() {return commentContent;}

	public void setCommentNo(Long commentNo) {this.commentNo = commentNo;}
	public void setUserId(String userId) {this.userId = userId;}
	public void setRegDate(Date regDate) {this.regDate = regDate;}
	public void setCommentContent(String commentContent) {this.commentContent = commentContent;}
}
