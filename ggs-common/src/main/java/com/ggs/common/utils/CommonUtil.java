package com.ggs.common.utils;

import com.ggs.common.base.BaseKey;
import com.ggs.common.contants.PageConstant;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class CommonUtil {

    public static PageRequest getPageable(BaseKey key) {
        initKey(key);
        Sort sort = new Sort(Sort.Direction.fromString(key.getDirection()), key.getSortField());
        if (Objects.isNull(key.getIsDefaultSort()) && !key.getIsDefaultSort())
            sort = null;
        return PageRequest.of(key.getPageNo(), key.getPageSize(), sort);
    }


    public static void initKey(BaseKey key) {
        if (StringUtils.isBlank(key.getSortField()))
            key.setSortField(PageConstant.DEF_SORT_FIELD);
        if (StringUtils.isBlank(key.getDirection()))
            key.setDirection(PageConstant.DEF_DIRECTION);
        if (Objects.isNull(key.getPageNo()))
            key.setPageNo(PageConstant.DEF_PAGE);
        if (Objects.isNull(key.getPageSize()))
            key.setPageSize(PageConstant.DEF_SIZE);
    }

    public static <T, E> List<E> Info2Vo(List<T> infos, Function<? super T, ? extends E> mapper) {
        if (CollectionUtils.isEmpty(infos))
            return Lists.newArrayList();
        return infos.stream().map(mapper).collect(Collectors.toList());
    }

    public static <T, E> E copyProperties(T info, Class<E> beanClass) {
        Assert.notNull(info, "info must not null");
        Assert.notNull(beanClass, "beanClass must not null");
        E e = null;
        try {
            e = beanClass.newInstance();
        } catch (Exception exception) {
            log.error("初始化对象异常，e：{}", exception);
            throw new IllegalArgumentException(exception.getMessage());
        }
        Assert.notNull(e, "e must not null");
        BeanUtils.copyProperties(info, e);
        return e;
    }
}
