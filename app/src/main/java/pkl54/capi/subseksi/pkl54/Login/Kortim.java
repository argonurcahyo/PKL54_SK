package pkl54.capi.subseksi.pkl54.Login;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 22/02/2015.
 */
@Table(name = "Kortim")
public class Kortim extends Model {

    @Column(name = "nimKortim", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String nimKortim;

    @Column(name = "namaKortim")
    public String namaKortim;

    public Kortim() {
        super();
    }

    public Kortim(String nimKortim, String namaKortim) {
        super();
        this.nimKortim = nimKortim;
        this.namaKortim = namaKortim;
    }

    public List<Kortim> getKortim(String nim) {
        return new Select()
                .from(Kortim.class)
                .where("nimKortim = '" + nim + "'")
                .execute();
    }
}
