package com.alexatest.vibhuti.helloalexavibhuti;



import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.CancelandStopIntentHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.HelloWorldIntentHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.HelpIntentHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.LaunchRequestHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.SessionEndedRequestHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.FallbackIntentHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.DateIntentHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.JurassicParkIntentHandler;


public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new JurassicParkIntentHandler(),
                        new DateIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                // Add your skill id below
                //.withSkillId("")
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}