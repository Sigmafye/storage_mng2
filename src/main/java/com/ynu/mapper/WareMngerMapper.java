package com.ynu.mapper;

import com.ynu.pojo.WareMnger;
public interface WareMngerMapper {

    public WareMnger getWareMngerList();

    public WareMnger search(WareMnger wareMnger);

    public boolean add(WareMnger wareMnger);

    public boolean delete(int m_id);

    public boolean update(WareMnger wareMnger);
}
