package pkl54.capi.subseksi.pkl54.Questionnaire.DBModel;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by EKI on 23/02/2015.
 */
@Table(name = "BlokSensus")
public class BlokSensus extends Model {
    @Column(name = "kodeBlokSensus")
    public String kodeBlokSensus;

    @Column(name = "kodeKelurahan")
    public String kodeKelurahan;

    @Column(name = "kodeKecamatan")
    public String kodeKecamatan;

    @Column(name = "kodeKabupaten")
    public String kodeKabupaten;

    public BlokSensus() {
        super();
    }

    public BlokSensus(String kodeBlokSensus, String kodeKelurahan, String kodeKecamatan, String kodeKabupaten) {
        super();
        this.kodeBlokSensus = kodeBlokSensus;
        this.kodeKelurahan = kodeKelurahan;
        this.kodeKecamatan = kodeKecamatan;
        this.kodeKabupaten = kodeKabupaten;
    }
}
