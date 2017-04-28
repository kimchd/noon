package org.noon.service;

import java.util.List;

import javax.inject.Inject;

import org.noon.domain.Criteria;
import org.noon.domain.ReplyVO;
import org.noon.persistence.ReplyDAO;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	ReplyDAO dao;
	
	@Override
	public void addReply(ReplyVO vo) throws Exception {
		dao.create(vo);
	}

	@Override
	public List<ReplyVO> listReply(int bno) throws Exception {
		return dao.list(bno);
	}

	@Override
	public void modifyReply(ReplyVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void removeReply(int rno) throws Exception {
		dao.delete(rno);
	}

	@Override
	public List<ReplyVO> listReplyPage(int bno, Criteria cri) throws Exception {
		return dao.listpage(bno, cri);
	}

	@Override
	public int count(int bno) throws Exception {
		return dao.count(bno);
	}

}
