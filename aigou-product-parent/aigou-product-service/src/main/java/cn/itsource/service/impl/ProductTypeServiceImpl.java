package cn.itsource.service.impl;

import cn.itsource.domain.ProductType;
import cn.itsource.mapper.ProductTypeMapper;
import cn.itsource.service.IProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品目录 服务实现类
 * </p>
 *
 * @author Tommy 
 * @since 2019-07-31
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

    @Override
    public List<ProductType> addType() {
        //获取所有的productType
        List<ProductType> productTypes = baseMapper.selectList(null);
        //定义一个list集合来装一级菜单
        List<ProductType> list = new ArrayList<>();
        //定义一个map集合来装ProductType
        Map<Long,ProductType> map = new HashMap<>();
        for (ProductType pt : productTypes) {
            map.put(pt.getId(),pt);
        }
        //循环
        for (ProductType productType : productTypes) {
            if(productType.getPid()==0){
                list.add(productType);
            }else{
                ProductType parent = map.get(productType.getPid());
                parent.getChildren().add(productType);
            }
        }
        return list;
    }
}
