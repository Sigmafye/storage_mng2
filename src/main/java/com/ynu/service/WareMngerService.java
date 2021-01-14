package com.ynu.service;

import com.ynu.pojo.WareMnger;

public interface WareMngerService {

    public WareMnger getWareMngerList();

    public WareMnger search(WareMnger wareMnger);

    public boolean add(WareMnger wareMnger);

    public boolean delete(int id);

    public boolean update(WareMnger wareMnger);
}
