package com.alexatest.vibhuti.helloalexavibhuti.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler {
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }

    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Welcome to the Alexa Skills Kit sample. What would you like to know";
        String repromptText = "Please tell me what would you like to know?";
        return input.getResponseBuilder()
                .withSimpleCard("ColorSession", speechText)
                .withSpeech(speechText)
                .withReprompt(repromptText)
                .build();
    }
}