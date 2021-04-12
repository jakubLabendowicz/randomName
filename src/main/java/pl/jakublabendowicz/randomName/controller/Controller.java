package pl.jakublabendowicz.randomName.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jakublabendowicz.randomName.Name;

@RestController
public class Controller {

    @GetMapping("/")
    @Autowired
    public static String run(Name name) {
        return "<h1 style=\"position: fixed; font-size:150px; top:50vh; left:50vw; transform: translate(-50%, -100%);\">"
                + "<div>"
                + name.name[0]
                + "</div>"
                + "<div>"
                + "loves"
                + "</div>"
                + "<div>"
                + name.name[1]
                + "</div>";
    }
}
