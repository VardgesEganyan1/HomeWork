package medicalCenter;

import javax.print.Doc;
import java.util.Objects;

public class Doctor extends Person{
    private String email;
    private String proffesion;

    public Doctor(String id, String name, String surname, String phoneNumber, String email, String proffesion) {
        super(id, name, surname, phoneNumber);
        this.email = email;
        this.proffesion = proffesion;
    }

    public Doctor(String email, String proffesion) {
        this.email = email;
        this.proffesion = proffesion;
    }

    public Doctor(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(proffesion, doctor.proffesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, proffesion);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", proffesion='" + proffesion + '\'' +
                '}';
    }
}
