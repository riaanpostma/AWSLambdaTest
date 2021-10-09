package com.obw.test.welcomelambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WelcomeLambdaTest implements RequestHandler<Object, String> {
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input.toString());
        context.getLogger().log("Input gson...: " + gson.toJsonTree(input));
        context.getLogger().log("Function Version: " + context.getFunctionVersion());

        // TODO: implement your handler
        return "Hello from Lambda!_" + context.getFunctionVersion();
    }

}
