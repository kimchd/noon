package org.noon.service;

import java.util.List;

import org.noon.domain.BoardVO;
import org.noon.domain.Criteria;

public interface BoardService {

	public void register(BoardVO vo) throws Exception;

	public List<BoardVO> findByBno(Integer bno) throws Exception;

	public void modify(BoardVO vo) throws Exception;

	public void remove(Integer bno) throws Exception;

	public List<BoardVO> getList(Criteria cri) throws Exception;

	public int getCount(Criteria cri) throws Exception;

}
