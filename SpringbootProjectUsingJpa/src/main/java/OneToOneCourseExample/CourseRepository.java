package OneToOneCourseExample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

	//List<Course> courseprint();
	@Transactional
	@Modifying
    @Query("delete  from  Course c where c.id=:id")
	int deletemethod(int id);

}
