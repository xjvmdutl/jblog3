package kr.co.itcen.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDao {
	@Autowired
	private SqlSession sqlSession;
	public Boolean insert(String id) {
		int count = sqlSession.insert("blog.insertdefault",id);
		return count==1;
	}

}
