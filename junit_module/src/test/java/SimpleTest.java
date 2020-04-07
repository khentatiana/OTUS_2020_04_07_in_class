import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.WebDriver;


public class SimpleTest {

    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(SimpleTest.class);

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");
    }
    @Test
    public void openPage() {
        driver.get("https://otus.ru/");
        logger.info("Открыта страница отус");
    }

    @After
    public void setDown() {
        if (driver != null) {
            driver.quit();
        }
    }
} 