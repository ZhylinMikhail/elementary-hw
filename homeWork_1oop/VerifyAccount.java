import java.io.FileNotFoundException;
import java.io.IOException;

public interface VerifyAccount {
    public void writeAccount(Accounts accounts) throws IOException;

    public void CheckAccount(Accounts accounts) throws FileNotFoundException;
}
