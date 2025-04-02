package DoctorJPAExample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Student.Student;

import jakarta.transaction.Transactional;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{
	
    
	List<Doctor> findByname(String name);
    @Query("select d from Doctor d where d.email=:email ")
	List<Doctor> findByEmail(@Param("email")String email);
   @Query("Select d from Doctor d")
	List<Doctor> printAll();
   @Query("select d from Doctor d where d.email=:email")
	List<Student> getprintdoctorbyEmail(String string);
    @Query("select count(d) from Doctor d")
	Long allcount();
    //@Query("update Doctor d set d.name=:name where d.email=:email")
	//List<Doctor> updatedetails();
	@Transactional// this annoatation can contain the commit and rollback operations that means if both set and finding is in one time only
	@Modifying// this annotation is used in modifying
    @Query("Update Doctor d set d.name=:name where d.email=:email")
	int updateDoctorbyEmail(String name,String email);
	@Transactional
	@Modifying
    @Query("delete from Doctor d where d.name=:name") 
	int deleteDoctordetails(String name);
	
	

	

}
