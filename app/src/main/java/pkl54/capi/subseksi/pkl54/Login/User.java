package pkl54.capi.subseksi.pkl54.Login;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 14/02/2015.
 */
@Table(name = "User")
public class User extends Model {

    @Column(name = "nim", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String nim;

    @Column(name = "password")
    public String password;

    @Column(name = "name")
    public String name;

    @Column(name = "nimKortim")
    public String nimKortim;

    public User() {
        super();
    }

    public User(String nim, String password, String name, String nimKortim) {
        super();
        this.nim = nim;
        this.password = password;
        this.name = name;
        this.nimKortim = nimKortim;
    }

    public List<User> login(String nim, String password) {
        return new Select()
                .from(User.class)
                .where("nim = '" + nim + "' AND password = '" + password + "'")
                .execute();
    }
}
