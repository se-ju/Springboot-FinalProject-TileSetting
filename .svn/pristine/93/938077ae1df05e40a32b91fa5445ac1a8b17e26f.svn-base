package kr.or.ddit.vo;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
@Data
@EqualsAndHashCode(of="proNo")
public class ProjectVO {
	
	private Integer proNo;
	private Integer payNo;
	private String memId;
	private String proName;
	
	// 외부 VO
	
	private List<ProjectMemberVO> projectMember;
	
	private List<WorkVO> works;
	
	private ProBoardVO board;
	
}
