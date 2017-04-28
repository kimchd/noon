package org.noon.service;

import java.util.List;

import org.noon.domain.Criteria;
import org.noon.domain.ReplyVO;

public interface ReplyService {
	public void addReply(ReplyVO vo)throws Exception;
	
	public List<ReplyVO> listReply(int bno)throws Exception;
	
	public void modifyReply(ReplyVO vo)throws Exception;
	
	public void removeReply(int rno)throws Exception;
	
	public List<ReplyVO> listReplyPage(int bno, Criteria cri)throws Exception;
	
	public int count(int bno) throws Exception;
}
