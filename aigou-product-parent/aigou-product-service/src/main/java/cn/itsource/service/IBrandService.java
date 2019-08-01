package cn.itsource.service;

import cn.itsource.PageList;
import cn.itsource.domain.Brand;
import cn.itsource.query.BrandQuery;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 品牌信息 服务类
 * </p>
 *
 * @author Tommy 
 * @since 2019-07-31
 */
public interface IBrandService extends IService<Brand> {

    /*
    * 关联查询
    *
    * */
    PageList<Brand> queryPage(BrandQuery query);


}
