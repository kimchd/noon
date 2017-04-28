package org.noon.controller;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.noon.domain.BoardVO;
import org.noon.domain.Criteria;
import org.noon.domain.PageMaker;
import org.noon.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	BoardService service;
	
	private static final Logger logger = Logger.getLogger(BoardController.class);
	
	@GetMapping("/list")
	public void list(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		List<BoardVO> list = service.getList(cri);
		int listCount = service.getCount(cri);
		logger.info(list);
		model.addAttribute("list", list);
		model.addAttribute("pageMaker", new PageMaker(cri, listCount));
				
	}
	
	@GetMapping("/register")
	public void register(@ModelAttribute("cri") Criteria cri, Model model)throws Exception{
		
		
	}
	
	@PostMapping("/register")
	public String registerPost(@ModelAttribute("cri") Criteria cri, BoardVO vo)throws Exception{
		logger.info("----------------------------------------------------------------------");
		logger.info(vo);
		service.register(vo);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/view")
	public void view(@ModelAttribute("cri") Criteria cri, BoardVO vo, Model model)throws Exception{
		
		List<BoardVO> list = service.findByBno(vo.getBno());
		
		model.addAttribute("list", list);
	}
	
	@PostMapping("/view")
	public String viewPost(BoardVO vo)throws Exception{
		
		service.remove(vo.getBno());
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/update")
	public void update(@ModelAttribute("cri") Criteria cri,BoardVO vo, Model model)throws Exception{
		List<BoardVO> list = service.findByBno(vo.getBno());
		
		model.addAttribute("list", list);
	}
	
	@PostMapping("/update")
	public String updatePost(@ModelAttribute("cri") Criteria cri,BoardVO vo)throws Exception{
		logger.info("--------------------------");
		logger.info(cri);
		logger.info(vo);
		logger.info("-----------------------------------");
		service.modify(vo);
		return "redirect:/board/view?page="+cri.getPage()+"&bno="+vo.getBno();
	}

}
