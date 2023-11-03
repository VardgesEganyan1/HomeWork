package medicalCenter.storage;

import medicalCenter.Doctor;
import medicalCenter.Patient;
import medicalCenter.Person;
import medicalCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {
    private Person[] persons = new Person[10];
    private int size;

    public void add(Person person){
        if(size == persons.length){
            extend();
        }
        persons[size++] = person;
    }

    private void extend() {
        int tmp[] = new int[(persons.length - 1) + 10];
        System.arraycopy(persons,0,tmp,0,size);
    }

    public void printDoctors(){
        for (int i = 0; i < size; i++) {
            if(persons[i] instanceof Doctor){
                System.out.println(persons[i]);
            }

        }
    }

    public void searchDoctorByProffession(String proffession){
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor){
                Doctor doctor = (Doctor) person;
                if(doctor.getProffesion().equals(proffession)){
                    System.out.println(doctor);
                }
            }

        }
    }

    public void deleteDoctorById(String id){
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if(person.getId().equals(id) && person instanceof Doctor){
                deleteByIndex(i);
            }

        }
    }

    public Doctor getDoctorById(String id){
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if(person.getId().equals(id) && person instanceof Doctor){
                return (Doctor) person;
            }

        }
        return null;
    }

    public void printAllPatientByDoctor(Doctor doctor){
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if(person instanceof Patient){
                Patient patient = (Patient) person;
                if(patient.getDoctor().equals(doctor)){
                    System.out.println(patient);
                }
            }

        }
    }

    public void printTodaysPatients(){
        Date today = new Date();
        for(int i = 0;i<size;i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                DateUtil.isSameDay(today, patient.getRegisterDateTime());
            }
        }

    }



    private void deleteByIndex(int i) {
        for(int j = i; j < size;j++){
            persons[j] = persons[j + 1];
        }
        size--;

    }


}
