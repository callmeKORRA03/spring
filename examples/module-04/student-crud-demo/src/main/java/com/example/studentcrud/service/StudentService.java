package com.example.studentcrud.service;

import com.example.studentcrud.dto.StudentRequest;
import com.example.studentcrud.dto.StudentResponse;
import com.example.studentcrud.exception.StudentNotFoundException;
import com.example.studentcrud.model.Student;
import com.example.studentcrud.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentResponse createStudent(StudentRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setCourse(request.getCourse());

        Student savedStudent = studentRepository.save(student);
        return toResponse(savedStudent);
    }

    public List<StudentResponse> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public StudentResponse getStudentById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id " + id));
        return toResponse(student);
    }

    public StudentResponse updateStudent(Long id, StudentRequest request) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id " + id));

        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setCourse(request.getCourse());

        Student updatedStudent = studentRepository.save(student);
        return toResponse(updatedStudent);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student not found with id " + id));
        studentRepository.delete(student);
    }

    private StudentResponse toResponse(Student student) {
        return new StudentResponse(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getCourse()
        );
    }
}
