package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsTrackerController {

    @GetMapping
    public String welcomePage() {
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "We have a few skills we would like to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String rankSkills(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return "<html>" +
                "<style>" +
                "table, td {border: 1px solid black}" +
                "</style>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr>" +
                    "<td>First Favorite</td>" +
                    "<td>" + first + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Second Favorite</td>" +
                    "<td>" + second + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td>Third Favorite</td>" +
                    "<td>" + third + "</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";
//
//
//
//                "<ol>" +
//                "<li>" + first + "</li>" +
//                "<li>" + second + "</li>" +
//                "<li>" + third +"</li>" +
//                "</ol>" +

    }

    @GetMapping("form")
    public String trackerForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'form' method = 'post'>" +
                "<label>Name:<br>" +
                "<input type = 'text' name = 'name'></label>" +
                "<label><br>My favorite language:" +
                "<select name = 'first'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                "</select></label>" +
                "<label><br>My second favorite language:" +
                "<select name = 'second'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                "</select></label>" +
                "<label><br>My third favorite language:" +
                "<select name = 'third'>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'Python'>Python</option>" +
                "</select></label><br>" +
                "<input type = 'submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
