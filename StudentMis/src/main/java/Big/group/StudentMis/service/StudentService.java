package Big.group.StudentMis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Big.group.StudentMis.model.Student;
import Big.group.StudentMis.repository.StudentRepository;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> listStudents(){
        return studentRepository.findAll();
    }
    public void addStudent(Student student){
        studentRepository.save(student);
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }
}
