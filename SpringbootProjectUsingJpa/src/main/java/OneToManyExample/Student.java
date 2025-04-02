package OneToManyExample;

import java.util.List;

import OneToOneMappingExample.StudentAddress;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@ToString(exclude="studentaddress")
@Table(name="studentOneToMany")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private int phNo;
	//uni-directional
	@OneToMany(
			cascade= {CascadeType.ALL},
			fetch=FetchType.EAGER
			)
	@JoinColumn(name="student_id", referencedColumnName="id")
	private List<StudentAddress1> studentaddress1;
	
}