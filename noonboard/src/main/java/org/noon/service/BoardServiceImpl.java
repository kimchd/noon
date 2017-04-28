package org.noon.service;

import java.util.List;

import javax.inject.Inject;

import org.noon.domain.BoardVO;
import org.noon.domain.Criteria;
import org.noon.persistence.BoardDAO;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	BoardDAO dao;

	@Override
	public void register(BoardVO vo) throws Exception {
		dao.create(vo);
	}

	@Override
	public List<BoardVO> findByBno(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.update(vo);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> getList(Criteria cri) throws Exception {
		return dao.list(cri);
	}

	@Override
	public int getCount(Criteria cri) throws Exception {
		return dao.getCount(cri);
	}

}
