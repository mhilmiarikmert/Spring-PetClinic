package petclinic.Service;

import petclinic.Exceptions.OwnerNotFoundException;

import petclinic.Model.Owner;
import petclinic.Model.Vet;

import java.util.List;
public interface PetClinicService {

    List<Owner> findOwners();
    List<Owner> findOwners(String lastName);
    Owner findOwner (Long id) throws OwnerNotFoundException;
    void createOwner(Owner owner);
    Owner update(Owner owner);
    void deleteOwner(Long id);

    List<Vet> findVets();
    Vet findVetById(Long id);
}
