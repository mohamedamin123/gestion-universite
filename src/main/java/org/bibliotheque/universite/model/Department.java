package org.bibliotheque.universite.model;

public class Department {

    private Integer idDepartment;
    private String nom;

    public Department() {
    }

    public Department(String nom) {
        this.nom = nom;
    }

    public Department(Integer idDepartment, String nom) {
        this.idDepartment = idDepartment;
        this.nom = nom;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Department{" +
                "idDepartment=" + idDepartment +
                ", nom='" + nom + '\'' +
                '}';
    }
}
