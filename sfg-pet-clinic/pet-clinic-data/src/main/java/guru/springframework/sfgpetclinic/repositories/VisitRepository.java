package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudService<Visit,Long> {
}
