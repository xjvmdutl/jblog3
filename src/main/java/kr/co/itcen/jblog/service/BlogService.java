package kr.co.itcen.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.itcen.jblog.repository.BlogDao;

@Service
public class BlogService {
	@Autowired
	private BlogDao blogDao;
	

}
