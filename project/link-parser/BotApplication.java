@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
public class BotApplication {
  public static void main(String[] args) {
      var ctx = SpringApplication.run(BotApplication.class, args);
      ApplicationConfig config = ctx.getBean(ApplicationConfig.class);
      String link = "https://github.com/sanyarnd/tinkoff-java-course-2022/";
      LinkParser parser = LinkParserFactory.createLinkParser(link);
      LinkInfo linkInfo = parser.parseLink(link);
      System.out.println(linkInfo);
  }
}

