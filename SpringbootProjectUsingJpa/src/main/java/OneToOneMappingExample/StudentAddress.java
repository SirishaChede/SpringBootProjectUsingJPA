package OneToOneMappingExample;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Builder
@Entity
@Data
@Table(name="studentAddressOneToOne")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude="student")
public class StudentAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int StudentAddressId;
	private int Pincode;
	private String State;
	@OneToOne(
			cascade= {CascadeType.ALL}
			)	
	@JoinColumn(name="student_id", referencedColumnName="id",updatable = true)
	private Student student;
}