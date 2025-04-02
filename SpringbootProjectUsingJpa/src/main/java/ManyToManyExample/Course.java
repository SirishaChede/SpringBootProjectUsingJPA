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
@Table(name="CourseManyToMany")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int credits;
	@ManyToMany(cascade=CascadeType.ALL,
			fetch=FetchType.EAGER)
	@JoinTable(name="Course_CourseMaterial_Map",
	joinColumns=@JoinColumn(name="course_id"),
	inverseJoinColumns=@JoinColumn(name="coursematerial_id"))
	private List<CourseMaterial> courseMaterial;
	

}
