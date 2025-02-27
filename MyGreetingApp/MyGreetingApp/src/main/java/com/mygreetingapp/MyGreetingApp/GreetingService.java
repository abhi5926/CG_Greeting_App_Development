package com.mygreetingapp.MyGreetingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GreetingService
{
   
    public String getGreeting() {
        return "Hello World";
    }

}
