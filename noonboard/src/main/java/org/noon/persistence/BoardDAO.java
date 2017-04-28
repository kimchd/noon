package org.noon.persistence;

import java.util.List;

import org.noon.domain.BoardVO;
import org.noon.domain.Criteria;

public interface BoardDAO {

	public String getTime();

	public void create(BoardVO vo);

	public List<BoardVO> read(int bno);

	public void update(BoardVO vo);

	public void delete(int bno);

	public int getCount(Criteria cri);
	
	public List<BoardVO> list(Criteria cri);

}