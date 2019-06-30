package com.simple.orm.componet.feature.lambadInterface;

import com.simple.orm.componet.feature.DynamicTypeSelect;

import javax.persistence.criteria.Predicate;

@FunctionalInterface
public interface DynamicTypeAssembly<T>  {
    public Predicate assembly(DynamicTypeSelect<T> dynamicTypeSelect);
}
