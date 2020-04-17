package service;

import entity.Area;
import entity.KFC;

import java.util.List;

public interface KFCService {

    List<KFC> findAll();

    List<KFC> findKFCByArea(int area_id);

    void insert(KFC kfc);

    List<Area> findAllArea();
}
