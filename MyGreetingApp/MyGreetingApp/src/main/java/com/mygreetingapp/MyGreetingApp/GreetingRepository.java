package com.mygreetingapp.MyGreetingApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
