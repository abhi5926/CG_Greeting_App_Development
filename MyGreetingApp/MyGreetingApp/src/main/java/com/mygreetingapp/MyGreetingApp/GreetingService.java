package com.mygreetingapp.MyGreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GreetingService
{
    @Autowired
   private GreetingRepository greetingRepository;
    
    public String getGreeting() {
        return "Hello World";
    }
    
     public String getGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            return "Hello " + firstName;
        } else if (lastName != null) {
            return "Hello " + lastName;
        } else {
            return "Hello World";
        }
    }
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).orElse(null);
    }
   public Greeting saveGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }
    public Greeting updateGreeting(Greeting greeting) {
        return greetingRepository.save(greeting);
    }
    public void deleteGreeting(Long id) {
        greetingRepository.deleteById(id);
    }
}
