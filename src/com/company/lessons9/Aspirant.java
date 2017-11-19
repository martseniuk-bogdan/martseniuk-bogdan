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
    public String toString() {
        return "Aspirant{" +
                "workSt='" + workSt + '\'' +
                '}';
    }

    public void getScholarship() {
        System.out.println("200");
    }
}
