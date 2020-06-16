package com.zlt.service;

import com.zlt.bean.CodeMsgBean;
import com.zlt.entity.CategoryEntity;
import com.zlt.exception.BusinessException;
import com.zlt.mapper.CategoryMapper;
import com.zlt.vo.CategoryVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/16 20:04
 * @desc
 */
@Service
@Slf4j
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 查找所有标签
     * @return
     */
    public List<CategoryVO> findAll() {
        try {
            List<CategoryEntity> categoryEntityList = categoryMapper.findAll();
            return categoryEntityToVO(categoryEntityList);
        }catch (Exception e){
            log.error("categoryMapper.findAll is exception" ,e);
        }
        throw new BusinessException(CodeMsgBean.SERVER_ERROR);
    }

    /**
     * 将entity集合转化为vo集合对象
     * @param categoryEntityList
     * @return
     */
    private List<CategoryVO> categoryEntityToVO(List<CategoryEntity> categoryEntityList) {
        if(CollectionUtils.isEmpty(categoryEntityList)){
            return Collections.emptyList();
        }

        //创建VO集合
        List<CategoryVO> categoryVOList = new ArrayList<>();

        //循环得到的entity集合
        for (CategoryEntity categoryEntity : categoryEntityList) {
            //创建VO对象
            CategoryVO categoryVO = new CategoryVO();
            categoryVO.setCid(categoryEntity.getCid());
            categoryVO.setCname(categoryEntity.getCname());
            categoryVOList.add(categoryVO);
        }
        return categoryVOList;
    }
}
