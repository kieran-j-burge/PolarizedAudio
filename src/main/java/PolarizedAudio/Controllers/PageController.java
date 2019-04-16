package PolarizedAudio.Controllers;

import PolarizedAudio.Services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {

    private EventsService eventsService;

    @Autowired
    public PageController(EventsService eventsService) {
        this.eventsService = eventsService;
    }

    @RequestMapping(value = "/PA", method = RequestMethod.GET)
    public String getMenuPage(){

        return "webpages/PA";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage(){

        return "webpages/home";
    }

    @RequestMapping(value = "/shop", method = RequestMethod.GET)
    public String getShopPage(){

        return "webpages/shop";
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public String getEventsPage(Model model){

        model.addAttribute("event_list",eventsService.getAllLiveEvents());

        return "webpages/events";
    }
}
