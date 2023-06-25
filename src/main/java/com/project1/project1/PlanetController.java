package com.project1.project1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping
class PlanetController {
    // Object
    @GetMapping("/planet")
    Map<String, Object> getPlanet() {
        Map<String, Object> planet = new HashMap<>();
        planet.put("id", 1);
        planet.put("name", "Mercury");
        planet.put("diameter", 5731.984);
        return planet;
    }

    // Array
    @GetMapping("/planets")
    String[] getPlanets() {
        return new String[]{ "Mercury", "Venus", "Earth" };
    }

    // ArrayList
    @GetMapping("/planet-list")
    List<String> getPlanetList() {
        List<String> planetList = new ArrayList<>();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        return planetList;
    }
}
