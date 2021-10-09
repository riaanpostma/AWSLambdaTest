package com.obw.test.welcomelambda;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class WelcomeLambdaTestTest {

    private static Object input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = new String ("Test User");
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("WelcomeLambdaTest");

        return ctx;
    }

    @Test
    public void testLambdaFunctionHandler() {
        WelcomeLambdaTest handler = new WelcomeLambdaTest();
        Context ctx = createContext();

        String output = handler.handleRequest(input, ctx);

        // TODO: validate output here if needed.
        Assert.assertEquals("Hello from Lambda!_"+ctx.getFunctionVersion(), output);
    }
}
