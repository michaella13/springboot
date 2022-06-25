package Big.group.StudentMis;

import org.springframework.boot.SpringApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Big.group.StudentMis.model.Student;
import Big.group.StudentMis.repository.StudentRepository;


import java.time.LocalDate;
import java.util.List;


import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@RestController
public class StudentMisApplication {

	public static void main(String[] args) {

		
		SpringApplication.run(StudentMisApplication.class, args);
		
	
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args->{
			// DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d/MM/yyyy");
			// String date="15/6/2022";
		
			// LocalDate localDate=LocalDate.parse(date,formatter);
			
	Student student=new Student("Jane","Mutoni","jmutoni@gmail.com",LocalDate.now());
	// studentRepository.save(student);
	System.out.println("After saving");
	Student student2=new Student("Peter","Gasana","gmutoni@gmail.com",LocalDate.now());
	//save all at the same time
	studentRepository.saveAll(List.of(student,student2));
	// System.out.println("The available number is "+studentRepository.count());
	// studentRepository.findAll().forEach(System.out::println);
	System.out.println("Alternartive");
	// List<Student> sts=studentRepository.findAll();
	// for(Student stud:sts){
	// 	System.out.println(stud);
	// }
	// System.out.println("Find a student by Id: ");
	// studentRepository.findById(1L).ifPresent(System.out::println);
	
	
	};
	}

}
