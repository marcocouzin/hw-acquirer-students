package br.com.fiap.hwacquirer.controller;

import br.com.fiap.hwacquirer.dto.StudentCreateUpdateDTO;
import br.com.fiap.hwacquirer.dto.StudentDTO;
import br.com.fiap.hwacquirer.dto.StudentSimpleDTO;
import br.com.fiap.hwacquirer.dto.StudentStatusDTO;
import br.com.fiap.hwacquirer.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentSimpleDTO> listAll(@RequestParam(required = false) String course) {
        return studentService.listAll(course);
    }

    @GetMapping(value = "{id}")
    public StudentDTO findById(@PathVariable Long id) {
        return studentService.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentDTO create(@RequestBody StudentCreateUpdateDTO studentCreateUpdateDTO) {
        return studentService.create(studentCreateUpdateDTO);
    }

    @PutMapping({"{id}"})
    public StudentDTO update(@PathVariable Long id,
                             @RequestBody StudentCreateUpdateDTO studentCreateUpdateDTO) {
        return studentService.update(id, studentCreateUpdateDTO);
    }

    @PatchMapping({"{id}"})
    public StudentDTO updateStatus(@PathVariable Long id,
                                   @RequestBody StudentStatusDTO studentStatusDTO) {
        return studentService.updateByStatus(id, studentStatusDTO);
    }

    @DeleteMapping({"{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        studentService.delete(id);
    }
}
