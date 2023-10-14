package proyecto.udea.proyecto.udea.backend.service;

import proyecto.udea.proyecto.udea.backend.controllers.DistribuidorController;
import proyecto.udea.proyecto.udea.backend.entity.Distribuidor;
import proyecto.udea.proyecto.udea.backend.repository.DistribuidorRepository;

import java.util.List;

public class DistribuidorService {

    private DistribuidorRepository distribuidorRepository;

    public List<Distribuidor> getDistribuidores() {
        return distribuidorRepository.findAll();
    }

    public Distribuidor saveDistribuidor(Distribuidor distribuidor) {
        return distribuidorRepository.save(distribuidor);
    }

    public List<Distribuidor> saveDistribuidor(List<Distribuidor> distribuidores) {
        return distribuidorRepository.saveAll(distribuidores);
    }

    public Distribuidor updateDistribuidor(Distribuidor distribuidor {

        Distribuidor  existingDistribuidor= studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());

        return studentRepository.save(existingStudent);
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }

    public String deleteStudent(Integer id){
        studentRepository.deleteById(id);
        return "Has eliminado al estudiante con el id " + id;
    }


}
