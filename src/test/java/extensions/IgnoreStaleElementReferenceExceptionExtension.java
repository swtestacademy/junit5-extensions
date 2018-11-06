package extensions;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.openqa.selenium.StaleElementReferenceException;

public class IgnoreStaleElementReferenceExceptionExtension implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable)
            throws Throwable {
        if (throwable instanceof StaleElementReferenceException) {
            return;
        }
        throw throwable;
    }
}
