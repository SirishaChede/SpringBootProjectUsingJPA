package ManyToManyExample;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
@Table(name="courseMaterialManyToMany")
public class CourseMaterial {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CourseMaterialId;
	private int cost;
	private String url;
	@ManyToMany(
			cascade=CascadeType.ALL,
			fetch=FetchType.EAGER
			)
	@JoinTable(
			name="Course_CourseMaterial_Map",
	joinColumns=@JoinColumn(
			name="coursematerial_Id"),
	inverseJoinColumns=@JoinColumn(
			name="course_id"))
	private List<Course> course;

}
