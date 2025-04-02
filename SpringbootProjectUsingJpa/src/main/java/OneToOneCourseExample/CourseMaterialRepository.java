package OneToOneCourseExample;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Integer> {

	//List<CourseMaterial> print();
      
}
