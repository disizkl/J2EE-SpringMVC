package ma.tp3.springmvchospital.web;


import lombok.AllArgsConstructor;
import ma.tp3.springmvchospital.entities.Patient;
import ma.tp3.springmvchospital.repo.PatientRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepo patientRepo;
    @GetMapping("/index")
    public String index(Model model, @RequestParam(name="page",defaultValue = "0") int p,
                        @RequestParam(name="size",defaultValue = "4") int s,
                        @RequestParam(name="keyword",defaultValue = "")String kw){
        Page<Patient> pagePatients=patientRepo.findByNomContains(kw,PageRequest.of(p,s));
        model.addAttribute("listPatients",pagePatients.getContent());
        model.addAttribute("pages",new int [pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",p);
        model.addAttribute("Keyword",kw);
        return "Patient";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(name="id") long id,
                         @RequestParam(name="keyword",defaultValue = "")String keyword,
                         @RequestParam(name="page",defaultValue = "0") int page){
        patientRepo.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/index";
    }
    @GetMapping("/Patient")
    @ResponseBody
    public List<Patient> listPatients(){
        return patientRepo.findAll();
    }
    @GetMapping("/formPatients")
    public String formPatients(){
    return "Patient";
    }
}
