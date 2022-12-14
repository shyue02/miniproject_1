package site.metacoding.miniproject.web.dto.response;

import java.sql.Timestamp;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.miniproject.domain.need_skill.NeedSkill;

@Setter
@Getter
@NoArgsConstructor
public class CompanyRecommendDto {
	private Integer recommendCount;
	private Integer noticeId;
	private Integer userId;
	private Integer companyId;
	private String noticeTitle;
	private String companyName;
	private String address;
	private Integer career;
	private String degree;
	private String salary;
	private Timestamp createdAt;
	private List<NeedSkill> needSkillList;
}
