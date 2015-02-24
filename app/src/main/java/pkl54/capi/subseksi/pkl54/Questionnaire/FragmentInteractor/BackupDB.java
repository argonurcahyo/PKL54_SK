package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentInteractor;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by EKI on 23/02/2015.
 */
public class BackupDB {
    private static final String PACKAGE_NAME = "com.argo.android.capi_sk_blok3_sp";
    private static final String DATABASE_NAME = "PKL54.db";
    private static String DATABASE_NAME_EKSPORT;
    SimpleDateFormat formattanggal;
    Date tanggal;
    java.sql.Date sqlDate;
    Context context;

    public BackupDB(Context context) {
        this.context = context;
        formattanggal = new SimpleDateFormat("yyyy/mm/dd");
        tanggal = new Date();
        sqlDate = new java.sql.Date(tanggal.getTime());
        DATABASE_NAME_EKSPORT = DATABASE_NAME.substring(0, DATABASE_NAME.length() - 3) + "_" + sqlDate.toString() + ".db";
        exportDB();
    }

    public void exportDB() {
        try {
            File sd = Environment.getExternalStorageDirectory();

            if (sd.canWrite()) {
                File dbFile = context.getDatabasePath(DATABASE_NAME);
                String currentDBPath = dbFile.getPath();
                String backupDBPath = "/CAPI_Backup/" + DATABASE_NAME_EKSPORT;

                File currentDB = new File(currentDBPath);
                File backupDB = new File(sd, backupDBPath);
                File path = new File(sd.getPath() + "/CAPI_Backup/");
                path.mkdir();

                FileChannel src = new FileInputStream(currentDB).getChannel();
                FileChannel dst = new FileOutputStream(backupDB).getChannel();
                dst.transferFrom(src, 0, src.size());

                src.close();
                dst.close();

                Toast.makeText(context, "Backup berhasil", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(context, "Backup gagal", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
