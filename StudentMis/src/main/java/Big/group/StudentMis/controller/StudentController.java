package Big.group.StudentMis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Big.group.StudentMis.service.StudentService;
import Big.group.StudentMis.model.Student;

@RestController
@CrossOrigin("http://localhost:8080")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/app/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> listAllStudents(){
return studentService.listStudents();
    }
    @PostMapping("/app/students")
    @ResponseStatus(HttpStatus.OK)
    public void addNewStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @GetMapping("/app/students/{studentid}")
    @ResponseStatus(HttpStatus.OK)
    public Student findStudentById(@PathVariable("studentid") Long id){
        return studentService.getStudentById(id);
    }
}
