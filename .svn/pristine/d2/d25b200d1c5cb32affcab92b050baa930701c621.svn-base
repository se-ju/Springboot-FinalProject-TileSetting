package kr.or.ddit.member.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import kr.or.ddit.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@ContextHierarchy(value= {
		@ContextConfiguration("file:webapp/WEB-INF/spring/*-context.xml")
		,@ContextConfiguration("file:webapp/WEB-INF/spring/appServlet/servlet-context.xml")
})
@WebAppConfiguration
@Slf4j
public class MemberDAOTest {
	
	@Inject
	MemberDAO dao;
	
	@Test
	public void testSelectNormalMemberList() {
		
		log.info(dao.toString());
		List<MemberVO> list = dao.selectNormalMemberList();
		
		
		assertNotNull(list);
	}
	
	@Test
	public void testSelectEnterpriseMember() {
		List<MemberVO> list = dao.selectEnterpriseList();
		
		assertNotNull(list);
		
	}
	
	@Test
	public void testSelectAllMemberList() {
		List<MemberVO> list = dao.selectAllMemberList();
		
		assertNotNull(list);
	}
	
	@Test
	public void testSelectFilterMember() {
		MemberVO member = new MemberVO();
		member.setMemName("이쁜이");
		member.setMemId("b001");
		List<MemberVO> list = dao.selectFilterMemberList(member);
		
		assertNotNull(list);
	}

}
