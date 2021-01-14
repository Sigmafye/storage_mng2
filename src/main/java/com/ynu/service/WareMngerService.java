package com.ynu.service;

import com.ynu.pojo.WareMnger;

import java.util.List;

public interface WareMngerService {

    public List<WareMnger> getWareMngerList();

    public WareMnger search(WareMnger wareMnger);

    public boolean add(WareMnger wareMnger);

    public boolean delete(int id);

    public boolean update(WareMnger wareMnger);
}
