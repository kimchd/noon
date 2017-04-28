package org.noon.persistence;

import java.util.List;

import org.noon.domain.Criteria;
import org.noon.domain.ReplyVO;

public interface ReplyDAO {

	public void create(ReplyVO vo)throws Exception;
	
	public List<ReplyVO> list(int bno)throws Exception;
	
	public void update(ReplyVO vo)throws Exception;
	
	public void delete(int rno)throws Exception;
	
	public int count(int bno)throws Exception;
	
	public List<ReplyVO> listpage(int bno, Criteria cri)throws Exception;
}
