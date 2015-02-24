package pkl54.capi.subseksi.pkl54.Questionnaire.DBModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 19/02/2015.
 */

@Table(name = "Blok2Model")
public class Blok2Model extends Model {

    @Column(name = "nksb1")
    public String nksb1;

    @Column(name = "nksb2", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String nksb2;

    @Column(name = "b2r1s1")
    public String b2r1s1;

    @Column(name = "b2r1s2")
    public String b2r1s2;

    @Column(name = "b2r2s1")
    public String b2r2s1;

    @Column(name = "b2r2s2")
    public String b2r2s2;

    @Column(name = "b2r3s1d1")
    public String b2r3s1d1;

    @Column(name = "b2r3s1d2")
    public String b2r3s1d2;

    @Column(name = "b2r3s2d1")
    public String b2r3s2d1;

    @Column(name = "b2r3s2d2")
    public String b2r3s2d2;

    public Blok2Model() {
        super();
    }

    public Blok2Model(String nksb1, String nksb2, String b2r1s1, String b2r1s2, String b2r2s1, String b2r2s2, String b2r3s1d1, String b2r3s1d2, String b2r3s2d1, String b2r3s2d2) {
        super();
        this.nksb1 = nksb1;
        this.nksb2 = nksb2;
        this.b2r1s1 = b2r1s1;
        this.b2r1s2 = b2r1s2;
        this.b2r2s1 = b2r2s1;
        this.b2r2s2 = b2r2s2;
        this.b2r3s1d1 = b2r3s1d1;
        this.b2r3s1d2 = b2r3s1d2;
        this.b2r3s2d1 = b2r3s2d1;
        this.b2r3s2d2 = b2r3s2d2;
    }

    public static List<Blok2Model> getAll() {
        return new Select()
                .from(Blok2Model.class)
                .execute();
    }
}
