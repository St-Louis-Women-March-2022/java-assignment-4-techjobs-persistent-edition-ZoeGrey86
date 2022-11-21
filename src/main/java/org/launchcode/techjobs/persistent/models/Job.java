package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Job extends AbstractEntity{
    @ManyToOne
    private Employer employer;


    @ManyToMany
    private final List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer employer, List skills) {
        super();
        this.employer = employer;
    }

    // Getters and setters.

    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills){
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setSkills(Skill any) {
        skills.add(any);
    }
}
