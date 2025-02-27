package com.mygreetingapp.MyGreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController
{

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/get")
    public String getGreeting(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName) {
        return  greetingService.getGreeting(firstName, lastName);
    }

    @PostMapping("/post")
    public Greeting createGreeting(@RequestBody Greeting greeting) {
        return greetingService.saveGreeting(greeting);
    }

    @GetMapping("/get/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return greetingService.getGreetingById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    @PutMapping("/update")
    public Greeting updateGreeting(@RequestBody Greeting greeting) {
        return greetingService.updateGreeting(greeting);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGreeting(@PathVariable Long id) {
        greetingService.deleteGreeting(id);
    }

}
