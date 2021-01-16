package com.ynu.mapper;

import com.ynu.pojo.SuperMnger;

import java.util.List;

public interface SuperMngerMapper {

    public List<SuperMnger> getSuperList();

    public SuperMnger search(int su_id);

    public SuperMnger validate(SuperMnger superMnger);

    public boolean add(SuperMnger superMnger);

    public boolean delete(int su_id);

    public boolean update(SuperMnger superMnger);

}
