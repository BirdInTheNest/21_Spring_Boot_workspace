package board.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import board.bean.BoardDTO;

@RestController
public class BoardController {
	
	public BoardController() {
		System.out.println("BoardController 기본생성자");
	}
	
	//@RequestMapping(value="/hello", method=RequestMethod.GET)
	@GetMapping("/board/hello")
	public String hello(String name) {
		return "hello " + name;
	}
	
	@GetMapping("/board/getBoard")
	public BoardDTO getBoard() {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setSeq(1);
		boardDTO.setName("데이지");
		boardDTO.setSubject("Spring Boot Practice");
		boardDTO.setContent("Practice makes Perfect");
		boardDTO.setLogtime(new Date());
		
		return boardDTO; //JSON으로 자동 변환하여 화면에 출력한다
	}
}


