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
import com.alexatest.vibhuti.helloalexavibhuti.handlers.AdditionIntentHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.DivisionIntentHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.MultiplicationIntentHandler;
import com.alexatest.vibhuti.helloalexavibhuti.handlers.SubstractionIntentHandler;



public class HelloWorldStreamHandler extends SkillStreamHandler {

    @SuppressWarnings("unchecked")
	private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new AdditionIntentHandler(),
                        new MultiplicationIntentHandler(),
                        new DivisionIntentHandler(),
                        new SubstractionIntentHandler(),
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