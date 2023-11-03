package medicalCenter;

import medicalCenter.storage.PersonStorage;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands{
    private static Scanner scanner = new Scanner(System.in);
    private  static PersonStorage personStorage = new PersonStorage();
    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun){
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command){
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                default:
                    System.out.println("Wrong command!!!");
            }
        }


    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProffession(profession);

    }

    private static void printAllPatientsByDoctor() {
    }

    private static void addPatient() {
        System.out.println("Please input id,name,surname,phone");

        personStorage.printDoctors();
        String patentDatastr = scanner.nextLine();
        String[] patentData = patentDatastr.split(",");
        String patentId = patentData[0];
        Date date = new Date();

        if(patentId == null){
            Patient patent = new Patient();
            patent.setId(patentId);
            patent.setName(patentData[1]);
            patent.setSurname(patentData[2]);
          //  patent.setSurname(patentData[3]);
            patent.setPhoneNumber(patentData[4]);
            patent.setRegisterDateTime(date);
            personStorage.add(patent);
            System.out.println("Patent Add");

        }else {
            System.out.println("Patent no add");
        }



    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        personStorage.deleteDoctorById(doctorId);

        System.out.println("Please input name,surname,phone,email,profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorid = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorid);
        if(doctorById == null){
            Doctor doctor = new Doctor();
            doctorById.setId(doctorid);
            doctorById.setName(doctorData[1]);
            doctorById.setSurname(doctorData[2]);
            doctorById.setPhoneNumber(doctorData[3]);
            doctorById.setEmail(doctorData[4]);
            doctorById.setProffesion(doctorData[5]);
            personStorage.add(doctor);
            System.out.println("Doctor added");
        }else {
            System.out.println("doctor with " + doctorid + " already exists");
        }

    }

    private static void searchDoctorByID() {

    }

    private static void addDoctor() {
        System.out.println("Please input id,name,surname,phone,email,profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorid = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorid);
        if(doctorById == null){
            Doctor doctor = new Doctor();
            doctor.setId(doctorid);
            doctor.setName(doctorData[1]);
            doctor.setSurname(doctorData[2]);
            doctor.setPhoneNumber(doctorData[3]);
            doctor.setEmail(doctorData[4]);
            doctor.setProffesion(doctorData[5]);
            personStorage.add(doctor);
            System.out.println("Doctor added");
        }else {
            System.out.println("doctor with " + doctorid + " already exists");
        }
    }

    private static void deleteDoctorById(){
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        personStorage.deleteDoctorById(doctorId);

    }

}
