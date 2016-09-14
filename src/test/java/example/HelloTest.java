package example;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class HelloTest {

	private static String input;

	@BeforeClass
	public static void createInput() throws IOException {
		input = "Toto";
	}

	private Context createContext() {
		TestContext ctx = new TestContext();
		ctx.setFunctionName("Yop");
		return ctx;
	}

	@Test
	public void testHello() {
		Hello handler = new Hello();
		Context ctx = createContext();
		Object output = handler.handleRequest(input, ctx);
		System.out.println(output.toString());
	}
}
