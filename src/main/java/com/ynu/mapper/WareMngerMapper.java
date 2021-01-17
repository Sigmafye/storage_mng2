package com.ynu.mapper;

import com.ynu.pojo.WareMnger;

import java.util.List;

public interface WareMngerMapper {

    public WareMnger validate(WareMnger wareMnger);

    public List<WareMnger> getWareMngerList();

    public List<Integer> getIdList();

    public WareMnger search(WareMnger wareMnger);

    public boolean add(WareMnger wareMnger);

    public boolean delete(int m_id);

    public boolean update(WareMnger wareMnger);


    public List<WareMnger> searchByName(String m_name);
}
