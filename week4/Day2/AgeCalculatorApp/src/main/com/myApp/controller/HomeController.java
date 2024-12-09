package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;


@Controller
public class HomeController {
    @RequestMapping("/showForm")
    public String showHomePage() {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {

        // getting data from form
        String year = request.getParameter("year");
        String month = request.getParameter("month");
        String day = request.getParameter("day");

        //process data
        long yearAge= LocalDate.now().getYear()-Integer.parseInt(year);
        long monthAge= LocalDate.now().getMonthValue()-Integer.parseInt(month);
        long dayAge= LocalDate.now().getDayOfMonth()-Integer.parseInt(day);


        // propagating data to model
        model.addAttribute("year", yearAge);
        model.addAttribute("month", monthAge);
        model.addAttribute("day", dayAge);

        // view model
        return "resultPage";

        }

}
