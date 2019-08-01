package cn.itsource.service.impl;

import cn.itsource.PageList;
import cn.itsource.domain.Brand;
import cn.itsource.mapper.BrandMapper;
import cn.itsource.query.BrandQuery;
import cn.itsource.service.IBrandService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 品牌信息 服务实现类
 * </p>
 *
 * @author Tommy 
 * @since 2019-07-31
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

    /*
    * 分页查询
    * */
    @Override
    //当前有事务在，则加入到当前事务中，当前没有事务，以非事务方式执行
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    public PageList<Brand> queryPage(BrandQuery query){
        //查询出总的页数和总的数据，在返回给前端
        Page<Brand> page = new Page<>(query.getPageNum(),query.getPageSize());
        IPage<Brand> brandIPage = baseMapper.queryPage(page, query);

        //把数据封装到pageList中
        return new PageList<>(brandIPage.getTotal(),brandIPage.getRecords());
    }
}
