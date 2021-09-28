package com.example.service;

import java.util.List;

import com.example.model.Comment;


public interface CommentService {

	public Comment  savecomment(Comment c);
	public List<Comment> getAllCommentBysongId (String songId);
	public Comment deleteComment(int commentId);
}