package extensions;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExecutionConditionExtension implements ExecutionCondition {

    private static String propertyFilePath = System.getProperty("user.dir")+
            "/src/test/java/resources/junit-platform.properties";

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context)  {

        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(propertyFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String environment = prop.getProperty("environment");
        if (environment.equals("development")) {
            return ConditionEvaluationResult.disabled("Test disabled on Development environment.");
        }

        return ConditionEvaluationResult.enabled(
                "Test enabled on Test environment");
    }
}
