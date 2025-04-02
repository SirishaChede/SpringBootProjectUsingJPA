package OneToManyExample;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Entity
@Data
@Table(name="StudentAddressOneToMany")
@AllArgsConstructor
@NoArgsConstructor
public class StudentAddress1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int StudentAddressId;
	private int Pincode;
	private String State;
	
	//Bi-directional
	@ManyToOne(
		cascade= {CascadeType.ALL}
			)
	@JoinColumn(name="student_id", referencedColumnName="id")
	private Student student;
	
}