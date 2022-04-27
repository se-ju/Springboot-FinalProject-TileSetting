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
@EqualsAndHashCode(of="proboNo")
public class ProBoardVO {

	private Integer proboNo;
	private Integer proNo;
	private Integer promemNo;
	private String proboTitle;
	private String proboCon;
	private String proboDate;
	
	private List<ProFileVO> files;
	
}
