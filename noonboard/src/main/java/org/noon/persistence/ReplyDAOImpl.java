package org.noon.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.noon.domain.Criteria;
import org.noon.domain.ReplyVO;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	private String namespace = "org.noon.persistence.ReplyDAO";
	
	@Inject
	SqlSession session;

	@Override
	public void create(ReplyVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public List<ReplyVO> list(int bno) throws Exception {
		return session.selectList(namespace+".list",bno);
	}

	@Override
	public void update(ReplyVO vo) throws Exception {
		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(int rno) throws Exception {
		session.delete(namespace+".delete",rno);
	}

	@Override
	public int count(int bno) throws Exception {
		return session.selectOne(namespace+".count",bno);
	}

	@Override
	public List<ReplyVO> listpage(int bno, Criteria cri) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("bno", bno);
		paramMap.put("cri", cri);
		
		return session.selectList(namespace+".listPage", paramMap);
	}

	

}
