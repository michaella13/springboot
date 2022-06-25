package Big.group.StudentMis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Big.group.StudentMis.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
    List<Student> findByFirstName (String firstName);
    List<Student> findByFirstNameAndLastNameAndEmail(String firstname,String lastname,String email);
    List<Student> findAll();
    
}
