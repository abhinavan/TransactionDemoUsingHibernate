package com.abhinavan.TransactionDemoUsingHibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface GreetingController
{
    @GetMapping("/greeting")
    String greeting();
}
