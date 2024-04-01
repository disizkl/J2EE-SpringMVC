package ma.tp3.springmvchospital;

import ma.tp3.springmvchospital.entities.Patient;
import ma.tp3.springmvchospital.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringMvcHospitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepo patientRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcHospitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Patient patient=new Patient();
        Patient.setId(null);
        patient.setNom("Omar");
        patient.setMalade("true");
        patient.setScore(50);
        patient.setDate_naissance(14-06-1988);

        Patient patient2=new Patient(null,"Nabil",new Date(),false,55);
        // a l'aide de Builder
        Patient patient3=Patient.Builder()
                .nom("Fadila")
                .date_naissance(new Date())
                .score(66)
                .malade(true)
                .build();*/
        patientRepo.save(new Patient(1,"Yassine",new Date(),false,109));
        patientRepo.save(new Patient(2,"Hanane",new Date(),false,122));
        patientRepo.save(new Patient(3,"Omar",new Date(),true,50));
        patientRepo.save(new Patient(4,"Ismail",new Date(),false,165));
        patientRepo.save(new Patient(5,"Anas",new Date(),true,198));
        patientRepo.save(new Patient(6,"Mohammed",new Date(),true,178));
        patientRepo.save(new Patient(7,"Yanis",new Date(),false,11));
        patientRepo.save(new Patient(8,"Adnane",new Date(),false,234));
        patientRepo.save(new Patient(9,"Mohammed",new Date(),false,94));
        patientRepo.save(new Patient(10,"Ines",new Date(),false,375));
        patientRepo.save(new Patient(11,"Gaelle",new Date(),false,299));
        patientRepo.save(new Patient(12,"Adel",new Date(),false,389));
        patientRepo.save(new Patient(13,"Amina",new Date(),false,103));
        patientRepo.save(new Patient(14,"Anis",new Date(),false,43));
        patientRepo.save(new Patient(15,"Rachid",new Date(),false,23));
    }
}
