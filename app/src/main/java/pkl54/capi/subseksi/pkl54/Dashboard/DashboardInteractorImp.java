package pkl54.capi.subseksi.pkl54.Dashboard;

import java.util.ArrayList;
import java.util.List;

import pkl54.capi.subseksi.pkl54.Questionnaire.DBModel.Blok1Model;

/**
 * Created by EKI on 17/02/2015.
 */
public class DashboardInteractorImp implements DashboardInteractor {

    private Blok1Model blok1Model;

    @Override
    public void populateListView(final OnFinishPopulate onFinishPopulate) {
        List<Blok1Model> completedQuestionnaire;
        blok1Model = new Blok1Model();
        completedQuestionnaire = blok1Model.getCompletedQuest();
        ArrayList<String> listString = new ArrayList<>();
        for (int i = 0; i < completedQuestionnaire.size(); i++) {
            listString.add(completedQuestionnaire.get(i).nks);
        }
        onFinishPopulate.setData(listString);
    }
}
