package com.company.lessons9;

public class Aspirant extends Student {
    private String workSt;

    Aspirant() {
        workSt = "cours work";
    }

    public Aspirant(String firstName, String lastName, String group, String workSt) {
        super(firstName, lastName, group);
        this.workSt = workSt;
    }

    public String getWorkSt() {
        return workSt;
    }

    public void setWorkSt(String workSt) {
        this.workSt = workSt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aspirant aspirant = (Aspirant) o;

        return workSt != null ? workSt.equals(aspirant.workSt) : aspirant.workSt == null;
    }

    @Override
    public int hashCode() {
        return workSt != null ? workSt.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "workSt='" + workSt + '\'' +
                '}';
    }

    public int getScholarship() {
        return 200;
    }
}
