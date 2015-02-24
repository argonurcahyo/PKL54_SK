package pkl54.capi.subseksi.pkl54.Questionnaire.FragmentPresenter;

/**
 * Created by EKI on 17/02/2015.
 */
public interface Blok1Presenter {
    public void validateB1R1(String data);
    public void validateB1R2(String data);
    public void validateB1R3(String data);
    public void validateB1R4(int data);
    public void validateB1R5(String data);
    public void validateB1R6(String data);
    public void validateB1R7(String data);
    public void validateB1R8(String data1);
    public void validateB1R9(String data);
    public void validateB1R10(String data);
    public void validateAll();
    public void saveData(String nksb1, String nim, String name, String nimKortim, String namaKortim);
}
