package pkl54.capi.subseksi.pkl54.Questionnaire.DBModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 19/02/2015.
 */
@Table(name = "Blok1Model")
public class Blok1Model extends Model {

    @Column(name = "nks", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String nks;

    @Column(name = "b1r1")
    public String b1r1;

    @Column(name = "b1r2")
    public String b1r2;

    @Column(name = "b1r3")
    public String b1r3;

    @Column(name = "b1r4")
    public String b1r4;

    @Column(name = "b1r5")
    public String b1r5;

    @Column(name = "b1r6")
    public String b1r6;

    @Column(name = "b1r7")
    public String b1r7;

    @Column(name = "b1r8")
    public String b1r8;

    @Column(name = "b1r9")
    public String b1r9;

    @Column(name = "b1r10")
    public String b1r10;

    @Column(name = "nim")
    public String nim;

    @Column(name = "flag")
    public String flag;

    @Column(name = "timestamp")
    public long timestamp;

    @Column(name = "hasCompleted")
    public String hasCompleted;

    @Column(name = "hasSent")
    public String hasSent;

    public Blok1Model() {
        super();
    }

    public Blok1Model(String nks, String b1r1, String b1r2, String b1r3, String b1r4, String b1r5, String b1r6, String b1r7, String b1r8, String b1r9, String b1r10, String nim, String flag, long timestamp, String hasCompleted, String hasSent) {
        super();
        this.nks = nks;
        this.b1r1 = b1r1;
        this.b1r2 = b1r2;
        this.b1r3 = b1r3;
        this.b1r4 = b1r4;
        this.b1r5 = b1r5;
        this.b1r6 = b1r6;
        this.b1r7 = b1r7;
        this.b1r8 = b1r8;
        this.b1r9 = b1r9;
        this.b1r10 = b1r10;
        this.nim = nim;
        this.flag = flag;
        this.timestamp = timestamp;
        this.hasCompleted = hasCompleted;
        this.hasSent = hasSent;
    }

    public static List<Blok1Model> getAll() {
        return new Select()
                .from(Blok1Model.class)
                .execute();
    }

    public List<Blok1Model> getCompletedQuest() {
        return new Select()
                .from(Blok1Model.class)
                .where("hasCompleted = 'true'")
                .execute();
    }
}
