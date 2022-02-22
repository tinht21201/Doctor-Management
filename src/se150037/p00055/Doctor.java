/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se150037.p00055;

/**
 *
 * @author Huynh Trung Tin - SE150037
 */
public class Doctor {
    private String code;
    private String name;
    private String specialization;
    private int availability;

    public Doctor() {
    }

    public Doctor(String code, String name, String specialization, int availabiity) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availabiity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAvailabiity() {
        return availability;
    }

    public void setAvailabiity(int availabiity) {
        this.availability = availabiity;
    }
}
