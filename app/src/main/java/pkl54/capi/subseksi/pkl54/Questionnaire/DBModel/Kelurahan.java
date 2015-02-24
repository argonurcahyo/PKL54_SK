package pkl54.capi.subseksi.pkl54.Questionnaire.DBModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 22/02/2015.
 */
@Table(name = "Kelurahan")
public class Kelurahan extends Model {

    @Column(name = "kelurahan", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String kelurahan;

    @Column(name = "kodeKelurahan")
    public String kodeKelurahan;

    @Column(name = "kodeKecamatan")
    public String kodeKecamatan;

    @Column(name = "kodeKabupaten")
    public String kodeKabupaten;

    public Kelurahan() {
        super();
    }

    public Kelurahan(String kelurahan, String kodeKelurahan, String kodeKecamatan, String kodeKabupaten) {
        super();
        this.kelurahan = kelurahan;
        this.kodeKelurahan = kodeKelurahan;
        this.kodeKecamatan = kodeKecamatan;
        this.kodeKabupaten = kodeKabupaten;
    }

    public List<Kelurahan> getAll() {
        return new Select()
                .from(Kelurahan.class)
                .execute();
    }

    public List<Kelurahan> getKelurahan(String kelurahan) {
        return new Select()
                .from(Kelurahan.class)
                .where("kelurahan = '" + kelurahan + "'")
                .execute();
    }
}