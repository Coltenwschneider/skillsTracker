package org.launchcode.Skills.tracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
public class SkillsController {

    @GetMapping
    public String skillsList() {
        return "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                    "<li> Java </li>" +
                    "<li> JavaScript </li>" +
                    "<li> Python </li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsPicker() {
        return "<html>" +
                "<body>" +
                "Name:" +
                "<form action='form' method='post'>" +
                "<input type='text' name='name'>" +
                "<div>My favorite language:</div>" +
                "<select name='skills1'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javaScript'>JavaScript</option>" +
                    "<option value='python'>Python</option>" +
                "</select>" +
                "<div>My second favorite language:</div>" +
                "<select name='skills2'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javaScript'>JavaScript</option>" +
                    "<option value='python'>Python</option>" +
                "</select>" +
                "<div>My third favorite language:</div>" +
                "<select name='skills3'>" +
                    "<option value='java'>Java</option>" +
                    "<option value='javaScript'>JavaScript</option>" +
                    "<option value='python'>Python</option>" +
                "</select>" +
                "<div>" +
                "<input type='submit' value='Submit'>" +
                "</div>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String skillsChoice(@RequestParam String name, String skills1, String skills2, String skills3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<li>" + skills1 + "</li>" +
                    "<li>" + skills2 + "</li>" +
                    "<li>" + skills3 + "</li>" +
                "</body>" +
                "</html>";
    }


}
