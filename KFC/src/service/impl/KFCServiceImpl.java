package service.impl;

import dao.KFCDao;
import entity.Area;
import entity.KFC;
import org.apache.ibatis.session.SqlSession;
import service.KFCService;
import util.MyBatisUtil;

import java.util.List;

public class KFCServiceImpl implements KFCService {

    @Override
    public List<KFC>  findAll() {
        SqlSession session = null;
        try {
            session = MyBatisUtil.createSqlSession();
            return session.getMapper(KFCDao.class).findAll();
        } catch (Exception e) {
            return null;
        } finally {
            MyBatisUtil.closeSqlSession(session);
        }
    }

    @Override
    public List<KFC> findKFCByArea(int area_id) {
        SqlSession session = null;
        try {
            session = MyBatisUtil.createSqlSession();
            KFC kfc = new KFC();
            kfc.setArea_id(area_id);
            return session.getMapper(KFCDao.class).findKFCByArea(kfc);
        } catch (Exception e) {
            return null;
        } finally {
            MyBatisUtil.closeSqlSession(session);
        }
    }

    @Override
    public void insert(KFC kfc) {
        SqlSession session = null;
        try{
            session = MyBatisUtil.createSqlSession();
            session.getMapper(KFCDao.class).insert(kfc);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
            session.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(session);
        }
    }

    @Override
    public List<Area> findAllArea() {
        SqlSession session = null;
        try {
            session=MyBatisUtil.createSqlSession();
            return  session.getMapper(KFCDao.class).findAllArea();
        } catch (Exception e) {
            return null;
        } finally {
            MyBatisUtil.closeSqlSession(session);
        }
    }
}
