package OneToOneCourseExample;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude="course")
public class CourseMaterial {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int coursematerialid;
	private String url;
	@OneToOne(
			cascade= {CascadeType.ALL}
			)
	@JoinColumn(
			name="course_id",
			referencedColumnName="id",
			updatable = true)
	private Course course;
     
}
