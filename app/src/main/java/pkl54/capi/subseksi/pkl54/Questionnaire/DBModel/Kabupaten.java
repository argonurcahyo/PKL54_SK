package pkl54.capi.subseksi.pkl54.Questionnaire.DBModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 22/02/2015.
 */
@Table(name = "Kabupaten")
public class Kabupaten extends Model {

    @Column(name = "kodeKabupaten", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String kodeKabupaten;

    @Column(name = "kabupaten")
    public String kabupaten;

    public Kabupaten() {
        super();
    }

    public Kabupaten(String kodeKabupaten, String kabupaten) {
        super();
        this.kodeKabupaten = kodeKabupaten;
        this.kabupaten = kabupaten;
    }

    public List<Kabupaten> getKabupaten(String kabupaten) {
        return new Select()
                .from(Kabupaten.class)
                .where("kabupaten = '" + kabupaten + "'")
                .execute();
    }
}
