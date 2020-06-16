package com.zlt.service;

import com.zlt.bean.CodeMsgBean;
import com.zlt.entity.ProductEntity;
import com.zlt.exception.BusinessException;
import com.zlt.mapper.ProductMapper;
import com.zlt.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhanglitao
 * @create 2020/6/15 11:18
 * @desc
 */
@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    public List<ProductVO> findProductByPage(int currentPage, int pageSize) {
        try {
            List<ProductEntity> productEntityList = productMapper.findProductByPage((currentPage - 1) * pageSize, pageSize);
            return productEntityToVO(productEntityList);
        }catch (Exception e){
            log.error("productMapper.findProductByPage is exception，currentPage=%s,pageSize=%s" ,currentPage,pageSize,e);
        }
        throw new BusinessException(CodeMsgBean.SERVER_ERROR);
    }

    /**
     * 将
     * @param productEntityList
     * @return
     */
    private List<ProductVO> productEntityToVO(List<ProductEntity> productEntityList) {
        if(CollectionUtils.isEmpty(productEntityList)){
            return Collections.emptyList();
        }

        //创建vo的集合对象
        List<ProductVO> productVOList = new ArrayList<>();

        for (ProductEntity productEntity : productEntityList) {
            ProductVO productVO = new ProductVO();
            productVO.setPid(productEntity.getPid());
            productVO.setPname(productEntity.getPname());
            productVO.setMarket_price(productEntity.getMarket_price());
            productVO.setShop_price(productEntity.getShop_price());
            productVO.setPimage(productEntity.getPimage());
            productVO.setPdate(productEntity.getPdate());
            productVO.setIs_hot(productEntity.getIs_hot());
            productVO.setPdesc(productEntity.getPdesc());
            productVO.setPflag(productEntity.getPflag());
            productVO.setCid(productEntity.getCid());
            productVOList.add(productVO);
        }

        return productVOList;
    }
}
