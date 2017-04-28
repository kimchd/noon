package org.noon.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.noon.domain.BoardVO;
import org.noon.domain.Criteria;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	private String namespace = "org.noon.persistence.BoardDAO";

	@Inject
	SqlSession session;
	
	@Override
	public String getTime() {
		return session.selectOne(namespace+".getTime");
	}

	@Override
	public void create(BoardVO vo) {
		session.insert(namespace+".create",vo);
	}

	@Override
	public List<BoardVO> read(int bno) {
		return session.selectList(namespace+".read",bno);
		
	}

	@Override
	public void update(BoardVO vo) {
		session.update(namespace+".update", vo);
	}

	@Override
	public void delete(int bno) {
		session.delete(namespace+".delete", bno);
	}

	@Override
	public int getCount(Criteria cri) {
		return session.selectOne(namespace+".getCount", cri);
	}

	@Override
	public List<BoardVO> list(Criteria cri) {
		return session.selectList(namespace+".list", cri);
	}


	
}
