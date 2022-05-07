package day45_Abstraction.browserTask;

public class RemoteWebDriver implements WebDriver, TakeScreenShot, JavaScriptExecutor {

    private final String browserName;

    public RemoteWebDriver(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }

    @Override
    public String findElement(String locator) {
        return null;
    }

    @Override
    public String findElements(String locator) {
        return null;
    }

    @Override
    public void get(String url) {

    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public void getTitle() {

    }

    @Override
    public void takeScreenShot() {

    }

    @Override
    public void executeScript(String script) {

    }
}
