package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class OwnerServiceMapTest {
    OwnerServiceMap ownerServiceMap;
    final Long ownerId=1L;
    final String lastName="Smith";

    @BeforeEach
    void setUp() {
        ownerServiceMap=new OwnerServiceMap(new PetTypeMapService(), new PerServiceMap());
        //ownerServiceMap.save(Owner.builder().id(ownerId).build());
        ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerServiceMap.findAll();
        assertEquals(1,ownerSet.size());

    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void save() {
        Owner owner2=Owner.builder().id(2L).build();
        Owner savedOwner=ownerServiceMap.save(owner2);
        assertEquals(2,savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner owner2=Owner.builder().build();
        Owner savedOwner=ownerServiceMap.save(owner2);
        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());
    }

    @Test
    void findById() {
        Owner owner=ownerServiceMap.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void findByLastName() {
        Owner smith=ownerServiceMap.findByLastName(lastName);
        assertNotNull(smith);
        assertEquals(ownerId,smith.getId());
    }
}