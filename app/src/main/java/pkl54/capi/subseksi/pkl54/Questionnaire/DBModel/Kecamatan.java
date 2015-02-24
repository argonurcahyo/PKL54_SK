package pkl54.capi.subseksi.pkl54.Questionnaire.DBModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 22/02/2015.
 */

@Table(name = "Kecamatan")
public class Kecamatan extends Model {

    @Column(name = "kecamatan", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String kecamatan;

    @Column(name = "kodeKecamatan")
    public String kodeKecamatan;

    @Column(name = "kodeKabupaten")
    public String kodeKabupaten;

    public Kecamatan() {
        super();
    }

    public Kecamatan(String kecamatan, String kodeKecamatan, String kodeKabupaten) {
        super();
        this.kodeKecamatan = kodeKecamatan;
        this.kecamatan = kecamatan;
    }

    public List<Kecamatan> getKecamatan(String kecamatan) {
        return new Select()
                .from(Kecamatan.class)
                .where("kecamatan = '" + kecamatan + "'")
                .execute();
    }
}
