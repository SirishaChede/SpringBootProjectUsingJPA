package com.example.demo.Student;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
public interface StudentRepository extends JpaRepository<Student,Long>{
	
	
	List<Student>findByFirstName(String firstName);
//	@Query(
//			"SELECT s FROM students s WHERE s.email = :emailadd"
//			)
//	List<Student> getStudentByEmailAddressNative(@Param("emailadd") String emailadd);	

	@Query("SELECT s FROM Student s WHERE s.email = :email")
	List<Student> getStudentByEmailAddress(@Param("email") String email);

	
	@Query("SELECT s FROM Student s")
    List<Student> findAllStudents();
	
	
	@Query("SELECT s FROM Student s where s.email=:email")
    List<Student> getStudentByEmail(String email);
	
	@Query("SELECT COUNT(s) FROM Student s")
    Long getStudentsCount();
	
	@Transactional
	@Modifying
	@Query("update Student s set s.firstName=:FN where s.email=:email")
	int updateStudentNameByEmail(String FN,String email);
	
	
	@Transactional
	@Modifying
	@Query("delete from Student s where s.email=:email")
	int deleteStudentNameByEmail(String email);
	
}



	


