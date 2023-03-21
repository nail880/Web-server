public class GitHubLinkParser implements LinkParser {

    @Override
    public LinkInfo parseLink(String link) {
       
        return new LinkInfo("github", id);
    }
}
