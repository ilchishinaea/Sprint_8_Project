import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

public class AccountTest {

    private final AccountSteps accountSteps = new AccountSteps();

    Account acc;

    @Test
    @Description("Возвращается true, если все проверки пройдены и имя 3 символа")
    public void validNameWith3CharactersReturnsTrue() {
        acc = new Account("И И");
        accountSteps.checkNameToEmbossTrueStep(acc);
    }

    @Test
    @Description("Возвращается true, если все проверки пройдены и имя 19 символов")
    public void validNameWith19CharactersReturnsTrue() {
        acc = new Account("Александр Коновалов");
        accountSteps.checkNameToEmbossTrueStep(acc);
    }

    @Test
    @Description("Возвращается false, если в строке ничего нет")
    public void emptyNameReturnsFalse(){
        acc = new Account("");
        accountSteps.checkNameToEmbossFalseStep(acc);
    }

    @Test
    @Description("Возвращается false, если есть пробел в начале")
    public void nameStartingWithSpaceReturnsFalse(){
        acc = new Account(" Тест Тестов");
        accountSteps.checkNameToEmbossFalseStep(acc);
    }

    @Test
    @Description("Возвращается false, если есть пробел в конце")
    public void nameEndingWithSpaceReturnsFalse(){
        acc = new Account("Тест Тестов ");
        accountSteps.checkNameToEmbossFalseStep(acc);
    }

    @Test
    @Description("Возвращается false, если есть пробел в начале и конце")
    public void nameStartingAndEndingWithSpaceReturnsFalse(){
        acc = new Account(" Тест Тестов ");
        accountSteps.checkNameToEmbossFalseStep(acc);
    }

    @Test
    @Description("Возвращается false, если нет пробела внутри")
    public void nameWithoutInnerSpaceReturnsFalse(){
        acc = new Account("ТестТестов");
        accountSteps.checkNameToEmbossFalseStep(acc);
    }

    @Test
    @Description("Возвращается false, если внутри больше одного пробела")
    public void nameWithMultipleInnerSpacesReturnsFalse(){
        acc = new Account("Т ест Тестов");
        accountSteps.checkNameToEmbossFalseStep(acc);
    }

    @Test
    @Description("Возвращается false, если имя короче 3 символов")
    public void nameShorterThan3CharactersReturnsFalse(){
        acc = new Account("ТР");
        accountSteps.checkNameToEmbossFalseStep(acc);
    }

    @Test
    @Description("Возвращается false, если имя больше 19 символов")
    public void nameLongerThan19CharactersReturnsFalse(){
        acc = new Account("Александра Вазочкина");
        accountSteps.checkNameToEmbossFalseStep(acc);
    }
}
