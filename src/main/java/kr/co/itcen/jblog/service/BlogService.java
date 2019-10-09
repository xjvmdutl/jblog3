package kr.co.itcen.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.itcen.jblog.repository.BlogDao;
import kr.co.itcen.jblog.repository.CategoryDao;
import kr.co.itcen.jblog.repository.PostDao;
import kr.co.itcen.jblog.vo.CategoryVo;
import kr.co.itcen.jblog.vo.PostVo;

@Service
public class BlogService {
	@Autowired
	private BlogDao blogDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private PostDao postDao;
	public List<CategoryVo> getList(String id) {	
		return categoryDao.getList(id);
	}
	public List<PostVo> getList(Long categoryno) {	
		return postDao.getList(categoryno);
	}
	public PostVo getPost(Long postno,Long categoryno) {
		return postDao.getPost(postno,categoryno);
	}
	

}
