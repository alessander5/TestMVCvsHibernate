package com.infy.dao;

import com.infy.domein.FileInfo;
import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import java.util.List;

/**
 * Created by Infy on 23.05.2016.
 */
public class FileInfoDaoImpl extends AbstractDao<Integer, FileInfo> implements IFileInfoDao {

    @Override
    public void save(FileInfo fi) {
        saveOrUpdate(fi);
    }

    @Override
    public void remove(FileInfo fi) {
        delete(fi);
    }

    @Override
    public void removeById(int id) {
        remove(getByKey(id));
    }

    @Override
    public List<FileInfo> getList() {

        Transaction trans = getSession().beginTransaction();
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("file_name"));
        //criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<FileInfo> list = criteria.list();
        trans.commit();
        return list;
    }
}
