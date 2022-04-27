package kr.or.ddit.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author 작성자명
 * @since 2022. 4. 26.
 * @version 1.0
 * @see javax.servlet.http.HttpServlet
 * <pre>
 * [[개정이력(Modification Information)]]
 * 수정일                          수정자               수정내용
 * --------     	--------    ----------------------
 * 2022. 4. 26.      박상진       최초작성
 * Copyright (c) 2022 by DDIT All right reserved
 * </pre>
 */

@Data
@EqualsAndHashCode(of="memId")
@ToString(exclude="memPass")
public class MemberVO {
	
	private String memId;
	private String memPass;
	private String memName;
	private String memAdd1;
	private String memAdd2;
	private String memZip;
	private String memMail;
	private String memHp;
	private String memJob;
	private String memTel;
	private String memBlind;
	private String memAdmin;
	private String memDel;
	
	// 기업회원 및 일반회원 VO 연계
	private NormalMemberVO normalMember;
	
	private EnterpriseVO enterprise;
}

