package oit.is.z1260.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z1260.kaizi.janken.model.Janken;

@Controller
@RequestMapping("/lec02")
public class Lec02Controller {
  @GetMapping
  public String lec02_get() {
    return "lec02.html";
  }

  /**
   * @param name
   * @param model
   * @return
   */

  @PostMapping
  public String lec02_post(@RequestParam String name, ModelMap model) {
    System.out.println("lec02");
    Janken janken = new Janken();
    janken.setName(name);
    model.addAttribute("name", janken.getName());
    return "lec02.html";
  }

  @GetMapping("{userHand}")
  public String lec02_0(@PathVariable Integer userHand, ModelMap model) {
    System.out.println("lec02/" + userHand);
    Janken janken0 = new Janken();
    janken0.jankenPon(userHand);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {

    }
    String o_userHand = janken0.convertHand(janken0.getUserHand());
    String o_cpHand = janken0.convertHand(janken0.getCpHand());
    String o_score = janken0.convertScore(janken0.getUserScore());
    System.out.println("userHand:" + janken0.getUserHand());
    System.out.println("cpHand  :" + janken0.getCpHand());
    System.out.println("score   :" + janken0.getUserScore());
    model.addAttribute("userHand", o_userHand);
    model.addAttribute("cpHand", o_cpHand);
    model.addAttribute("score", o_score);
    return "lec02.html";
  }
}
