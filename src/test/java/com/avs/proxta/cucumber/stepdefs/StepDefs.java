package com.avs.proxta.cucumber.stepdefs;

import com.avs.proxta.ProxtaApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ProxtaApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
