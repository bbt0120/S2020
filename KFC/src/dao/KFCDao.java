package dao;

import entity.Area;
import entity.KFC;

import java.util.List;

public interface KFCDao {

    List<KFC> findAll();

    List<KFC> findKFCByArea(KFC kfc);

    void insert(KFC kfc);

    List<Area> findAllArea();
 }
