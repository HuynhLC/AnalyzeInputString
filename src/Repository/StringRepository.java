package Repository;

import DataAccess.StringDAO;

public class StringRepository implements IStringRepository{

    @Override
    public void analysisString() {
        StringDAO.Instance().analysisString();
    }
           
}