package ua.rozhkov.springdepdb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.rozhkov.springdepdb.DAO.entity.College;
import ua.rozhkov.springdepdb.FormDTO.CollegeFormDTO;
import ua.rozhkov.springdepdb.service.CollegeService;

@Controller
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private CollegeService collegeService;

    @RequestMapping("/list")
    public String showListCollegesPage(Model model) {
        model.addAttribute("colleges", collegeService.findAll());
        return "college/listColleges";
    }

    @RequestMapping("/add")
    public String showAddCollegePage(Model model) {
        model.addAttribute("collegeFormDTOToAdd", collegeService.prepareCollegeFormDTOToAdd());
        return "college/addCollege";
    }

    @RequestMapping("/addNewCollege")
    public String addNewCollege(@ModelAttribute CollegeFormDTO collegeFormDTOToAdd) {
        collegeService.perfomCollegeFormDTOAdd(collegeFormDTOToAdd);
        return "redirect:/college/list";
    }

    @RequestMapping("/edit/{id}")
    public String showEditPage(@PathVariable long id, Model model) {
        College collegeToEdit = collegeService.findById(id);
        model.addAttribute("collegeFormDTOToEdit", collegeService.prepareCollegeFormDTOToEdit(collegeToEdit));
        return "college/editCollege";
    }

    @RequestMapping("/editCollege")
    public String editCollege(@ModelAttribute CollegeFormDTO collegeFormDTOToEdit) {
        collegeService.perfomCollegeFormDTOEdit(collegeFormDTOToEdit);
        return "redirect:/college/list";
    }

    @RequestMapping("/delete/{id}")
    public String deleteCollege(@PathVariable long id) {
        collegeService.deleteById(id);
        return "redirect:/college/list";
    }


}
