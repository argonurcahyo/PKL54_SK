package pkl54.capi.subseksi.pkl54.Questionnaire.DBModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 19/02/2015.
 */

@Table(name = "b2")
public class b2 extends Model {
    // This is the unique id given by the server

    @Column(name="nksb1", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String nksb1;

    @Column(name = "b2r1s1")
    public String b2r1s1;

    @Column(name = "b2r1s2")
    public String b2r1s2;

    @Column(name = "b2r1s3")
    public String b2r1s3;

    public b2() {
        super();
    }

    public b2(String nksb1, String b2r1s1, String b2r1s2, String b2r1s3) {
        super();
        this.nksb1 = nksb1;
        this.b2r1s1 = b2r1s1;
        this.b2r1s2 = b2r1s2;
        this.b2r1s3 = b2r1s3;
    }
}
