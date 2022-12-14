package site.metacoding.miniproject.domain.subscribe;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Subscribe {
	private Integer subscribeId;
	private Integer userId;
	private Integer subjectId;
	private Timestamp createdAt;
}
