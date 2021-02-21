import java.util.*;

public class Information {

    private List<String> pseudonym;
    private Set<String> hashMail;
    private Map<Set<String>, List<String>> mailPseudonym;

    public Information() {
        pseudonym = new ArrayList<>();
        hashMail = new HashSet<>();
        mailPseudonym = new HashMap<>();
    }

    public List<String> getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(List<String> pseudonym) {
        this.pseudonym = pseudonym;
    }

    public Set<String> getHashMail() {
        return hashMail;
    }

    public void setHashMail(Set<String> hashMail) {
        this.hashMail = hashMail;
    }

    public Map<Set<String>, List<String>> getMailPseudonym() {
        return mailPseudonym;
    }

    public void setMailPseudonym(Map<Set<String>, List<String>> mailPseudonym) {
        this.mailPseudonym = mailPseudonym;
    }
}
