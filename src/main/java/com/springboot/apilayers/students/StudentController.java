package com.springboot.apilayers.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }


//Constructor parametreli kullanmak için ve @Autowired kullanılıyoruz. Bu sayede parametreli constrocutor oluşturabiliyoruz.
    //StudentService class'ının da bir service olduğunu @Service olarak tanımlıyoruz.
    //Aşağıdaki gibi constructor yerine yukarıdakini kullanılıyoruz.

/*    public StudentController(){
        this.studentService = new StudentService();
    }*/

    @GetMapping
    public List<Student> getStudent(){

        return studentService.getAllStudents();

    }


    @PostMapping
    public void registerNewStudent(@RequestBody Student student){

        studentService.addNewStudent(student);
    }


    @DeleteMapping("{id}")  //direk link üzerinden id yazarak göndereceğim.
    public void deleteStudent(@PathVariable("id") Long id){

        studentService.deleteStudent(id);

    }

    @PutMapping(path = "{id}") //query param olarak göndereceğim.
    public void updateStudent(@PathVariable("id") Long id,
                              @RequestParam(required = false)String name,
                              @RequestParam(required = false)String email){

        studentService.updateStudent(id,name,email);
    }
}
