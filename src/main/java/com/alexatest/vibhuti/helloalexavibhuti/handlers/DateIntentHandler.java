package com.alexatest.vibhuti.helloalexavibhuti.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class DateIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		 return input.matches(intentName("DateIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String ans2 = "Hi Vibhuti, The date is";
		String ans = dateFormat.format(date);
		 return input.getResponseBuilder()
	                .withSpeech(ans2 + ans)
	                .withSimpleCard("TheCurrentDateIs", ans)
	                .build();
	}

}
