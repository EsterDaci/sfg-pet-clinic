package guru.springframework.sfgpetclinic.model;

import jakarta.persistence.*;

@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity{

    @Column(name = "description")
    private String description;



    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
