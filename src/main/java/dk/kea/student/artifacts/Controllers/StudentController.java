package dk.kea.student.artifacts.Controllers;

import dk.kea.student.artifacts.ProjectLocals.ProjectTestHelpers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController
{
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("studentID", 1);
        model.addAttribute("attKey", "");
        model.addAttribute("isAccepted", false);

        return "index";
    }

    @RequestMapping(value = "/attendanceKey", method = RequestMethod.POST)
    public String attendanceKey(@RequestParam("studentID")int studentID,
                                @RequestParam("attKey")String key,
                                Model model) {
        System.out.println(studentID);
        System.out.println(key);
        model.addAttribute("StudentID", 1);
        // Check Key to Static right now
        // TODO: Change to get information from ESB/Mediator
        boolean accept = false;
        String errorMessage = "";
        if (key.equals(ProjectTestHelpers.KEY))
            accept = true;
        else
            errorMessage = "Wrong Key";
        model.addAttribute("isAccepted", accept);
        model.addAttribute("error", errorMessage);
        model.addAttribute("attKey", "");

        return "index";
    }
}
