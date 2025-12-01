import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class AccountSteps {

    @Step("Проверяем корректность имени: {account.name}")
    public void checkNameToEmbossTrueStep(Account account) {
        boolean result = account.checkNameToEmboss();
        Assertions.assertTrue(result);
    }

    @Step("Проверяем некорректность имени: {account.name}")
    public void checkNameToEmbossFalseStep(Account account) {
        boolean result = account.checkNameToEmboss();
        Assertions.assertFalse(result);
    }
}
