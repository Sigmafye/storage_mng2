package com.ynu.service;

import com.ynu.pojo.WareMnger;

import java.util.List;

public interface WareMngerService {

    public WareMnger validate(WareMnger wareMnger);

    public List<WareMnger> getWareMngerList();

    public List<Integer> getIdList();

    public WareMnger search(WareMnger wareMnger);

    public boolean add(WareMnger wareMnger);

    public boolean delete(int id);

    public boolean update(WareMnger wareMnger);

    public List<WareMnger> searchByName(String m_name);
}
