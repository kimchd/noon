package org.noon.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.noon.domain.BoardVO;
import org.noon.domain.Criteria;
import org.noon.persistence.BoardDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class BoardTest {

	private static Logger logger = Logger.getLogger(BoardTest.class);

	@Inject
	DataSource ds;

	@Inject
	SqlSession session;

	@Inject
	BoardDAO dao;
	
	@Test
	public void listTest(){
		Criteria cri = new Criteria();
		
		cri.setPage(1);
		cri.setSize(10);
		
		System.out.println(dao.list(cri));
		
		
	}
	
	@Test
	public void deleteTest() {
		dao.delete(2);
	}

	@Test
	public void readTest() {
		List<BoardVO> list = new ArrayList<>();
		list = dao.read(100);

		logger.info(list.toString());

	}

	@Test
	public void creatTest() {
		BoardVO vo = new BoardVO();

		for (int i = 0; i <= 100; i++) {
			vo.setTitle("새 제목");
			vo.setContent("새 내용");
			vo.setWriter("임채린");

			dao.create(vo);
		}

	}

	@Test
	public void getTime() {
		logger.info(dao.getTime());
	}

	@Test
	public void testCon() {
		logger.info(ds);
		try (Connection con = ds.getConnection()) {
			logger.info(con);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
