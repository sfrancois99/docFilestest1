package test.ihmcomposant.app;

import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import test.ihmcomposant.persistance.DatabaseStub;
import test.ihmcomposant.persistance.DocFile;

/**
 *
 * @author Sébastien FRANCOIS
 */
public class IHMDocFilesListModel extends AbstractListModel{
    private final List<DocFile> liste;
    
    public IHMDocFilesListModel(DatabaseStub data) {
        this.liste = data.getDocFiles();
    }
    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Object getElementAt(int index) {
        return liste.get(index).getName();
    }
    
    public void removeElementAt(int index) {
        liste.remove(index);
        fireIntervalRemoved(liste, index, index);
    }
    
    public Object get(int index) {
        return liste.get(index);
    }
}
