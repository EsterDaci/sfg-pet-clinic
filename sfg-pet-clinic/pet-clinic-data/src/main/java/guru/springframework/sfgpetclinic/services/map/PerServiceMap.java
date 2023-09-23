package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PerServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}