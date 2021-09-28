package com.example.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection  = "comment")
public class Comment {
	private int commentId;
	private String comment;
	private String useremail;
	private String songName;
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	
	public Comment() {
		super();
	}
	public void Comments(int commentId, String comment, String useremail, String songName) {
		this.commentId = commentId;
		this.comment = comment;
		this.useremail = useremail;
		this.songName = songName;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
}