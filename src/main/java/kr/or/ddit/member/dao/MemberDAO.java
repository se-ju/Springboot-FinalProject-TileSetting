package kr.or.ddit.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ddit.vo.MemberVO;

/**
 * @author 작성자명
 * @since 2022. 4. 26.
 * @version 1.0
 * @see javax.servlet.http.HttpServlet
 * <pre>
 * [[개정이력(Modification Information)]]
 * 수정일                          수정자               수정내용
 * --------     --------    ----------------------
 * 2022. 4. 26.      박상진       최초작성
 * Copyright (c) 2022 by DDIT All right reserved
 * </pre>
 */
@Mapper
public interface MemberDAO {
	
	/**
	 * @param member(MemberVO - 기업(EnterpriseVO) / 개인(NomalMemberVO) 의 폼 입력 정보
	 * @return 성공한 레코드의 수
	 */
	public int insertMember(MemberVO member);
	
	/**
	 * @param member(일반 회원테이블 insert / 트리거 사용시 미사용)
	 * @return
	 */
	public int insertNormalMember(MemberVO member);
	
	/**
	 * @param member(기업 회원테이블 insert / 트리거 사용시 미사용)
	 * @return
	 */
	public int insertEnterprise(MemberVO member);
	
	/**
	 * @return 모든 회원들의 리스트 조회
	 */
	public List<MemberVO> selectAllMemberList();
	
	/**
	 * @return 모든 일반회원들의 리스트 조회
	 */
	public List<MemberVO> selectNormalMemberList();
	
	/**
	 * @return 모든 기업회원들의 리스트 조회
	 */
	public List<MemberVO> selectEnterpriseList();
	
	/**
	 * @param member( 검색조건 : MEM_ID, MEM_NAME, MEM_ADD1 + MEM_ADD2, MEM_HP, MEM_JOB) 의 조건 추가 검색, 회원 분류 코드로 기업 / 일반회원 구분
	 * @return 해당 조건에 맞는 회원들의 리스트
	 */
	public List<MemberVO> selectFilterMemberList(MemberVO member);
	
	/**
	 * @return 회원 탈퇴 처리(Update - MEM_DEL : 'Y'로 변경)
	 */
	public int deleteMember(String memId);
	
	/**
	 * @param member(수정할 정보들)
	 * @return 성공한 레코드의 수
	 */
	public int updateMember(MemberVO member);
	
	
}
