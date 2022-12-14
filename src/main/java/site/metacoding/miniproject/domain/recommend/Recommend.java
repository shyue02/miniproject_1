package site.metacoding.miniproject.domain.recommend;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Recommend {
	private Integer recommendId;
	private Integer userId;
	private Integer subjectId;
	private Timestamp createdAt;
}
