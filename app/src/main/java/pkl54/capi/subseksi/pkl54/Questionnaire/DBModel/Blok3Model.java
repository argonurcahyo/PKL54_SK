package pkl54.capi.subseksi.pkl54.Questionnaire.DBModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by EKI on 19/02/2015.
 */
@Table(name = "Blok3Model")
public class Blok3Model extends Model {

    @Column(name = "nksb1")
    public String nksb1;

    @Column(name = "nksb3", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String nksb3;

    @Column(name = "b3r1")
    public String b3r1;

    @Column(name = "b3r2")
    public String b3r2;

    @Column(name = "b3r3")
    public String b3r3;

    @Column(name = "b3r4s1")
    public String b3r4s1;

    @Column(name = "b3r4s2")
    public String b3r4s2;

    @Column(name = "b3r5s1")
    public String b3r5s1;

    @Column(name = "b3r5s2")
    public String b3r5s2;

    @Column(name = "b3r6")
    public String b3r6;

    @Column(name = "b3r7")
    public String b3r7;

    @Column(name = "b3r8s1d1")
    public String b3r8s1d1;

    @Column(name = "b3r8s1d2")
    public String b3r8s1d2;

    @Column(name = "b3r8s1d3")
    public String b3r8s1d3;

    @Column(name = "b3r8s1d4")
    public String b3r8s1d4;

    @Column(name = "b3r8s2")
    public String b3r8s2;

    @Column(name = "b3r9")
    public String b3r9;

    @Column(name = "b3r10")
    public String b3r10;

    @Column(name = "b3r11")
    public String b3r11;

    @Column(name = "b3r12")
    public String b3r12;

    @Column(name = "b3r13")
    public String b3r13;

    @Column(name = "b3r14")
    public String b3r14;

    public Blok3Model() {
        super();
    }

    public Blok3Model(String nksb1, String nksb3, String b3r1, String b3r2, String b3r3, String b3r4s1, String b3r4s2, String b3r5s1, String b3r5s2, String b3r6, String b3r7, String b3r8s1d1, String b3r8s1d2, String b3r8s1d3, String b3r8s1d4, String b3r8s2, String b3r9, String b3r10, String b3r11, String b3r12, String b3r13, String b3r14) {
        super();
        this.nksb1 = nksb1;
        this.nksb3 = nksb3;
        this.b3r1 = b3r1;
        this.b3r2 = b3r2;
        this.b3r3 = b3r3;
        this.b3r4s1 = b3r4s1;
        this.b3r4s2 = b3r4s2;
        this.b3r5s1 = b3r5s1;
        this.b3r5s2 = b3r5s2;
        this.b3r6 = b3r6;
        this.b3r7 = b3r7;
        this.b3r8s1d1 = b3r8s1d1;
        this.b3r8s1d2 = b3r8s1d2;
        this.b3r8s1d3 = b3r8s1d3;
        this.b3r8s1d4 = b3r8s1d4;
        this.b3r8s2 = b3r8s2;
        this.b3r9 = b3r9;
        this.b3r10 = b3r10;
        this.b3r11 = b3r11;
        this.b3r12 = b3r12;
        this.b3r13 = b3r13;
        this.b3r14 = b3r14;
    }

    public static List<Blok3Model> getAll() {
        return new Select()
                .from(Blok3Model.class)
                .execute();
    }
}
