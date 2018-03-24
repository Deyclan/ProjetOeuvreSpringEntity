package com.epul.controleur;

import com.epul.dao.ServiceAdherent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ControleurAdherent {

    ServiceAdherent serviceAdherent = new ServiceAdherent();

    @RequestMapping(value = "/listerAdherent", method = RequestMethod.GET)
    public String listerAdherent(Model model) {
        //String destinationPage;
        try {
            // HttpSession session = request.getSession();
            //model.addAttribute("mesAdherents", serviceAdherent.getListAdherent());
            //destinationPage = "listerAdherent";
        } catch (Exception e) {
            //model.addAttribute("Erreur", e.getMessage());
            //destinationPage = "Erreur";
        }
        return "TEST";
    }

}
