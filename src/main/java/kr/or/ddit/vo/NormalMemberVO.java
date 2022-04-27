package kr.or.ddit.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

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
@EqualsAndHashCode(of="memId")
@ToString(exclude= {"normalmemRegno1", "normalmemRegno2"})
public class NormalMemberVO {
	
	private String memId;
	private String normalmemRegno1;
	private String normalmemRegno2;
	private String normalmemBir;
	private String normalmemLike;
	private String normalmemMarriage;
	private Integer normalmemGrade;
	
}
