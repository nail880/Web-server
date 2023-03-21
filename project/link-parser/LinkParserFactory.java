public class LinkParserFactory {

    public static LinkParser createLinkParser(String link) {
        if (link.contains("github.com")) {
            return new GitHubLinkParser();
        } else if (link.contains("stackoverflow.com")) {
            return new StackOverflowLinkParser();
        } else {
            throw new IllegalArgumentException("Unsupported link type");
        }
    }
}

