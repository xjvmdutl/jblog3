package kr.co.itcen.jblog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.itcen.jblog.service.BlogService;

@RequestMapping("/blog/{id:(?!assets).*}")//assets밑에 있는 파일제외 모두 받는다
@Controller
public class BlogController {
	@Autowired
	private BlogService blogService;
	@RequestMapping({"","/{categoryno}","/{categoryno}/{postno}"})
	public String index(
		@PathVariable String id,
		@PathVariable Optional<Long> path1,
		@PathVariable Optional<Long> path2){
		Long categoryno= 0L;
		Long blogno = 0L;
		if(path2.isPresent()) {
			categoryno=path1.get();
			blogno=path2.get();
		}else if(path1.isPresent()) {
			categoryno=path1.get();
		}
		
			
		return "blog/blog-main";
	}
}
