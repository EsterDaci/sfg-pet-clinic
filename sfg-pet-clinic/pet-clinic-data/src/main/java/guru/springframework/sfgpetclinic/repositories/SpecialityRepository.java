package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends CrudService<Speciality,Long> {
}
