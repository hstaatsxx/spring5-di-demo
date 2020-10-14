package guru.springframework.examplebeans;

/**
 * created on 14/10/2020 - 17:40
 * project di-demo
 *
 * @author Hyunjin
 */
public class FakeJamesBroker {
    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
